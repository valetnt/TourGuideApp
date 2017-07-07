package com.example.android.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SightseeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_sightseeing_name));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<SightseeingPlacesListItem> locations = new ArrayList<>();
        locations.add(new SightseeingPlacesListItem("Prato della Valle", "Prato della Valle, Padova",
                "The second biggest square in Europe.",
                "Hosts several festivals in spring and summer and a Christmas market.",
                R.drawable.prato_della_valle));

        locations.add(new SightseeingPlacesListItem("Piazza delle Erbe", "P.zza delle Erbe, Padova",
                "Faces Palazzo della Ragione.",
                "Hosts a fruit and vegetable market every day",
                R.drawable.piazza_erbe));

        locations.add(new SightseeingPlacesListItem("Piazza della Frutta", "P.zza della Frutta, Padova",
                "Faces Palazzo della Ragione on the other side with respect to Piazza delle Erbe." +
                        " It is connected to the other piazza by two lateral accesses.",
                "Hosts a common goods market every day",
                R.drawable.piazza_frutta));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false));
        recyclerView.setAdapter(new SightseeingPlacesListAdapter(locations));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation()));
    }
}
