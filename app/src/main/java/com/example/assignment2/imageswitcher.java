package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class imageswitcher extends AppCompatActivity {
     ImageSwitcher sw;
     Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageswitcher);
 btn();



    }
    public void btn()
    {
        btn=(Button)findViewById(R.id.pr);
        btn=(Button)findViewById(R.id.nx);
        sw=(ImageSwitcher)findViewById(R.id.imageSwitcher1);
        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType( ImageView.ScaleType.FIT_CENTER);

                return imageView;
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.b1);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.b2);

            }
        });

    }
}