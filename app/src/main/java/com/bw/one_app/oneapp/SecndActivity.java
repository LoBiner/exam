package com.bw.one_app.oneapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnd);
        Log.d("这是------>>>>第二个Activity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("这是------>>>>第二个Activity","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("这是------>>>>第二个Activity","onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("这是------>>>>第二个Activity","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("这是------>>>>第二个Activity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("这是------>>>>第二个Activity","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("这是------>>>>第二个Activity","onRestart");
    }
}
