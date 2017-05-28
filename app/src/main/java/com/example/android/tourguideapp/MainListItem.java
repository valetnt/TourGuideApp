package com.example.android.tourguideapp;


public class MainListItem {

    private int mImageID;
    private String mText;

    public MainListItem(int imageID, String text) {

        mImageID = imageID;
        mText = text;
    }

    public int getImageID() {
        return mImageID;
    }

    public String getText() {
        return mText;
    }
}
