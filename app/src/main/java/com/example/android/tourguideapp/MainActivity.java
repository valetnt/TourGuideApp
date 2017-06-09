package com.example.android.tourguideapp;

import android.app.Activity;
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

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item1,
                getString(R.string.activity_main_list_txt_item1)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item2,
                getString(R.string.activity_main_list_txt_item2)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item3,
                getString(R.string.activity_main_list_txt_item3)));

        mainListItems.add(new MainListItem(R.drawable.activity_main_list_item4,
                getString(R.string.activity_main_list_txt_item4)));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new MainListAdapter(this, mainListItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_txt_item1)))
                {
                    Intent intent = new Intent(MainActivity.this, ItinerariesActivity.class);
                    startActivity(intent);

                } else if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_txt_item2))) {

                    Intent intent = new Intent(MainActivity.this, AttractionsActivity.class);
                    startActivity(intent);

                }  else if(((MainListItem)parent.getAdapter().getItem(position)).getText().equals(
                        getString(R.string.activity_main_list_txt_item3))) {

                    Intent intent = new Intent(MainActivity.this, MuseumsActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
