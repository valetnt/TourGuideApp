package com.example.android.tourguideapp;

public class AttractionsListItem {

    // Name of the attraction
    private String mName;
    // Short description of the attraction
    private String mCaption;
    // Resource ID for the thumbnail image
    private int mImageResID;

    // Constructor
    public AttractionsListItem (String name, String caption, int imageID) {
        mName = name;
        mCaption = caption;
        mImageResID = imageID;
    }

    /*
     *  Methods
     */

    public String getName () {
        return mName;
    }

    public String getCaption () {
        return mCaption;
    }

    public int getImageResID () {
        return mImageResID;
    }
}
