package com.example.student_database;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class select extends AppCompatActivity {
Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        dbconnect db=new dbconnect(this);
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c=db.Select();

                if(c.getCount()==0){
                    Toast.makeText(getApplicationContext(),"No Data found",Toast.LENGTH_SHORT).show();
                }
                StringBuffer buffer=new StringBuffer();
                while(c.moveToNext())
                {
                     buffer.append("SID         : "+ c.getString(0)+"\n");
                     buffer.append("NAME        : "+ c.getString(1)+"\n");
                     buffer.append("COURSE      : "+ c.getString(2)+"\n\n");

                }
                AlertDialog.Builder builder=new AlertDialog.Builder(select.this);
                builder.setCancelable(true);
                builder.setTitle("Students Data");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}