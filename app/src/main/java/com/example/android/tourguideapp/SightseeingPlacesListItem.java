package com.example.android.tourguideapp;


public class SightseeingPlacesListItem {

    private String mName;
    private String mDetails;
    private String mAddress;
    private String mFurtherDetails;
    private int mImageID;
    private String mMapsLink;

    public SightseeingPlacesListItem(String name, String address, String details,
                                     String furtherDetails, int image, String link) {

        mName = name;
        mDetails = details;
        mAddress = address;
        mFurtherDetails = furtherDetails;
        mImageID = image;
        mMapsLink = link;
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

    public String getMapsLink() { return mMapsLink; }

}
