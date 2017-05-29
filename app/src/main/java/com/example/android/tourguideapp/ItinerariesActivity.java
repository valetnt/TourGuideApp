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

import static com.example.android.tourguideapp.MainActivity.FIRST_ITEM;

public class ItinerariesActivity extends AppCompatActivity {

    public static final String SECTION1 =
            "Section 1";
    public static final String SECTION2 =
            "Section 2";
    public static final String SECTION3 =
            "Section 3";
    public static final String SECTION1_DESCR =
            "Section 1 Description";
    public static final String SECTION2_DESCR =
            "Section 2 Description";
    public static final String SECTION3_DESCR =
            "Section 3 Description";

    private FragmentPagerAdapter mFragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraries);

        ActionBar toolbar = getSupportActionBar();
        toolbar.setTitle(FIRST_ITEM);
        toolbar.setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.container);

        mFragmentPagerAdapter = new ItinerariesFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mFragmentPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        //tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

    }

    public static class ItinerariesFragment extends Fragment {

        public ItinerariesFragment() {
            // empty constructor is required
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment, container, false);

            TextView sectionTitle = (TextView) rootView.findViewById(R.id.section_title);
            TextView sectionDescription = (TextView) rootView.findViewById(R.id.section_description);

            sectionTitle.setText(SECTION1);
            sectionDescription.setText(SECTION1_DESCR);

            ArrayList<ItineraryListItem> itineraries = new ArrayList<>();
            itineraries.add(new ItineraryListItem("Itinerary 1: Biking on the Euganean Hills",
                    "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ", "5 hours", "",
                    "Points of Interest:",
                    "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                    R.drawable.activity_main_list_item1,
                    R.drawable.ic_directions_bike, R.drawable.ic_directions_walk));

            itineraries.add(new ItineraryListItem("Itinerary 2: Arqua' Petrarca",
                    "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ", "5 hours", "",
                    "Points of Interest:",
                    "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                    R.drawable.activity_main_list_item1,
                    R.drawable.ic_directions_bike, R.drawable.ic_directions_walk));

            itineraries.add(new ItineraryListItem("Itinerary 3: Monselice",
                    "Approximate Time:", "Short Route: ", "3 hours", "Long Route: ", "5 hours", "",
                    "Points of Interest:",
                    "Villa Tal dei Tali, Castello Bellissimo, Belvedere, Escursione",
                    R.drawable.activity_main_list_item1,
                    R.drawable.ic_directions_bike, R.drawable.ic_directions_walk));

            ListView listView = (ListView) rootView.findViewById(R.id.list);
            listView.setAdapter(new ItineraryListAdapter(getContext(), itineraries));

            return rootView;
        }
    }

    public static class ItinerariesFragmentPagerAdapter extends FragmentPagerAdapter {

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
                    return SECTION1;
                case 1:
                    return SECTION1;
                case 2:
                    return SECTION1;
                default:
                    return SECTION1;
            }
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new ItinerariesFragment();
                case 1:
                    return new ItinerariesFragment();
                case 2:
                    return new ItinerariesFragment();
                default:
                    return new ItinerariesFragment();
            }

        }
    }

}
