package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.p1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
ActivityMainBinding demo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        demo = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(demo.getRoot());

        demo.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}