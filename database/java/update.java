package com.example.student_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class update extends AppCompatActivity {
    EditText id,name,cse;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        id=(EditText)findViewById(R.id.s1);
        name=(EditText) findViewById(R.id.t3);
        cse=(EditText) findViewById(R.id.s3);
        b4=(Button) findViewById(R.id.b4);
        dbconnect db=new dbconnect(this);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=id.getText().toString();
                String s1=name.getText().toString();
                String s2=cse.getText().toString();
                boolean b=db.Update(n1,s1,s2);
                if(b==true){
                    Toast.makeText(getApplicationContext(),"Successfully Updated",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Not Updated!!Enter valid id",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}