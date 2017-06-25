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


public class EatingPlacesListAdapter extends ArrayAdapter<EatingPlacesListItem> {

    public EatingPlacesListAdapter(@NonNull Context context,
                                   @NonNull List<EatingPlacesListItem> objects) {
        // We pass 0 as resource ID because we are going to inflate a custom layout
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // If the view already exists, then recycle it
        // Else, inflate the layout from file "itinerary_item.xml
        View rootView = convertView;
        if (rootView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.eating_place_item, parent,
                    false);
        }

        EatingPlacesListItem currentItem = getItem(position);

        TextView name = (TextView) rootView.findViewById(R.id.name);
        ImageView image = (ImageView) rootView.findViewById(R.id.image);
        TextView details = (TextView) rootView.findViewById(R.id.details);
        TextView address = (TextView) rootView.findViewById(R.id.address);
        TextView furtherDetails = (TextView) rootView.findViewById(R.id.further_details);
        TextView contact1 = (TextView) rootView.findViewById(R.id.contact_1);
        TextView contact2 = (TextView) rootView.findViewById(R.id.contact_2);

        name.setText(currentItem.getName());
        image.setImageResource(currentItem.getImageID());
        details.setText(currentItem.getDetails());
        address.setText(currentItem.getAddress());
        furtherDetails.setText(currentItem.getFurtherDetails());
        contact1.setText(currentItem.getContact1());
        contact2.setText(currentItem.getContact2());

        return rootView;
    }
}

