package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
                FIRST_ITEM));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item2,
                SECOND_ITEM));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item3,
                THIRD_ITEM));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item4,
                FOURTH_ITEM));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item5,
                FIFTH_ITEM));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new MainListAdapter(this, mainListItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(FIRST_ITEM))
                {
                    Intent intent = new Intent(MainActivity.this, ItinerariesActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
