package com.example.sakuraui3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.VideoView;

public class StartLiveFeed extends Activity implements OnClickListener {

    Button popupbutton;
    VideoView videoView;
    FrameLayout frame;
    boolean see = false;
    boolean clicked = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_page);
        popupbutton = (Button)findViewById(R.id.popupbutton);
        videoView = (VideoView)findViewById(R.id.videoView);
        frame = (FrameLayout)findViewById(R.id.frame);
        popupbutton.setVisibility(View.INVISIBLE);

       appear();

        popupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked = true;
                startActivity(new Intent(StartLiveFeed.this, Radio.class));
            }
        });

    }

    @Override
    public void onClick(View v) {

    }

    public void appear(){
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupbutton.setVisibility(View.VISIBLE);
                frame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupbutton.setVisibility(View.GONE);
                        appear();
                    }
                });
            }
        });

    }

}


