package com.example.tourguideapp;

public class Location {
    private String mLocationName;

    private int mLocationImage;

    private String mLocationDetails;

    public Location(String locationName, int locationImage, String locationDetails) {
        mLocationName = locationName;

        mLocationImage = locationImage;

        mLocationDetails = locationDetails;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public int getmLocationImage() {
        return mLocationImage;
    }

    public String getmLocationDetails() {
        return mLocationDetails;
    }
}
