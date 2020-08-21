package com.example.chatmessage;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatmessage.Fragment.ChatsFragment;
import com.example.chatmessage.Fragment.FriendsFragment;
import com.example.chatmessage.Fragment.RequestsFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){


            case 0: ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1: FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;

            case 2: RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            default: return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0: return "Trò chuyện";

            case 1: return "Bạn bè";

            case 2: return "Thông báo";

            default: return null;
        }
    }
}
