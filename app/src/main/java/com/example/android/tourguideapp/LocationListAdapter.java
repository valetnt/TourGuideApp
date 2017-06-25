package com.example.android.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationListAdapter extends RecyclerView.Adapter<LocationListAdapter.ViewHolder> {

    private ArrayList<LocationListItem> mLocations;

    public LocationListAdapter(ArrayList<LocationListItem> locations) {
        mLocations = locations;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mName;
        private TextView mAddress;
        private TextView mOpenings_header_1;
        private TextView mOpenings_content_1;
        private TextView mOpenings_header_2;
        private TextView mOpenings_content_2;
        private TextView mFurtherDetails;
        private TextView mContact_1;
        private TextView mContact_2;
        private ImageView mImage;

        public ViewHolder(View layoutView) {
            super(layoutView);
            mName = (TextView) layoutView.findViewById(R.id.name);
            mAddress = (TextView) layoutView.findViewById(R.id.address);
            mOpenings_header_1 = (TextView) layoutView.findViewById(R.id.openings_header_1);
            mOpenings_content_1 = (TextView) layoutView.findViewById(R.id.openings_content_1);
            mOpenings_header_2 = (TextView) layoutView.findViewById(R.id.openings_header_2);
            mOpenings_content_2 = (TextView) layoutView.findViewById(R.id.openings_content_2);
            mFurtherDetails = (TextView) layoutView.findViewById(R.id.further_details);
            mContact_1 = (TextView) layoutView.findViewById(R.id.contact_1);
            mContact_2 = (TextView) layoutView.findViewById(R.id.contact_2);
            mImage = (ImageView) layoutView.findViewById(R.id.image);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.location_item,
                parent, false);
        ViewHolder viewHolder = new ViewHolder(layoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mName.setText(mLocations.get(position).getName());
        holder.mAddress.setText(mLocations.get(position).getAddress());
        holder.mOpenings_header_1.setText(mLocations.get(position).getOpeningsHeader1());
        holder.mOpenings_content_1.setText(mLocations.get(position).getOpeningsContent1());
        holder.mOpenings_header_2.setText(mLocations.get(position).getOpeningsHeader2());
        holder.mOpenings_content_2.setText(mLocations.get(position).getOpeningsContent2());
        holder.mFurtherDetails.setText(mLocations.get(position).getFurtherDetails());
        holder.mContact_1.setText(mLocations.get(position).getContact1());
        holder.mContact_2.setText(mLocations.get(position).getContact2());
        holder.mImage.setImageResource(mLocations.get(position).getImageID());
    }

    @Override
    public int getItemCount() {
        return mLocations.size();
    }
}
