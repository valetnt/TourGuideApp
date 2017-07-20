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
        actionBar.setTitle(getString(R.string.activity_museums_name));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<LocationListItem> locations = new ArrayList<>();

        locations.add(new LocationListItem(
                "Scrovegni Chapel",
                "P.zza degli Eremitani, Padova",
                "All year", "9.00 - 19.00",
                "", "(Reservation required)",
                "Closed on Dec 25-26, Jan 1",
                "Tel. 049 2010020",
                "http://www.cappelladegliscrovegni.it",
                R.drawable.cappella_scrovegni,
                "http://www.google.com/maps/place/Cappella+degli+Scrovegni/@45.4118214,11.8773469,17z/"));

        locations.add(new LocationListItem(
                "Eremitani Museum",
                "P.zza degli Eremitani, Padova",
                "Winter", "9.00 - 18.00",
                "Summer", "9.00 - 19.00",
                "Closed on Mondays",
                "Tel. 049 8204551",
                "http://www.padovanet.it/informazione/musei-civici-agli-eremitani",
                R.drawable.museo_eremitani,
                "http://www.google.com/maps/place/Musei+Civici+Eremitani/@45.4108327,11.8777818,17z/"));

        locations.add(new LocationListItem(
                "Botanical Garden",
                "Via Orto Botanico, Padova",
                "Apr - Set", "9.00 - 19.00",
                "Oct - Mar", "9.00 - 17.00",
                "Closed on Mondays, Dec 25, Jan 1",
                "Tel. 049 8273939",
                "http://www.ortobotanicopd.it/",
                R.drawable.orto_botanico,
                "http://www.google.com/maps/place/Orto+Botanico+di+Padova/@45.3991449,11.8785435,17z/"));

        locations.add(new LocationListItem(
                "Piano Nobile del Caffè Pedrocchi",
                "Via VIII Febbraio, Padova",
                "Every day", "9.00 - 12.30, 15.30 - 18.00",
                "Mondays", "closed when not holiday",
                "Also closed on Dec 25-26, Jan 1, May 1",
                "Tel. 049 8781231",
                "http://padovacultura.padovanet.it/it/musei/stabilimento-pedrocchi",
                R.drawable.pedrocchi,
                "http://www.google.com/maps/place/Caffè+Pedrocchi/@45.4077327,11.8749053,17z/"));

        locations.add(new LocationListItem(
                "Palazzo Zuckermann",
                "Corso Garibaldi, Padova",
                "Every day", "10.00 - 19.00",
                "Mondays", "closed when not holiday",
                "Also closed on Dec 25-26, Jan 1, May 1",
                "Tel. 049 8205664",
                "http://padovacultura.padovanet.it/it/musei/palazzo-zuckermann",
                R.drawable.palazzo_zuckermann,
                "http://www.google.com/maps/place/Palazzo+Zuckermann/@45.4113935,11.8760531,17z/"));

        locations.add(new LocationListItem(
                "Museum of Pre-cinema",
                "Prato della Valle 1A, Padova",
                "Wed - Mon", "10.00 - 16.00",
                "Last entry", "15.00",
                "Closed on Jan 1, Easter, Apr 25, May 1, August, Dec 24-26, 31",
                "Tel. 049 8763838",
                "http://www.minicizotti.it",
                R.drawable.minici_zotti,
                "http://www.google.com/maps/place/Museo+del+PRECINEMA+-+Collezione+Minici+Zotti/@45.4001608,11.8736604,17z/"));

        locations.add(new LocationListItem(
                "Palazzo Bo (University) and Anatomical Theatre",
                "Palazzo Bo, Padova",
                "Mon - Sat", "see website",
                "Notes", "only groups, min. 10 people",
                "Openings follow University calendar",
                "Tel. 049 8273047",
                "http://www.unipd.it/universita/patrimonio-artistico-culturale/visite-guidate/visite-guidate-palazzo-bo",
                R.drawable.teatro_anatomico,
                "http://www.google.com/maps/place/Palazzo+Bo/@45.4070339,11.8749393,17z/"));

        locations.add(new LocationListItem(
                "Astronomical Observatory",
                "vicolo dell'Osservatorio, Padova",
                "Groups", "Tue - Sun 9.00 - 17.00",
                "Individuals", "Sat+Sun 16.00 (Oct-Apr), Sat+Sun  18.00 (May-Sep)",
                "Closed on Dec 24-25-26, Jan 1, May 1",
                "Tel. 049 8293449",
                "http://www.padovanet.it/informazione/visite-guidate-alla-specola",
                R.drawable.specola,
                "http://www.google.com/maps/place/La+Specola/@45.4018185,11.8660856,17z/"));

        locations.add(new LocationListItem(
                "Palazzo Zabarella",
                "Via degli Zabarella, Padova",
                "During exhibits", "see website",
                "Notes", "privately-owned building",
                "Visiting allowed only during exhibits.",
                "Tel. 049 8753100",
                "http://www.zabarella.it/",
                R.drawable.palazzo_zabarella,
                "http://www.google.com/maps/place/Palazzo+Zabarella/@45.4059127,11.8771233,17z/"));

        locations.add(new LocationListItem(
                "Casa del Petrarca",
                "Arquà Petrarca (PD)",
                "Mar - Oct", "9.00 - 12.30, 15.00 - 19.00",
                "Nov - Feb", "9.30 - 12.30, 14.30 - 17.30",
                "Closed on Mondays, Dec 25-26-31, Jan 1",
                "Tel. 0429 7182940498763838",
                "http://www.arquapetrarca.com",
                R.drawable.casa_museo_petrarca,
                "http://www.google.com/maps/place/Casa+del+Petrarca/@45.2706872,11.7133616,17z/"));

        locations.add(new LocationListItem(
                "Este National Museum",
                "Este (PD)",
                "Visits", "8.30 - 19.30",
                "Tickets", "8.30 - 18.30",
                "Closed on May 1, Dec 25, Jan 1",
                "Tel. 0429 2085",
                "http://www.atestino.beniculturali.it/index.php?it/1/home",
                R.drawable.este,
                "http://www.google.com/maps/place/Museo+Atestino/@45.2293353,11.6542909,17z/"));

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
