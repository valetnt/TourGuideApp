package com.example.android.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_attractions_name));
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
