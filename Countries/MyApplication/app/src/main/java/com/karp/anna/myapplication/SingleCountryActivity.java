package com.karp.anna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SingleCountryActivity extends AppCompatActivity {


    private SingleCountryReaderController singleCountryReaderController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_country);


        //we skip the next code that reads the data from the previous activity
        Bundle prevData = getIntent().getExtras();
        if (prevData== null){
            return;
        }

        String countryName = prevData.getString("countryName");

        //here we set the TextView content to the message from the first activity
        TextView txt=(TextView)findViewById(R.id.countryName);
        txt.setText(countryName);

        singleCountryReaderController=new SingleCountryReaderController(this,countryName);
        singleCountryReaderController.readSingleCountry();

    }
}
