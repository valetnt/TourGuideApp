package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_ITEM = "Itineraries";
    public static final String SECOND_ITEM = "Tourist Attractions";
    public static final String THIRD_ITEM = "Museums";
    public static final String FOURTH_ITEM = "Food \u0026 Drinks";
    public static final String FIFTH_ITEM = "Useful Links";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MainListItem> mainListItems = new ArrayList<>();

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item1,
                getString(R.string.activity_main_list_txt_item1)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item2,
                getString(R.string.activity_main_list_txt_item2)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item3,
                getString(R.string.activity_main_list_txt_item3)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item4,
                getString(R.string.activity_main_list_txt_item4)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item5,
                getString(R.string.activity_main_list_txt_item5)));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new MainListAdapter(this, mainListItems));
    }

}
