package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private IntentFilter intentFilter;
    private NetWorkChangeReceiver networkchangeReceiver;
    @Override
    protected void onCreate( Bundle savedInstancestate) {
                super.onCreate(savedInstancestate) ;
                setContentView( R.layout.activity_main) ;
                intentFilter =new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                networkchangeReceiver = new NetWorkChangeReceiver();
                registerReceiver(networkchangeReceiver, intentFilter);
}
    @Override
    protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(networkchangeReceiver);
    }
    class NetWorkChangeReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent){
            Toast.makeText(context,"network changes",Toast.LENGTH_LONG).show();
        }
    }

}
