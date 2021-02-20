package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Checkboxes extends AppCompatActivity {
    CheckBox checkBox ,checkBox1;
    Button button;
    RadioButton genderradioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);
        checkBox=(CheckBox)findViewById(R.id.chkbx);
        checkBox1=(CheckBox)findViewById(R.id.chkbx1);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (checkBox.isChecked()) {
                   Toast.makeText(getApplicationContext(), "Checkbox Selected", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(getApplicationContext(), "Checkbox not Selected", Toast.LENGTH_SHORT).show();
               }
               }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Checkbox is Selected", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Checkbox is not Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}