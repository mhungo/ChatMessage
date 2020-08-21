package com.example.chatmessage.Service;



import com.example.chatmessage.Notifications.MyResponse;
import com.example.chatmessage.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAY8a9dgQ:APA91bFbw6tyG2kDwe1zKav6iMb5fCnkVgqfZ3WwkZ5X4GD_7JrrPrS2tvOdM7CK-nxC3IbZoxrMiawJoj6mn6VZaW4glKxl3qRtZmCV9vrMAi0tYQFTH3cGeS3jLf92yov3VmZZNmBY"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotifications(@Body Sender body);
}
