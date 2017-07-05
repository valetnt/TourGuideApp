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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SightseeingActivity extends AppCompatActivity {

    private FragmentPagerAdapter mFragmentPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightseeing);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_main_list_txt_item4));
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

                    View rootView1 = inflater.inflate(R.layout.sightseeing_fragment, container, false);

                    ListView listView1 = (ListView) rootView1.findViewById(R.id.list);

                    return rootView1;

                case 2:

                    View rootView2 = inflater.inflate(R.layout.sightseeing_fragment, container, false);

                    ListView listView2 = (ListView) rootView2.findViewById(R.id.list);

                    return rootView2;

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
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.sightseeing_place_section_short_title1);

                case 1:
                    return getString(R.string.sightseeing_place_section_short_title2);

                default:
                    return getString(R.string.sightseeing_place_section_title);
            }
        }

        @Override
        public Fragment getItem(int position) {
            // positions start from 0, but we want sections to start from 1
            return MyFragment.newInstance(position + 1);
        }

    }
}
