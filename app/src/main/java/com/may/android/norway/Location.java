package com.may.android.norway;

/**
 * Created by Henrik on 30.05.2017.
 */

public class Location {
    private int imageID;
    private String description;
    private String name;
    private boolean hasImage;
    private String geoLocation;

    public Location(String mName, String mSites, int mImageID, String mgeoLoc) {
        name = mName;
        description = mSites;
        imageID = mImageID;
        hasImage=true;
        geoLocation=mgeoLoc;
    }

    public Location(String mName, String mSites) {
        name = mName;
        description = mSites;
        hasImage=false;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getImageID() {return imageID;}
    public boolean getHasImage() {return hasImage;}
    public String getGeoLocation() {return geoLocation;}


}

