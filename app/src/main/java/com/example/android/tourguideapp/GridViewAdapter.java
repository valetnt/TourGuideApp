package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridViewAdapter extends ArrayAdapter<GridItem>{

    public GridViewAdapter(Context context, List<GridItem> objects) {
        // We don't care about the resource argument, because we are going to
        // customize the adapter (see method getView below) by inflating a
        // custom layout
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        // Get the item at the current position of the adapter
        GridItem currentItem = getItem(position);

        // Fill the views with the appropriate contents
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        nameTextView.setText(currentItem.getTitle());
        imageView.setImageResource(currentItem.getImageResID());

        return listItemView;
    }

}
