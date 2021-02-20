package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class email1 extends AppCompatActivity {
    EditText editText,editText1,editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emaill1);
    }
    public email1()
    {
        /*editText=(EditText)findViewById(R.id.t1);
        editText1=(EditText)findViewById(R.id.t2);
        editText2=(EditText)findViewById(R.id.t3);*/
        button=(Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()&&!editText1.getText().toString().isEmpty()
                        && !editText2.getText().toString().isEmpty()){
                     Intent in=new Intent(Intent.ACTION_SEND);
                    /*Intent in=new Intent(Intent.ACTION_SENDTO);*/
                    in.putExtra(Intent.EXTRA_EMAIL,new String[]{editText.getText().toString()});
                    in.putExtra(Intent.EXTRA_EMAIL,new String[]{editText1.getText().toString()});
                    in.putExtra(Intent.EXTRA_EMAIL,new String[]{editText2.getText().toString()});
                    in.setType("message/rfc822");
                    /*in.setData(Uri.parse("mailto"));*/
                    if(in.resolveActivity(getPackageManager())!=null){
                        startActivity(in);
                    }
                    else{
                        Toast.makeText(email1.this,"There is no app that support such type of action",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(email1.this,"Please fill all fields",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}


