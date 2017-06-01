package com.example.android.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.activity_museums_name));
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
