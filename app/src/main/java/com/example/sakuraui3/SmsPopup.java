package com.example.sakuraui3;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SmsPopup extends Activity implements OnClickListener {

    Button send,back;
    EditText txtphonenumber;
    EditText txtmessage;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_popup);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.9), (int) (height * 0.6));

        send = (Button)findViewById(R.id.send);
        back = (Button)findViewById(R.id.back);
        txtphonenumber = (EditText) findViewById(R.id.txtphonenumber);
        txtmessage = (EditText) findViewById(R.id.txtmessage);
    }


    @Override
    public void onClick(View v) {


    }
}
