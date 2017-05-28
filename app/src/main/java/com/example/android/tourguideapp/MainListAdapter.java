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

import java.util.ArrayList;

public class MainListAdapter extends ArrayAdapter<MainListItem> {

    public MainListAdapter(Context context, ArrayList<MainListItem> listItems) {
        // We pass 0 as resource ID because we are going to inflate a custom layout
        super(context, 0, listItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // If the view already exists, then recycle it
        // Else, inflate the layout from file "main_list_item.xml
        View rootView = convertView;
        if (convertView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.main_list_item,
                    parent, false);
        }

        MainListItem currentItem = getItem(position);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.categories_img);
        imageView.setImageResource(currentItem.getImageID());

        TextView textView = (TextView) rootView.findViewById(R.id.categories_txt);
        textView.setText(currentItem.getText());

        return rootView;
    }
}
