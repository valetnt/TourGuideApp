package com.example.android.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_city_name));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<LocationListItem> locations = new ArrayList<>();
        locations.add(new LocationListItem(
                "Palazzo della Ragione",
                "P.zza delle Erbe, Padova",
                "Winter", "9.00 - 18.00",
                "Summer", "9.00 - 19.00",
                "Closed on Mondays",
                "Tel. 049 8205006",
                "http://www.padovanet.it/informazione/palazzo-della-ragione",
                R.drawable.palazzo_ragione,
                "http://www.google.com/maps/place/Palazzo+della+Ragione/@45.4071578,11.8750092,18.71z/"));

        locations.add(new LocationListItem(
                "Loggia e Odeo Cornaro",
                "Via Cesarotti, Padova",
                "Tue - Wed", "10.00 - 13.00",
                "Sat, Sun", "10.00 - 13.00, 16.00 - 19.00",
                "Closed on Mondays, Dec 25-26, Jan 1, May 1, Aug 15",
                "Tel. 335 1428861",
                "http://www.latorlonga.it/loggia-e-odeo-cornaro/",
                R.drawable.loggia_cornaro,
                "http://www.google.com/maps/place/Loggia+e+Odeo+Cornaro/@45.4022071,11.8811006,16.88z/"));

        locations.add(new LocationListItem(
                "Dondi Clock Tower",
                "P.zza dei Signori, Padova",
                "Individuals", "Fri, Sat 9.30 - 11.45",
                "Groups", "Wed, Fri, Sat 9.30 - 11.45",
                "No access fees, reservations on site.",
                "Tel. 392 4764353",
                "http://www.padovanet.it/informazione/visite-guidate-alla-torre-e-allorologio-astrario-di-piazza-dei-signori",
                R.drawable.dondi_orologio,
                "http://www.google.com/maps/place/Piazza+dei+Signori/@45.4076189,11.8729931,19.21z/"));

        locations.add(new LocationListItem(
                "Cathedral and Baptistery",
                "P.zza Duomo, Padova",
                "Every day", "10.00 - 18.00",
                "Groups", "booking is recommended",
                "Closed on Dec 25, Jan 1, Easter",
                "Tel. 392 656914",
                "http://www.epadova.com/visitare-padova/chiese/duomo-battistero.htm",
                R.drawable.duomo_battistero,
                "http://www.google.com/maps/place/Piazza+Duomo,+Padova+PD,+Italia/@45.4066827,11.8702959,17z/"));

        locations.add(new LocationListItem(
                "Teatro Verdi",
                "Via dei Livello, Padova",
                "See website for season schedule", "",
                "Box office normally open in the afternoon", "",
                "",
                "Tel. 049 87770213",
                "http://www.teatrostabileveneto.it/",
                R.drawable.verdi,
                "http://www.google.com/maps/place/Teatro+Stabile+del+Veneto+-+Teatro+Verdi/@45.4084086,11.8697294,16.91z/"));

        locations.add(new LocationListItem(
                "Basilica di Santa Giustina",
                "Via G. Ferrari, Padova",
                "Summer", "7.30 - 12.00, 15.00 - 20.00",
                "Winter", "8.00 - 12.00, 15.00 - 20.00",
                "The church is open every day of the year.",
                "For contacts see website",
                "http://www.abbaziasantagiustina.org",
                R.drawable.santa_giustina,
                "http://www.google.com/maps/place/Abbazia+di+Santa+Giustina/@45.396337,11.8754936,16z/"));

        locations.add(new LocationListItem(
                "Basilica di Sant'Antonio",
                "P.zza del Santo, Padova",
                "Mon - Fri", "6.20 - 18.45",
                "Sat - Sun", "6.20 - 19.45",
                "The church is open every day of the year.",
                "Tel. 049 8225652",
                "http://www.santantonio.org/it/basilica",
                R.drawable.santantonio,
                "http://www.google.com/maps/place/Basilica+di+Sant'Antonio+di+Padova/@45.3995259,11.8794213,16z/"));

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
