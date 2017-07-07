package com.example.android.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SightseeingPlacesListAdapter extends
        RecyclerView.Adapter<SightseeingPlacesListAdapter.ViewHolder> {

    private ArrayList<SightseeingPlacesListItem> mLocations;

    public SightseeingPlacesListAdapter(ArrayList<SightseeingPlacesListItem> locations) {
        mLocations = locations;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mName;
        private TextView mAddress;
        private TextView mDetails;
        private TextView mFurtherDetails;
        private ImageView mImage;

        public ViewHolder(View layoutView) {
            super(layoutView);
            mName = (TextView) layoutView.findViewById(R.id.name);
            mAddress = (TextView) layoutView.findViewById(R.id.address);
            mDetails = (TextView) layoutView.findViewById(R.id.details);
            mFurtherDetails = (TextView) layoutView.findViewById(R.id.further_details);
            mImage = (ImageView) layoutView.findViewById(R.id.image);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sightseeing_place_item,
                parent, false);
        ViewHolder viewHolder = new ViewHolder(layoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mName.setText(mLocations.get(position).getName());
        holder.mAddress.setText(mLocations.get(position).getAddress());
        holder.mDetails.setText(mLocations.get(position).getDetails());
        holder.mFurtherDetails.setText(mLocations.get(position).getFurtherDetails());
        holder.mImage.setImageResource(mLocations.get(position).getImageID());
    }

    @Override
    public int getItemCount() {
        return mLocations.size();
    }
}

