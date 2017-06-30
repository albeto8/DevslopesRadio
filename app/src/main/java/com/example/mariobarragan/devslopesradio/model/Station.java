package com.example.mariobarragan.devslopesradio.model;

/**
 * Created by mariobarragan on 6/30/17.
 */

public class Station {

    final String DRAWABLE = "drawable/";

    private String stationTitle;
    private String imageUri;

    public Station(String stationTitle, String imageUri) {
        this.stationTitle = stationTitle;
        this.imageUri = imageUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImageUri() {
        return DRAWABLE + imageUri;
    }

}
