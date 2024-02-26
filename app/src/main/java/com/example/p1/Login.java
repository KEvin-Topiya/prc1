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
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText un,ps;
Button login;
SharedPreferences sp;

TextView cr;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle logindInstanceState) {
        super.onCreate(logindInstanceState);
        setContentView(R.layout.activity_login);
        un = findViewById(R.id.un);
        ps=findViewById(R.id.ps);
        login =findViewById(R.id.login);
        cr = findViewById(R.id.cr);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp=getSharedPreferences("xyz",MODE_PRIVATE);
                String s1= sp.getString("nm","");
                String s2= sp.getString("ps","");

                String v1 =un.getText().toString();
                String v2 =ps.getText().toString();

                if(s1.equals(v1) && s2.equals(v2))
                {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
                else
                {
                    Toast.makeText(Login.this, "sachi mahiti nakhvo", Toast.LENGTH_SHORT).show();
                }

            }
        });
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), reg.class));
            }
        });
    }
}