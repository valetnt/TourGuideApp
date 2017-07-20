package com.example.android.tourguideapp;

public class LocationListItem {

    private String mName;
    private String mAddress;
    private String mOpeningsHeader1;
    private String mOpeningsContent1;
    private String mOpeningsHeader2;
    private String mOpeningsContent2;
    private String mFurtherDetails;
    private String mContact1;
    private String mContact2;
    private int mImageID;
    private String mMapsLink;

    public LocationListItem(String name, String address, String openings_header_1,
                            String openings_content_1, String openings_header_2,
                            String openings_content_2, String furtherDetails, String contact_1,
                            String contact_2, int image, String link) {

        mName = name;
        mAddress = address;
        mOpeningsHeader1 = openings_header_1;
        mOpeningsContent1 = openings_content_1;
        mOpeningsHeader2 = openings_header_2;
        mOpeningsContent2 = openings_content_2;
        mContact1 = contact_1;
        mContact2 = contact_2;
        mFurtherDetails = furtherDetails;
        mImageID = image;
        mMapsLink = link;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
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

    public String getMapsLink() { return mMapsLink; }

}
