package com.example.android.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class VillasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_main_list_txt_item2));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<LocationListItem> locations = new ArrayList<>();
        locations.add(new LocationListItem("Castello di Monselice",
                "via del Castello, Monselice (PD)", "Apr. - Sept.",
                "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30", "Closed on 25th Dec., 1st Jan.",
                "Tel. 049 691760", "www.padovanet.info.com", R.drawable.castello_monselice));

        locations.add(new LocationListItem("Castello di Monselice",
                "via del Castello, Monselice (PD)", "Apr. - Sept.",
                "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30", "Closed on 25th Dec., 1st Jan.",
                "Tel. 049 691760", "www.padovanet.info.com", R.drawable.castello_monselice));

        locations.add(new LocationListItem("Castello di Monselice",
                "via del Castello, Monselice (PD)", "Apr. - Sept.",
                "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30", "Closed on 25th Dec., 1st Jan.",
                "Tel. 049 691760", "www.padovanet.info.com", R.drawable.castello_monselice));

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