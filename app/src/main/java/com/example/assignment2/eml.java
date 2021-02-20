package com.example.assignment2;

import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Properties;

public class eml extends AppCompatActivity {

    EditText emal,emailsub,etext;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eml);
    }
    public void email(){
        button=(Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emal=(EditText)findViewById(R.id.email);
                emailsub=(EditText)findViewById(R.id.sub);
                etext=(EditText)findViewById(R.id.text);


                String em=emal.getText().toString();
                String esub=emailsub.getText().toString();
                String etxt=etext.getText().toString();

                }



            }
        );
    }
}