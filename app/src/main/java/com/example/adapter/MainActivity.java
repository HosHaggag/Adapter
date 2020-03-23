package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      ArrayList<Fruets> arr = new ArrayList<>();

        arr.add(new Fruets("one","two"));
        arr.add(new Fruets("three","two"));
        arr.add(new Fruets("five","t8"));
        arr.add(new Fruets("seven","55"));
        arr.add(new Fruets("eight","nine"));
        arr.add(new Fruets("ten","11"));


        ListView lv = findViewById(R.id.list1);

        ArrAdapter adapter = new ArrAdapter(this,arr);

        lv.setAdapter(adapter);


    }
}
