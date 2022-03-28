package com.example.grid_view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView simpleList;
    ArrayList birdList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        birdList.add(new ClipData.Item("Bird 1", R.drawable.b1));
        birdList.add(new ClipData.Item("Bird 2", R.drawable.b2));
        birdList.add(new ClipData.Item("Bird 3", R.drawable.b3));
        birdList.add(new ClipData.Item("Bird 4", R.drawable.b4));
        birdList.add(new ClipData.Item("Bird 5", R.drawable.b5));
        birdList.add(new ClipData.Item("Bird 6", R.drawable.b6));

        MyAdapter myAdapter = new MyAdapter(this, R.layout.grid_view_items, birdList);
        simpleList.setAdapter(myAdapter);
    }
}
