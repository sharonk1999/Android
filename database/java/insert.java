package com.example.student_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class insert extends AppCompatActivity {

    EditText id,name,cse;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        id=(EditText)findViewById(R.id.sid);
        name=(EditText) findViewById(R.id.sname);
        cse=(EditText) findViewById(R.id.course);
        b1=(Button) findViewById(R.id.b1);
        dbconnect db=new dbconnect(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=id.getText().toString();
                String s1=name.getText().toString();
                String s2=cse.getText().toString();
                if(n1.equals("")||s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Fields empty",Toast.LENGTH_SHORT).show();
                }
                else
                {
                 boolean b=db.Insert(n1,s1,s2);
                 if(b==true){
                     Toast.makeText(getApplicationContext(),"Successfully Inserted",Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     Toast.makeText(getApplicationContext(),"Not Inserted",Toast.LENGTH_SHORT).show();
                 }
                }
            }
        });

    }
}