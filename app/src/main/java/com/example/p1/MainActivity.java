package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("xyz",demo.et1.getText().toString());
                i.putExtra("abc",demo.et2.getText().toString());

                startActivity(i);
            }
        });
    }
}