package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MainListItem> mainListItems = new ArrayList<>();

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_city_item,
                getString(R.string.activity_main_list_city_item)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_sightseeing_item,
                getString(R.string.activity_main_list_sightseeing_item)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_museums_item,
                getString(R.string.activity_main_list_museums_item)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_villas_item,
                getString(R.string.activity_main_list_villas_item)));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new MainListAdapter(this, mainListItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_city_item))) {

                    Intent intent = new Intent(MainActivity.this, CityActivity.class);
                    startActivity(intent);

                } else if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_sightseeing_item))) {

                    Intent intent = new Intent(MainActivity.this, SightseeingActivity.class);
                    startActivity(intent);

                }  else if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_museums_item))) {

                    Intent intent = new Intent(MainActivity.this, MuseumsActivity.class);
                    startActivity(intent);

                } else if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_villas_item))) {

                    Intent intent = new Intent(MainActivity.this, VillasActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
