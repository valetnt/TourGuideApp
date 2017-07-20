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
        locations.add(new SightseeingPlacesListItem(
                "Prato della Valle",
                "Prato della Valle, Padova",
                "One of the largest squares in Europe, it was commissioned by the venetian " +
                        "superintendent Andrea Memmo in 1775 upon a reclaimed marshland, " +
                        "following a project that Memmo himself, amateur architect, had designed.",
                "The square hosts several festivals in spring and summer and open-air markets on " +
                        "Saturdays.",
                R.drawable.prato_della_valle,
                "http://www.google.com/maps/place/Prato+della+Valle/@45.3984679,11.8743365,17z/"));

        locations.add(new SightseeingPlacesListItem(
                "Piazza delle Erbe",
                "P.zza delle Erbe, Padova",
                "It is one of the two squares surrounding Palazzo della Ragione.",
                "One of main meeting points for the local youth, " +
                        "it hosts open-air markets every day and a Christmas market.",
                R.drawable.piazza_erbe,
                "http://www.google.com/maps/place/Pam+local+Piazza+delle+Erbe/@45.4067902,11.8741515,18z/"));

        locations.add(new SightseeingPlacesListItem(
                "Piazza della Frutta",
                "P.zza della Frutta, Padova",
                "It is one of the two squares surrounding Palazzo della Ragione.",
                "It hosts open-air markets every day and a Christmas market.",
                R.drawable.piazza_frutta,
                "http://www.google.com/maps/place/Piazza+della+Frutta/@45.4076459,11.8732533,17z/"));

        locations.add(new SightseeingPlacesListItem(
                "Giardini dell'Arena",
                "Corso Garibaldi, Padova",
                "The garden is built on the inner side of the city medieval walls, and is" +
                        " surrounded by Piovego canal.",
                "The garden also hosts the Scrovegni Chapel and the ruins of a Roman arena.",
                R.drawable.giardini_arena,
                "http://www.google.com/maps/place/Giardini+dell'Arena/@45.4123686,11.8777603,17z/"));

        locations.add(new SightseeingPlacesListItem(
                "Piazza dei Signori",
                "P.zza dei Signori, Padova",
                "In the 14th century, the Venetians restored the square to be the fifth main civic" +
                        "area for tournament play, concerts and music festivals.",
                "The square is dominated by the famous Clock Tower.",
                R.drawable.piazza_signori,
                "http://www.google.com/maps/place/Piazza+dei+Signori/@45.4078463,11.8713521,17z/"));

        locations.add(new SightseeingPlacesListItem(
                "Gattamelata monument",
                "P.zza del Santo, Padova",
                "Equestrian statue made by Donatello between 1447 and 1453 as a funeral monument " +
                        "for the Reinsassance 'condottiero' Erasmo of Narni.",
                "At the time it was the biggest sculpture made since the ancient Roman times.",
                R.drawable.gattamelata,
                "http://www.google.com/maps/place/Piazza+del+Santo,+35123+Padova+PD,+Italia/@45.401316,11.8779541,17z/"));

        locations.add(new SightseeingPlacesListItem(
                "Tomba di Antenore",
                "P.zza Antenore, Padova",
                "Built in the Middle Ages to host what were believed to be the remains of Antenore," +
                        " the legendary founder of the city of Padua.",
                "The smaller monument is that of Lovato Lovati, who made the attribution in 1274.",
                R.drawable.tomba_antenore,
                "http://www.google.com/maps/place/Piazza+Antenore,+35123+Padova+PD,+Italia/@45.4058281,11.8760423,17z/"));

        locations.add(new SightseeingPlacesListItem(
                "Ancient Jewish Ghetto",
                "Around via Marsala, Padova",
                "Atmospheric corner of the city center, with its tall houses, narrow streets " +
                        "and typical taverns. It hosted the Jews of Padua between 1603 and 1797.",
                "The 16th century synagogue is visitable on demand.",
                R.drawable.ghetto,
                "http://www.google.com/maps/place/Museo+della+Padova+Ebraica/@45.4060828,11.8737142,17z/"));

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
