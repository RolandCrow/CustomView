package com.example.customview;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DurationTextView durationTextView1 =  findViewById(R.id.durationView1);
        durationTextView1.setDuration(25);

        DurationTextView durationTextView2 = (DurationTextView) findViewById(R.id.durationView2);
        durationTextView2.setDuration(78);

        DurationTextView durationTextView3 = (DurationTextView) findViewById(R.id.durationView3);
        durationTextView3.setDuration(2378);

        DurationTextView durationTextView4 = (DurationTextView) findViewById(R.id.durationView4);
        durationTextView4.setDuration(3670);

        DurationTextView durationTextView5 = (DurationTextView) findViewById(R.id.durationView5);
        durationTextView5.setDuration(18550);









    }





}