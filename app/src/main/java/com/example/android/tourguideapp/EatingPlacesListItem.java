package com.example.android.tourguideapp;


public class EatingPlacesListItem {

    private String mName;
    private String mDetails;
    private String mAddress;
    private String mFurtherDetails;
    private String mContact1;
    private String mContact2;
    private int mImageID;

    public EatingPlacesListItem(String name, String address, String details, String furtherDetails,
                                String contact1, String contact2, int image) {

        mName = name;
        mDetails = details;
        mAddress = address;
        mFurtherDetails = furtherDetails;
        mContact1 = contact1;
        mContact2 = contact2;
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

    public String getContact1() {
        return mContact1;
    }

    public String getContact2() {
        return mContact2;
    }

    public int getImageID() {
        return mImageID;
    }

}
