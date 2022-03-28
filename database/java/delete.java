package com.example.student_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class delete extends AppCompatActivity {
    EditText t1;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        t1=(EditText)findViewById(R.id.t1);
        b3=(Button) findViewById(R.id.b3);
        dbconnect db=new dbconnect(this);
        b3.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           int s=Integer.parseInt(t1.getText().toString());
           boolean b=db.delete(s);
           if(b==true){
               Toast.makeText(getApplicationContext(),"Successfully Deleted",Toast.LENGTH_SHORT).show();
           }
           else
           {
               Toast.makeText(getApplicationContext(),"Not Deleted!!Enter valid id",Toast.LENGTH_SHORT).show();
           }
       }
   });
    }
}