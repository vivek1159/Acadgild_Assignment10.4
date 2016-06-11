package com.example.vivek.assignment104;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vivek on 11-06-2016.
 */
public class CustomAdapter extends ArrayAdapter<String>{

    Activity activity;
    ArrayList<String> Names;
    ArrayList<Integer> Images;

    public CustomAdapter(Activity context, ArrayList<String> Names,ArrayList<Integer> Images) {
        super(context, R.layout.listview_layout, Names);
        this.activity=context;
        this.Names = Names;
        this.Images = Images;
    }

    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view1 = inflater.inflate(R.layout.listview_layout, null, true);

        ImageView imageView = (ImageView)view1.findViewById(R.id.imageView);
        TextView textView = (TextView)view1.findViewById(R.id.textview);

        imageView.setImageResource(Images.get(position));
        textView.setText(Names.get(position));

        return view1;
    }
}
