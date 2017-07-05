package com.example.android.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_main_list_txt_item3));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<LocationListItem> locations = new ArrayList<>();
        locations.add(new LocationListItem("Museo degli Eremitani", "P.zza degli Eremitani, Padova",
                "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760", "www.padovanet.info.com",
                R.drawable.museo_eremitani));

        locations.add(new LocationListItem("Cappella degli Scrovegni", "P.zza degli Eremitani, Padova",
                "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760", "www.padovanet.info.com",
                R.drawable.activity_main_list_item3));

        locations.add(new LocationListItem("Casa-museo del Petrarca", "Arqua' Petrarca (PD)",
                "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760", "www.padovanet.info.com",
                R.drawable.casa_museo_petrarca));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false));
        recyclerView.setAdapter(new LocationListAdapter(locations));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation()));
    }
}
