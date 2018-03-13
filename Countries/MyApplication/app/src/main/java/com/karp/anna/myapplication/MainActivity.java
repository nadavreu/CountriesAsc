package com.karp.anna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CountriesReaderController countriesReaderController;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create controllers:
        countriesReaderController = new CountriesReaderController(this);

        // Show all countries from server:
        countriesReaderController.readAllCountries();

    }

}
