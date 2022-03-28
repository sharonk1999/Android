package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    CheckBox ch1,ch2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ch1=(CheckBox) findViewById(R.id.ch1);
        ch2=(CheckBox) findViewById(R.id.ch2);
        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch1.isChecked()){
                    Toast.makeText(getApplicationContext(),"tea selected",Toast.LENGTH_LONG).show();
                }
                if(ch2.isChecked()){
                    Toast.makeText(getApplicationContext(),"coffee selected",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}