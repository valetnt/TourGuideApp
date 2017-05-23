package com.example.android.tourguideapp;

public class GridItem {

    // Title
    private String mTitle;
    // Resource ID for the thumbnail image
    private int mImageResID;

    // Constructor
    public GridItem (String title, int imageID) {
        mTitle = title;
        mImageResID = imageID;
    }

    /*
     *  Methods
     */

    public String getTitle () {
        return mTitle;
    }

    public int getImageResID () {
        return mImageResID;
    }
}
