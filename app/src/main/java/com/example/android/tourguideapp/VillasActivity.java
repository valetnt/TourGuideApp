package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class VillasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villas);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_villas_name));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.container);

        FragmentPagerAdapter fragmentPagerAdapter =
                new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public static class MyFragment extends Fragment {

        public static final String SECTION = "SECTION";

        public MyFragment() {
            // empty constructor is required
        }

        public static MyFragment newInstance(int section) {

            Bundle args = new Bundle();
            args.putInt(SECTION, section);
            MyFragment fragment = new MyFragment();
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {

            switch (getArguments().getInt(SECTION)) {

                // East
                case 0:

                    View rootView0 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView0 = (RecyclerView) rootView0.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations0 = new ArrayList<>();

                    locations0.add(new LocationListItem(
                            "Villa Pisani",
                            "Riviera del Brenta, Stra (VE)",
                            "Apr - Sep", "9.00 - 20.00",
                            "Oct - Mar", "9.00 - 17.00",
                            "Closed on Dec 25, Jan 1",
                            "Tel. 049 502074",
                            "http://www.villapisani.beniculturali.it/",
                            R.drawable.villa_pisani,
                            "http://www.google.com/maps/place/Villa+Pisani+Museo+Nazionale/@45.408318,12.0103762,17z/"));

                    locations0.add(new LocationListItem(
                            "Villa Breda",
                            "Ponte di Brenta (PD)",
                            "Events", "see website",
                            "Visits", "see website",
                            "Also available for special events",
                            "Tel. 338 1446946",
                            "http://www.viviamovillabreda.it/",
                            R.drawable.villa_breda,
                            "http://www.google.com/maps/place/Museo+Di+Villa+Breda/@45.4259087,11.9492713,16.98z/"));

                    recyclerView0.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView0.setAdapter(new LocationListAdapter(locations0));
                    recyclerView0.setHasFixedSize(true);
                    recyclerView0.setItemAnimator(new DefaultItemAnimator());
                    recyclerView0.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView0.getLayoutManager()).getOrientation()));

                    return rootView0;

                // West
                case 1:

                    View rootView1 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView1 = (RecyclerView) rootView1.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations1 = new ArrayList<>();

                    locations1.add(new LocationListItem(
                            "Villa Emo Capodilista",
                            "Selvazzano Dentro (PD)",
                            "Reservation", "required, min. 15 people",
                            "Specials", "food and wine tasting",
                            "Open all year round",
                            "Tel. 049 691760",
                            "http://villevenetetour.it/ville-venete/villa-emo-capodilista-la-montecchia",
                            R.drawable.villa_emo,
                            "http://www.google.com/maps/place/Villa+Emo+Capodilista/@45.3852377,11.7635933,17z/"));

                    locations1.add(new LocationListItem(
                            "Villa Capra 'La Rotonda'",
                            "Chiesanuova (PD)",
                            "Interiors", "Mar - Nov on Wed, Sat",
                            "Garden", "10.00 - 12.00, 15.00 - 17.00",
                            "Closed on Mondays, Dec 25, Jan 1",
                            "Tel. 333 6409237",
                            "http://www.villalarotonda.it/",
                            R.drawable.villa_capra,
                            "http://www.google.com/maps/place/Villa+la+Rotonda/@45.5315283,11.5580812,17z/"));

                    recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView1.setAdapter(new LocationListAdapter(locations1));
                    recyclerView1.setHasFixedSize(true);
                    recyclerView1.setItemAnimator(new DefaultItemAnimator());
                    recyclerView1.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView1.getLayoutManager()).getOrientation()));

                    return rootView1;

                // South
                case 2:

                    View rootView2 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView2 = (RecyclerView) rootView2.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations2 = new ArrayList<>();

                    locations2.add(new LocationListItem(
                            "Castello del Catajo",
                            "Battaglia Terme (PD)",
                            "Apr - Aug", "15.00 - 19.00",
                            "Mar, Sep - Nov", "14.30 - 18.30",
                            "Closed on Mon, Wed, Sat, public holidays",
                            "Tel. 349 934 7190",
                            "http://www.castellodelcatajo.it/",
                            R.drawable.catajo,
                            "http://www.google.com/maps/place/Castello+del+Catajo/@45.2963558,11.7871943,17z/"));

                   locations2.add(new LocationListItem(
                            "Arquà Petrarca",
                            "Arquà Petrarca (PD)",
                            "Ped.", "no access restrictions",
                            "Cars", "limits 8.00 - 20.00 on holidays",
                            "Parking available at city entrances",
                            "Tel. 0429 718294",
                            "http://www.arquapetrarca.com",
                            R.drawable.arqua,
                            "http://www.google.com/maps/place/35032+Arquà+Petrarca+PD,+Italia/@45.2689888,11.7096588,15z/"));

                    locations2.add(new LocationListItem(
                            "Castello di Monselice",
                            "Monselice (PD)",
                            "Mar - Oct", "9.00 - 11.00, 15.00 - 17.00",
                            "Nov - Feb", "10.00 - 11.00, 14.00 - 15.00",
                            "Booking required in January",
                            "Tel. 0429 72931",
                            "http://www.castellodimonselice.it/",
                            R.drawable.castello_monselice,
                            "http://www.google.com/maps/place/Castello+Cini+Monselice/@45.2417344,11.7506397,17z/"));

                    locations2.add(new LocationListItem(
                            "Praglia Abbey",
                            "Praglia (PD)",
                            "Winter", "14.30 - 16.30",
                            "Summer", "15.00 - 17.00",
                            "Closed on all religious holidays",
                            "Tel. 049 9999300",
                            "http://www.praglia.it/wordpress/?page_id=210",
                            R.drawable.praglia,
                            "http://www.google.com/maps/place/Abbazia+di+Praglia/@45.3567469,11.7267002,14.11z/"));

                    locations2.add(new LocationListItem(
                            "Castello di S. Zeno",
                            "Montagnana (PD)",
                            "Apr - Oct", "9.30 - 12.30, 16.00 - 19.00",
                            "Nov - Mar", "9.30 - 12.30, 15.00 - 18.00,",
                            "Closed on Mon, Tue morning, Dec 25, Jan 1",
                            "Tel. 0429 81320",
                            "http://www.turismopadova.it/it/pointofinterest/castel-san-zeno-mastio-di-ezzelino",
                            R.drawable.castello_san_zeno,
                            "http://www.google.com/maps/place/Castello+di+S.+Zeno/@45.2309467,11.4666716,17z/"));

                    locations2.add(new LocationListItem(
                            "Castello di San Pelagio - Museum of Flight",
                            "Due Carrare (PD)",
                            "Mar - Nov", "10.00 - 13.00, 14.30 - 18.30",
                            "Dec - Feb", "10.00 - 17.00",
                            "Closed on Mon, Tue, Wed",
                            "Tel. 049 9125008",
                            "http://www.castellosanpelagio.it/",
                            R.drawable.castello_san_pelagio,
                            "http://www.google.com/maps/place/Castello+di+San+Pelagio+-+Museo+del+Volo/@45.3142804,11.8196743,17z/"));

                    recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView2.setAdapter(new LocationListAdapter(locations2));
                    recyclerView2.setHasFixedSize(true);
                    recyclerView2.setItemAnimator(new DefaultItemAnimator());
                    recyclerView2.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView2.getLayoutManager()).getOrientation()));

                    return rootView2;

                // North
                case 3:

                    View rootView3 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView3 = (RecyclerView) rootView3.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations3 = new ArrayList<>();

                    locations3.add(new LocationListItem(
                            "Villa Contarini",
                            "Piazzola sul Brenta (PD)",
                            "Mar - Oct", "9.00 - 19.00",
                            "Nov - Feb", "10.00 - 16.00",
                            "Closed on Wed, Dec 25, Jan 1",
                            "Tel. 049 5590347",
                            "http://www.villacontarini.eu/",
                            R.drawable.villa_contarini,
                            "http://www.google.com/maps/place/Villa+Contarini/@45.5440747,11.7830636,17z/"));

                    locations3.add(new LocationListItem(
                            "Cittadella city walls",
                            "Cittadella (PD)",
                            "Apr - Sep", "9.00 - 19.00",
                            "Oct - Mar", "9.00 - 17.00",
                            "Closed on Dec 25",
                            "Tel. 049 9404485",
                            "http://www.visitcittadella.it/",
                            R.drawable.cittadella,
                            "http://www.google.com/maps/place/35013+Cittadella+PD,+Italia/@45.6443287,11.7548612,13.29z/"));

                    recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView3.setAdapter(new LocationListAdapter(locations3));
                    recyclerView3.setHasFixedSize(true);
                    recyclerView3.setItemAnimator(new DefaultItemAnimator());
                    recyclerView3.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView3.getLayoutManager()).getOrientation()));

                    return rootView3;


                default:

                    return null;
            }
        }
    }

    public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.villas_section_short_title0);

                case 1:
                    return getString(R.string.villas_section_short_title1);

                case 2:
                    return getString(R.string.villas_section_short_title2);

                case 3:
                    return getString(R.string.villas_section_short_title3);

                default:
                    return getString(R.string.villas_section_title);
            }
        }

        @Override
        public Fragment getItem(int position) {
            return MyFragment.newInstance(position);
        }

    }
}
