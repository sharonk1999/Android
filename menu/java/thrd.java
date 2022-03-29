package com.example.menu_driven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText p1,r1,t1;
    Button cal;
    TextView res;
    Float p;
    Float r;
    Float t;
    Double ci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        p1=(EditText) findViewById(R.id.p);
        r1=(EditText) findViewById(R.id.r);
        t1=(EditText) findViewById(R.id.t);
        cal=(Button) findViewById(R.id.cal);
        res=(TextView) findViewById(R.id.res);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p=Float.parseFloat(p1.getText().toString());
                r=Float.parseFloat(r1.getText().toString());
                t=Float.parseFloat(t1.getText().toString());
                ci=p * Math.pow(1.0+r/100.0,t) - p;
                res.setText(String.valueOf(ci).toString());
            }
        });
    }
}