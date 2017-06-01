package com.example.android.tourguideapp;

import android.support.annotation.Nullable;

public class LocationListItem {

    private String mName;
    private String mOpeningsHeader1;
    private String mOpeningsContent1;
    private String mOpeningsHeader2;
    private String mOpeningsContent2;
    private String mFurtherDetails;
    private int mImageID;

    public LocationListItem(String name, String openings_header_1, String openings_content_1,
                            String openings_header_2, String openings_content_2,
                            @Nullable String furtherDetails, int image) {

        mName = name;
        mOpeningsHeader1 = openings_header_1;
        mOpeningsContent1 = openings_content_1;
        mOpeningsHeader2 = openings_header_2;
        mOpeningsContent2 = openings_content_2;
        mFurtherDetails = furtherDetails;
        mImageID = image;
    }

    public String getName() {
        return mName;
    }

    public String getDetailsHeader1() {
        return mOpeningsHeader1;
    }

    public String getDetailsHeader2() {
        return mOpeningsHeader2;
    }

    public String getDetailsContent1() {
        return mOpeningsContent1;
    }

    public String getDetailsContent2() {
        return mOpeningsContent2;
    }

    public String getFurtherDetails() {
        if(mFurtherDetails==null){
            return "";
        }
        return mFurtherDetails;
    }

    public int getImageID() {
        return mImageID;
    }

}
