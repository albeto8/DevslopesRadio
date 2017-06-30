package com.example.mariobarragan.devslopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.mariobarragan.devslopesradio.holders.StationViewHolder;
import com.example.mariobarragan.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by mariobarragan on 6/29/17.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
