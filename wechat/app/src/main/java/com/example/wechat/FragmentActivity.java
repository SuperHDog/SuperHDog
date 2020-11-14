package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_content, new FragmentFirst());
                transaction.commit();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_content, new FragmentSecond());
                transaction.commit();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_content, new FragmentThree());
                transaction.commit();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_content, new FragmentFour());
                transaction.commit();
            }
        });
    }


}