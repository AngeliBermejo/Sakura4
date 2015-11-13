package com.example.sakuraui3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class StartLiveFeed extends Activity implements OnClickListener {

    Button popupbutton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_page);
        popupbutton = (Button)findViewById(R.id.popupbutton);
        popupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartLiveFeed.this, SendSms.class));
            }
        });

    }

    @Override
    public void onClick(View v) {


    }
}
