package com.example.chatmessage.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatmessage.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StartActivity extends AppCompatActivity {

    private Button mLoginBtn;
    private Button mRegBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mRegBtn = findViewById(R.id.start_reg_btn);

        mRegBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent regIntent = new Intent(StartActivity.this,RegisterActivity.class);
                startActivity(regIntent);
            }
        });

        mLoginBtn = findViewById(R.id.start_login_btn);

        mLoginBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent loginIntent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if(firebaseUser!=null){
            Intent intent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
