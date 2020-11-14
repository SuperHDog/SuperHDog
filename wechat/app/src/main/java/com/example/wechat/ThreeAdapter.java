package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ThreeAdapter extends ArrayAdapter<Contact> {
    private int resourceId;
    public ThreeAdapter(@NonNull Context context, int resource, @NonNull List object) {
        super(context, resource,object);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Contact contact = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView imageView =(ImageView) view.findViewById(R.id.three_im);
        TextView textView = (TextView) view.findViewById(R.id.three_name);
        imageView.setImageResource(contact.getImage());
        textView.setText(contact.getName());
        return view;
    }
}
