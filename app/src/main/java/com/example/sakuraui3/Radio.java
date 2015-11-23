package com.example.sakuraui3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;

public class Radio extends Activity {
    RadioButton radioFlood, radioFire, radioLandslide, radioPerson;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.9), (int) (height * 0.6));

        radioFlood = (RadioButton)findViewById(R.id.radioFlood);
        radioFire = (RadioButton)findViewById(R.id.radioFire);
        radioLandslide = (RadioButton)findViewById(R.id.radioLandslide);
        radioPerson = (RadioButton)findViewById(R.id.radioPerson);

        radioFlood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Radio.this, SendSms.class));
                radioFlood.setChecked(false);
            }
        });

        radioFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Radio.this, SendSmsFire.class));
                radioFire.setChecked(false);
            }
        });

        radioLandslide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Radio.this, SendSmsLandslide.class));
                radioLandslide.setChecked(false);
            }
        });

        radioPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Radio.this, SendSmsPerson.class));
                radioPerson.setChecked(false);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

