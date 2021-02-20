package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class sms extends AppCompatActivity {
EditText editText,editText1;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        sms();
       /* ActivityCompat.requestPermissions(sms.this,new String[](Manifest.permission.SEND_SMS,Manifest.permission.READ_SMS),PackageManager.PERMISSION_GRANTED);*/
    }
    public void sms(){
/*        editText=(EditText)findViewById(R.id.t1);
        editText1=(EditText)findViewById(R.id.t2);*/

        button=(Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            editText=(EditText)findViewById(R.id.t1);
            editText1=(EditText)findViewById(R.id.t2);

                String ph=editText.getText().toString();
                String sms=editText1.getText().toString();
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,sms,null,null);
                /*smsManager.sendTextMessage(ph, null, sms, null);*/
                Toast.makeText(getApplicationContext(),"message send",Toast.LENGTH_SHORT).show();
                /*Intent i=new Intent(sms.this,)*/
            }
        });
    }
}