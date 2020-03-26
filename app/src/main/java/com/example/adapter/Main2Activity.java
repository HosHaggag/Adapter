package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent= getIntent();

        TextView TV = findViewById(R.id.TV_INT);

        TV.setText( intent.getStringExtra("TV").toString());




    }
}
