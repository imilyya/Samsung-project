package com.example.roomie.item;

import android.provider.ContactsContract;
import android.widget.ImageView;

public class ChatItem {
    private String name;
//    private ImageView profilePicture;

    public ChatItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ImageView getProfilePicture() {
//        return profilePicture;
//    }

//    public void setProfilePicture(ImageView profilePicture) {
//        this.profilePicture = profilePicture;
//    }
}
