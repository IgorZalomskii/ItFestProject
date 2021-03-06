package com.example.itfestproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.InputQueue;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VisualOdometry extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visual_odometry);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VisualOdometry.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
