package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText t4,t5,t6;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t4=(EditText) findViewById(R.id.t4);
        t5=(EditText) findViewById(R.id.t5);
        t6=(EditText) findViewById(R.id.t6);
        btn1=(Button) findViewById(R.id.btn1);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String email=intent.getStringExtra("email");
        String pwd=intent.getStringExtra("pwd");
        t4.setText(name);
        t5.setText(email);
        t6.setText(pwd);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}