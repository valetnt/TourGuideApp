package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<GridItem> gridItems = new ArrayList<>();
        gridItems.add(new GridItem("Itineraries", R.mipmap.ic_launcher));
        gridItems.add(new GridItem("Museums", R.mipmap.ic_launcher));
        gridItems.add(new GridItem("Historical Buildings", R.mipmap.ic_launcher));
        gridItems.add(new GridItem("Cultural Venues", R.mipmap.ic_launcher));
        gridItems.add(new GridItem("Food & Drink", R.mipmap.ic_launcher));
        gridItems.add(new GridItem("Annual Events", R.mipmap.ic_launcher));

        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(new GridViewAdapter(this, gridItems));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(((GridItem) parent.getAdapter().getItem(position)).getTitle()
                        .equals("Historical Buildings")) {

                    Intent intent = new Intent(view.getContext(), ListByCategoryActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
