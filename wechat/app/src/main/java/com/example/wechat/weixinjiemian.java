package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class weixinjiemian extends ArrayAdapter<xiaoxi> {

    private int resourceId;

    public weixinjiemian(@NonNull Context context, int resource, @NonNull List<xiaoxi> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }
    public View getView(int positon, View convertView, ViewGroup parent){
        xiaoxi fruit=getItem(positon);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView fm=(ImageView) view.findViewById(R.id.imv2);
        TextView ft=(TextView) view.findViewById(R.id.tf1);
        fm.setImageResource(fruit.getImage());
        ft.setText(fruit.getName());
        return  view;
    }
}
