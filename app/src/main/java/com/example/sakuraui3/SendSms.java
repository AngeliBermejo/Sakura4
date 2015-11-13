package com.example.sakuraui3;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendSms extends Activity {
    Button sendBtn;
    EditText txtphoneNo;
    EditText txtMessage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendsms);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.9), (int) (height * 0.6));

        sendBtn = (Button) findViewById(R.id.btnSendSMS);
        txtphoneNo = (EditText) findViewById(R.id.editText);
        txtMessage = (EditText) findViewById(R.id.editText2);
        String cellphone = "09177926032;09157518432"; //cellphone numbers
       txtphoneNo.setText(cellphone);
        txtMessage.setText("There is fire at");

        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMSMessage();
            }
        });
    }
    protected void sendSMSMessage() {
        Log.i("Send SMS", "");

        String phoneNo = txtphoneNo.getText().toString();
        String message = txtMessage.getText().toString();
        String numbers[] = phoneNo.split(";");
        int y = numbers.length;
        for (int x = 0; x < y ; x++){
            try {
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numbers[x], null, message, null, null);
                Toast.makeText(getApplicationContext(), "SMS sent", Toast.LENGTH_LONG).show();
            }

            catch (Exception e) {
                Toast.makeText(getApplicationContext(), "SMS failed, please try again", Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}


