package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class reg extends AppCompatActivity {
EditText un,ps;
Button jav;

SharedPreferences sp;
SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        un = findViewById(R.id.un);
        ps = findViewById(R.id.ps);
        jav = findViewById(R.id.jav);

        sp = getSharedPreferences("xyz",MODE_PRIVATE);
        jav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor= sp.edit();

                String s1=un.getText().toString();
                String s2=ps.getText().toString();
                editor.putString("nm",s1);
                editor.putString("ps",s2);

                editor.apply();

                startActivity(new Intent(getApplicationContext(), Login.class));

            }
        });
    }
}