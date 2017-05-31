package com.example.android.tourguideapp;

import android.support.annotation.Nullable;

public class ItineraryListItem {

    private String mName;
    private String mDetails;
    private String mDetailsHeader1;
    private String mDetailsContent1;
    private String mDetailsHeader2;
    private String mDetailsContent2;
    private String mFurtherDetails;
    private String mToSee;
    private String mToSeeContent;
    private int mImageID;
    private int mIcon1ID = -1;
    private int mIcon2ID = -1;

    public ItineraryListItem(String name, String header, String header1, String content1,
                             String header2, String content2, @Nullable String furtherDetails,
                             String toSee, String toSeeContent, int image) {

        mName = name;
        mDetails = header;
        mDetailsHeader1 = header1;
        mDetailsContent1 = content1;
        mDetailsHeader2 = header2;
        mDetailsContent2 = content2;
        mFurtherDetails = furtherDetails;
        mToSee = toSee;
        mToSeeContent = toSeeContent;
        mImageID = image;
    }

    public ItineraryListItem(String name, String header, String header1, String content1,
                             String header2, String content2, @Nullable String furtherDetails,
                             String toSee, String toSeeContent, int image, int icon1) {

        mName = name;
        mDetails = header;
        mDetailsHeader1 = header1;
        mDetailsContent1 = content1;
        mDetailsHeader2 = header2;
        mDetailsContent2 = content2;
        mFurtherDetails = furtherDetails;
        mToSee = toSee;
        mToSeeContent = toSeeContent;
        mImageID = image;
        mIcon1ID = icon1;
    }

    public ItineraryListItem(String name, String header, String header1, String content1,
                             String header2, String content2, @Nullable String furtherDetails,
                             String toSee, String toSeeContent, int image, int icon1, int icon2) {

        mName = name;
        mDetails = header;
        mDetailsHeader1 = header1;
        mDetailsContent1 = content1;
        mDetailsHeader2 = header2;
        mDetailsContent2 = content2;
        mFurtherDetails = furtherDetails;
        mToSee = toSee;
        mToSeeContent = toSeeContent;
        mImageID = image;
        mIcon1ID = icon1;
        mIcon2ID = icon2;
    }

    public String getName() {
        return mName;
    }

    public String getDetails() {
        return mDetails;
    }

    public String getDetailsHeader1() {
        return mDetailsHeader1;
    }

    public String getDetailsHeader2() {
        return mDetailsHeader2;
    }

    public String getDetailsContent1() {
        return mDetailsContent1;
    }

    public String getDetailsContent2() {
        return mDetailsContent2;
    }

    public String getFurtherDetails() {
        if(mFurtherDetails==null){
            return "";
        }
        return mFurtherDetails;
    }

    public String getToSee() {
        return mToSee;
    }

    public String getToSeeContent() {
        return mToSeeContent;
    }

    public int getImageID() {
        return mImageID;
    }

    public int getIcon1ID() {
        return mIcon1ID;
    }

    public int getIcon2ID() {
        return mIcon2ID;
    }
}
