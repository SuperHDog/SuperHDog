package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.litepal.tablemanager.Connector;

public class datatest extends AppCompatActivity {
private Button save;
private  Button read;
private TextView data;
    private Button creat;
    private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datatest);
        save=findViewById(R.id.button_1);
        read=findViewById(R.id.button_2);
        data=findViewById(R.id.text_1);
        creat=findViewById(R.id.button_3);
        add=findViewById(R.id.button_4);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                editor.putString("name","曾凡豪");
                editor.putInt("age",520);
                editor.apply();
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences editor=getSharedPreferences("data",MODE_PRIVATE);
                String name=editor.getString("name","");
                int age=editor.getInt("age",0);
                data.setText(name+age);
            }
        });
        creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book=new Book();
                book.setAuthor("唐家吹鸡吧");
                book.setName("彩笔大陆");
                book.setPages(1000);
                book.setPrice(69.99);
                book.save();

            }
        });
    }
}