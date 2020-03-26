package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      final ArrayList<Fruets> arr = new ArrayList<>();

        arr.add(new Fruets("one","two"));
        arr.add(new Fruets("three","two"));
        arr.add(new Fruets("five","t8"));
        arr.add(new Fruets("seven","55"));
        arr.add(new Fruets("eight","nine"));
        arr.add(new Fruets("ten","11"));
        arr.add(new Fruets("ten","11"));
        arr.add(new Fruets("ten","11"));


        ListView lv = findViewById(R.id.list1);



        ArrAdapter adapter = new ArrAdapter(this,arr,R.color.colorPrimaryDark);



        lv.setAdapter(adapter);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                MediaPlayer mediaPlayer;
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.hh);
                mediaPlayer.start();

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("TV",arr.get(position).getApple());





                startActivity(i);





                return false;
            }
        });



    }
}
