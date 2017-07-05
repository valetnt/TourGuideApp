package com.example.android.tourguideapp;


public class SightseeingPlacesListItem {

    private String mName;
    private String mDetails;
    private String mAddress;
    private String mFurtherDetails;
    private int mImageID;

    public SightseeingPlacesListItem(String name, String address, String details,
                                     String furtherDetails, int image) {

        mName = name;
        mDetails = details;
        mAddress = address;
        mFurtherDetails = furtherDetails;
        mImageID = image;
    }

    public String getName() {
        return mName;
    }

    public String getDetails() {
        return mDetails;
    }

    public String getAddress() {
        return mAddress;
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
