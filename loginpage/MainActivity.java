package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pwd;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText) findViewById(R.id.username);
        pwd=(EditText) findViewById(R.id.password);
        loginbtn=(Button) findViewById(R.id.btn1);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(uname.getText().toString(),pwd.getText().toString());
            }
        });
    }
    private void validate(String uname,String pwd){
        if(uname.equals("admin") && pwd.equals("123"))
        {
            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();

        }
        else
            Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_LONG).show();
    }
}