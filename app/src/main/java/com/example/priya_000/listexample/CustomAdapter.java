package com.example.priya_000.listexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater= LayoutInflater.from(getContext());   //context= background info
        View customView=myInflater.inflate(R.layout.custom_row,parent,false);

        String singleFoodItem=getItem(position);
        TextView myText=(TextView)customView.findViewById(R.id.myText);
        ImageView myImage=(ImageView)customView.findViewById(R.id.myImage);

        myText.setText(singleFoodItem);
        myImage.setImageResource(R.drawable.smile);
        return customView;
    }
}
