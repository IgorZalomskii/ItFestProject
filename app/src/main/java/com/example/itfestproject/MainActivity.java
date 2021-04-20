package com.example.itfestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton set = findViewById(R.id.settings);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Setting.class);
                startActivity(i);
            }
        });

        ImageButton geo = findViewById(R.id.geolocation);
        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Geolocator.class);
                startActivity(i);
            }
        });

        ImageButton blind = findViewById(R.id.blindGo);
        blind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BlindDriving.class);
                startActivity(i);
            }
        });

        ImageButton vis = findViewById(R.id.arrowsGo);
        vis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, VisualOdometry.class);
                startActivity(i);
            }
        });

    }
}