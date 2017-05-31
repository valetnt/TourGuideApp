package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItineraryListAdapter extends ArrayAdapter<ItineraryListItem> {

    public ItineraryListAdapter(@NonNull Context context, @NonNull List<ItineraryListItem> objects) {
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
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.itinerary_item, parent,
                    false);
        }

        ItineraryListItem currentItem = getItem(position);

        TextView name = (TextView) rootView.findViewById(R.id.name);
        ImageView image = (ImageView) rootView.findViewById(R.id.image);
        ImageView icon1 = (ImageView) rootView.findViewById(R.id.icon1);
        ImageView icon2 = (ImageView) rootView.findViewById(R.id.icon2);
        TextView details = (TextView) rootView.findViewById(R.id.details_header);
        TextView details_header1 = (TextView) rootView.findViewById(R.id.details_header_1);
        TextView details_content1 = (TextView) rootView.findViewById(R.id.details_content_1);
        TextView details_header2 = (TextView) rootView.findViewById(R.id.details_header_2);
        TextView details_content2 = (TextView) rootView.findViewById(R.id.details_content_2);
        TextView furtherDetails = (TextView) rootView.findViewById(R.id.further_details);
        TextView interesting_header = (TextView) rootView.findViewById(R.id.interesting_to_see);
        TextView interesting_content = (TextView) rootView.findViewById(R.id.interesting_to_see_details);

        name.setText(currentItem.getName());
        image.setImageResource(currentItem.getImageID());
        details.setText(currentItem.getDetails());
        details_header1.setText(currentItem.getDetailsHeader1());
        details_header2.setText(currentItem.getDetailsHeader2());
        details_content1.setText(currentItem.getDetailsContent1());
        details_content2.setText(currentItem.getDetailsContent2());
        furtherDetails.setText(currentItem.getFurtherDetails());
        interesting_header.setText(currentItem.getToSee());
        interesting_content.setText(currentItem.getToSeeContent());

        if (currentItem.getIcon1ID() == -1) {
            ((View) icon1.getParent()).setVisibility(View.GONE);
        } else {
            ((View) icon1.getParent()).setVisibility(View.VISIBLE);
            icon1.setImageResource(currentItem.getIcon1ID());
        }

        if (currentItem.getIcon2ID() == -1) {
            ((View) icon2.getParent()).setVisibility(View.GONE);
        } else {
            ((View) icon2.getParent()).setVisibility(View.VISIBLE);
            icon2.setImageResource(currentItem.getIcon2ID());
        }

        return rootView;
    }
}
