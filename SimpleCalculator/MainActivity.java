package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView res;
    EditText n1,n2;
    Button add,sub,mul,div;
    Float num1,num2,val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        res=(TextView) findViewById(R.id.t4);
        add=(Button) findViewById(R.id.sub);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( n1.getText().toString());
                num2=Float.parseFloat(n2.getText().toString());

                val = num1 + num2;
                res.setText(String.valueOf(val).toString());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( n1.getText().toString());
                num2=Float.parseFloat(n2.getText().toString());

                val = num1 - num2;
                res.setText(String.valueOf(val).toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( n1.getText().toString());
                num2=Float.parseFloat(n2.getText().toString());

                val = num1 * num2;
                res.setText(String.valueOf(val).toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( n1.getText().toString());
                num2=Float.parseFloat(n2.getText().toString());
                if(num2==0)
                    res.setText("Denominator cannot be zero");
                else
                {
                    val = num1 / num2;
                    res.setText(String.valueOf(val).toString());
                }
            }
        });
    }
}