package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button send;
private IntentFilter intentFilter;
private  jieshou jieshou1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send=findViewById(R.id.b1);
        send.setOnClickListener(new View.OnClickListener(){

                                    @Override
                                    public void onClick(View v)
                                    { Intent intent= new Intent("com.example.myapplication.MainActivity");
                                    sendBroadcast(intent);

                                    }
        }
        );
        jieshou1= new jieshou();
         IntentFilter intentFilter=new IntentFilter();
         intentFilter.addAction("com.example.myapplication.MainActivity");
         registerReceiver(jieshou1,intentFilter);
    }
    protected  void onDestroy(){
        super.onDestroy();
        unregisterReceiver(jieshou1);
    }
    class jieshou extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(MainActivity.this,"小夫，我进来了!",Toast.LENGTH_SHORT).show();
        }
    }
}