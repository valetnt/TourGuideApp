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

    private FragmentPagerAdapter mFragmentPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villas);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_villas_name));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.container);

        mFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mFragmentPagerAdapter);

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
                case 1:

                    View rootView1 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView1 = (RecyclerView) rootView1.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations1 = new ArrayList<>();

                    locations1.add(new LocationListItem("Villa Pisani", "Riviera del Brenta, Stra (VE)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.villa_pisani));

                    recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView1.setAdapter(new LocationListAdapter(locations1));
                    recyclerView1.setHasFixedSize(true);
                    recyclerView1.setItemAnimator(new DefaultItemAnimator());
                    recyclerView1.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView1.getLayoutManager()).getOrientation()));

                    return rootView1;

                case 2:

                    View rootView2 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView2 = (RecyclerView) rootView2.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations2 = new ArrayList<>();

                    locations2.add(new LocationListItem("Villa Emo Capodilista",
                            "Selvazzano Dentro (PD)", "Apr. - Sept.",
                            "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.villa_emo));

                    recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView2.setAdapter(new LocationListAdapter(locations2));
                    recyclerView2.setHasFixedSize(true);
                    recyclerView2.setItemAnimator(new DefaultItemAnimator());
                    recyclerView2.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView2.getLayoutManager()).getOrientation()));

                    return rootView2;

                case 3:

                    View rootView3 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView3 = (RecyclerView) rootView3.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations3 = new ArrayList<>();

                    locations3.add(new LocationListItem("Villa Molin", "Mandriola, Albignasego (PD)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.villa_molin));

                    locations3.add(new LocationListItem("Castello del Catajo", "Battaglia Terme (PD)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.catajo));

                    locations3.add(new LocationListItem("Villa Duodo", "Monselice (PD)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.villa_duodo));

                    locations3.add(new LocationListItem("Santuario delle Sette Chiese", "Monselice (PD)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.sette_chiese));

                    locations3.add(new LocationListItem("Casa del Petrarca", "Arqua Petrarca (PD)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.casa_museo_petrarca));

                    recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView3.setAdapter(new LocationListAdapter(locations3));
                    recyclerView3.setHasFixedSize(true);
                    recyclerView3.setItemAnimator(new DefaultItemAnimator());
                    recyclerView3.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView3.getLayoutManager()).getOrientation()));

                    return rootView3;

                case 4:

                    View rootView4 = inflater.inflate(R.layout.villas_fragment, container, false);
                    RecyclerView recyclerView4 = (RecyclerView) rootView4.findViewById(R.id.list);

                    ArrayList<LocationListItem> locations4 = new ArrayList<>();

                    locations4.add(new LocationListItem("Villa Contarini", "Piazzola sul Brenta (PD)",
                            "Apr. - Sept.", "8.30 - 18.30", "Oct. - Mar.", "9.30 - 17.30",
                            "Closed on 25th Dec., 1st Jan.", "Tel. 049 691760",
                            "www.padovanet.info.com", R.drawable.villa_contarini));

                    recyclerView4.setLayoutManager(new LinearLayoutManager(getContext(),
                            LinearLayoutManager.VERTICAL, false));
                    recyclerView4.setAdapter(new LocationListAdapter(locations4));
                    recyclerView4.setHasFixedSize(true);
                    recyclerView4.setItemAnimator(new DefaultItemAnimator());
                    recyclerView4.addItemDecoration(new DividerItemDecoration(getContext(),
                            ((LinearLayoutManager) recyclerView4.getLayoutManager()).getOrientation()));

                    return rootView4;


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
                    return getString(R.string.villas_section_short_title1);

                case 1:
                    return getString(R.string.villas_section_short_title2);

                case 2:
                    return getString(R.string.villas_section_short_title3);

                case 3:
                    return getString(R.string.villas_section_short_title4);

                default:
                    return getString(R.string.villas_section_title);
            }
        }

        @Override
        public Fragment getItem(int position) {
            // positions start from 0, but we want sections to start from 1
            return MyFragment.newInstance(position + 1);
        }

    }
}
