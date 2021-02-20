package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class em extends AppCompatActivity {
    EditText editText1,editText2,editText3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_em);
        editText1=(EditText)findViewById(R.id.t1);
        editText2=(EditText)findViewById(R.id.t2);
        editText3=(EditText)findViewById(R.id.t3);

        btn=(Button)findViewById(R.id.b1);
        btn.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String to=editText1.getText().toString();
                String subject=editText2.getText().toString();
                String message=editText3.getText().toString();


                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                mail.putExtra(Intent.EXTRA_SUBJECT, subject);
                mail.putExtra(Intent.EXTRA_TEXT, message);

                //need this to prompts email client only
                mail.setType("message/rfc822");

                startActivity(Intent.createChooser(mail, "Choose an Email client :"));

            }

        });
    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.em.activity_main, menu);
        return true;
    }*/
}