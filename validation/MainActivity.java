package com.example.myapp;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    EditText t1,t2,t3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.t1);
        t2=(EditText) findViewById(R.id.t2);
        t3=(EditText) findViewById(R.id.t3);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=t1.getText().toString();
                String email=t2.getText().toString();
                String pwd=t3.getText().toString();
                boolean res=validate(name,email,pwd);
                if(res==false)
                {
                    Toast.makeText(getApplicationContext(),"LoginSucessful",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private boolean validate(String name,String email,String pwd){
        String regex="^[A-Za-z0-9+]+@(.+)$";

        if(name.length()==0)
        {
            t1.setError("Name cannot be empty");
            return true;
        }
         if(isEmpty(email))
        {
            t2.setError("Email id cannot be empty");
            return true;
        }
        if(!email.matches(regex))
        {
            t2.setError("Email id invalid");
            return true;
        }
       if(isEmpty(pwd))
        {
            t3.setError("Password cannot be empty");
            return true;
        }
       if(pwd.length()<8)
       {
           t3.setError("Minimum 8 characters");
           return true;
       }

        return false;
    }
}