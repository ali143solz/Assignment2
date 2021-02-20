package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signinform extends AppCompatActivity {
  Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinform);
         btn=(Button)findViewById(R.id.button1);
         btn1=(Button)findViewById(R.id.button2);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in=new Intent(getApplicationContext(),signinn.class);
             }
         });
    }
}