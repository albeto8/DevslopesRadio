package com.example.mariobarragan.devslopesradio.services;

/**
 * Created by mariobarragan on 6/30/17.
 */

public class DataSErvice {
    private static final DataSErvice ourInstance = new DataSErvice();

    public static DataSErvice getInstance() {
        return ourInstance;
    }

    private DataSErvice() {
    }
}
