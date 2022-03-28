package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2,t3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.t4);
        t2=(EditText) findViewById(R.id.t5);
        t3=(EditText) findViewById(R.id.t6);
        btn=(Button) findViewById(R.id.btn1);
    getSupportActionBar().setTitle("Home");
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name=t1.getText().toString();
                String email=t2.getText().toString();
                String pwd=t3.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("pwd",pwd);
                startActivity(intent);
            }
        });
    }
}