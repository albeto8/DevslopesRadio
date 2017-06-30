package com.example.mariobarragan.devslopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mariobarragan.devslopesradio.R;
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
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {
        Station station = stations.get(position);
        holder.updateUI(station);

    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
