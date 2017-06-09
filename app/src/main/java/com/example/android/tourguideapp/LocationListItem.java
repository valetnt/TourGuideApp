package com.example.android.tourguideapp;

import android.support.annotation.Nullable;

public class LocationListItem {

    private String mName;
    private String mOpeningsHeader1;
    private String mOpeningsContent1;
    private String mOpeningsHeader2;
    private String mOpeningsContent2;
    private String mFurtherDetails;
    private String mContact1;
    private String mContact2;
    private int mImageID;

    public LocationListItem(String name, String openings_header_1, String openings_content_1,
                            String openings_header_2, String openings_content_2,
                            @Nullable String furtherDetails, @Nullable String contact_1,
                            @Nullable String contact_2, int image) {

        mName = name;
        mOpeningsHeader1 = openings_header_1;
        mOpeningsContent1 = openings_content_1;
        mOpeningsHeader2 = openings_header_2;
        mOpeningsContent2 = openings_content_2;
        mContact1 = contact_1;
        mContact2 = contact_2;
        mFurtherDetails = furtherDetails;
        mImageID = image;
    }

    public String getName() {
        return mName;
    }

    public String getOpeningsHeader1() {
        return mOpeningsHeader1;
    }

    public String getOpeningsHeader2() {
        return mOpeningsHeader2;
    }

    public String getOpeningsContent1() {
        return mOpeningsContent1;
    }

    public String getOpeningsContent2() {
        return mOpeningsContent2;
    }

    public String getFurtherDetails() {
        if(mFurtherDetails==null){
            return "";
        }
        return mFurtherDetails;
    }

    public String getContact1() {
        if(mContact1==null){
            return "";
        }
        return mContact1;
    }

    public String getContact2() {
        if(mContact2==null){
            return "";
        }
        return mContact2;
    }

    public int getImageID() {
        return mImageID;
    }

}
