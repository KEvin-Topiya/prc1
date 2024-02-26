package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView save;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        save = findViewById(R.id.save);

        Intent i = getIntent();
        String v1 = i.getStringExtra("xyz");
        String v2 = i.getStringExtra("abc");

        save.setText(v1+" "+v2);






    }
}