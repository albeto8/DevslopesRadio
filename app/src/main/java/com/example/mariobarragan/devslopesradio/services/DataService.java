package com.example.mariobarragan.devslopesradio.services;

import com.example.mariobarragan.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by mariobarragan on 6/30/17.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for travel)", "flightplanmusic"));
        list.add(new Station("Flight Plan (Tunes for travel)", "bicyclemusic"));
        list.add(new Station("Flight Plan (Tunes for travel)", "kidsmusic"));
        return  list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        return  list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        return  list;
    }
}
