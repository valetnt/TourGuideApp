package com.example.android.tourguideapp;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItinerariesActivity extends AppCompatActivity {

    private FragmentPagerAdapter mFragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraries);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_main_list_txt_item1));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.container);

        mFragmentPagerAdapter = new ItinerariesFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mFragmentPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    public static class ItinerariesFragment extends Fragment {

        public static final String SECTION = "SECTION";

        public ItinerariesFragment() {
            // empty constructor is required
        }

        public static ItinerariesFragment newInstance(int section) {

            Bundle args = new Bundle();
            args.putInt(SECTION, section);
            ItinerariesFragment fragment = new ItinerariesFragment();
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {

            switch (getArguments().getInt(SECTION)) {
                case 1:

                    View rootView1 = inflater.inflate(R.layout.itineraries_fragment, container, false);

                    TextView sectionTitle1 = (TextView) rootView1.findViewById(R.id.section_title);
                    TextView sectionDescription1 = (TextView) rootView1.findViewById(R.id.section_description);

                    ListView listView1 = (ListView) rootView1.findViewById(R.id.list);

                    sectionTitle1.setText(getString(R.string.itinerary_section_title1));
                    sectionDescription1.setText(getString(R.string.itinerary_section_description1));

                    ArrayList<ItineraryListItem> itineraries1 = new ArrayList<>();
                    itineraries1.add(new ItineraryListItem("Itinerary 1: Biking on the Euganean Hills",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item1,
                            R.drawable.ic_directions_bike, R.drawable.ic_directions_walk));

                    itineraries1.add(new ItineraryListItem("Itinerary 2: Arqua' Petrarca",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item1,
                            R.drawable.ic_directions_bike, R.drawable.ic_directions_walk));

                    itineraries1.add(new ItineraryListItem("Itinerary 3: Monselice",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item1,
                            R.drawable.ic_directions_bike, R.drawable.ic_directions_walk));

                    listView1.setAdapter(new ItineraryListAdapter(getContext(), itineraries1));

                    return rootView1;

                case 2:

                    View rootView2 = inflater.inflate(R.layout.itineraries_fragment, container, false);

                    TextView sectionTitle2 = (TextView) rootView2.findViewById(R.id.section_title);
                    TextView sectionDescription2 = (TextView) rootView2.findViewById(R.id.section_description);

                    ListView listView2 = (ListView) rootView2.findViewById(R.id.list);

                    sectionTitle2.setText(getString(R.string.itinerary_section_title2));
                    sectionDescription2.setText(getString(R.string.itinerary_section_description2));

                    ArrayList<ItineraryListItem> itineraries2 = new ArrayList<>();
                    itineraries2.add(new ItineraryListItem("Itinerary 1: Villas along the Brenta river",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item2));

                    itineraries2.add(new ItineraryListItem("Itinerary 2: Cittadella",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item2));

                    listView2.setAdapter(new ItineraryListAdapter(getContext(), itineraries2));

                    return rootView2;

                case 3:

                    View rootView3 = inflater.inflate(R.layout.itineraries_fragment, container, false);

                    TextView sectionTitle3 = (TextView) rootView3.findViewById(R.id.section_title);
                    TextView sectionDescription3 = (TextView) rootView3.findViewById(R.id.section_description);

                    ListView listView3 = (ListView) rootView3.findViewById(R.id.list);

                    sectionTitle3.setText(getString(R.string.itinerary_section_title3));
                    sectionDescription3.setText(getString(R.string.itinerary_section_description3));

                    ArrayList<ItineraryListItem> itineraries3 = new ArrayList<>();
                    itineraries3.add(new ItineraryListItem("Itinerary 1: Prato della Valle",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item3, R.drawable.ic_directions_walk));

                    itineraries3.add(new ItineraryListItem("Itinerary 2: Medieval Padua",
                            "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ",
                            "5 hours", null, "Points of Interest:",
                            "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                            R.drawable.activity_main_list_item3, R.drawable.ic_directions_walk));

                    listView3.setAdapter(new ItineraryListAdapter(getContext(), itineraries3));

                    return rootView3;

                default:

                    return null;
            }
        }
    }

    public class ItinerariesFragmentPagerAdapter extends FragmentPagerAdapter {

        public ItinerariesFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.itinerary_section_short_title1);
                case 1:
                    return getString(R.string.itinerary_section_short_title2);
                case 2:
                    return getString(R.string.itinerary_section_short_title3);
                default:
                    return getString(R.string.itinerary_section_short_title1);
            }
        }

        @Override
        public Fragment getItem(int position) {
            // positions start from 0, but we want sections to start from 1
            return ItinerariesFragment.newInstance(position + 1);
        }

    }
}

