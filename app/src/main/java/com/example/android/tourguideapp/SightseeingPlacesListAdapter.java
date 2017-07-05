package com.example.android.tourguideapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class SightseeingPlacesListAdapter extends ArrayAdapter<SightseeingPlacesListItem> {

    public SightseeingPlacesListAdapter(@NonNull Context context,
                                        @NonNull List<SightseeingPlacesListItem> objects) {
        // We pass 0 as resource ID because we are going to inflate a custom layout
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // If the view already exists, then recycle it
        // Else, inflate the layout
        View rootView = convertView;
        if (rootView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.sightseeing_place_item,
                    parent, false);
        }

        SightseeingPlacesListItem currentItem = getItem(position);

        TextView name = (TextView) rootView.findViewById(R.id.name);
        ImageView image = (ImageView) rootView.findViewById(R.id.image);
        TextView details = (TextView) rootView.findViewById(R.id.details);
        TextView address = (TextView) rootView.findViewById(R.id.address);
        TextView furtherDetails = (TextView) rootView.findViewById(R.id.further_details);

        name.setText(currentItem.getName());
        image.setImageResource(currentItem.getImageID());
        details.setText(currentItem.getDetails());
        address.setText(currentItem.getAddress());
        furtherDetails.setText(currentItem.getFurtherDetails());

        return rootView;
    }
}

