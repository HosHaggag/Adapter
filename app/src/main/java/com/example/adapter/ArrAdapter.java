package com.example.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Objects;

public class ArrAdapter extends ArrayAdapter<Fruets> {
    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View v = convertView;
        if (v==null) {
           v =  LayoutInflater.from(getContext()).inflate(R.layout.itemlist,parent,false);
        }
        TextView textView = v.findViewById(R.id.textView);
        textView.setText(getItem(position).getApple());
        return super.getView(position, convertView, parent);
    }

    public ArrAdapter(Activity context, ArrayList<Fruets>arr) {
        super(context, 0, arr);
        ;
    }
}
