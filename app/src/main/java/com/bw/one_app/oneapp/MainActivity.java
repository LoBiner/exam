package com.bw.one_app.oneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("这是-----Activity1>>>","onCreate");


    }

    public void jump(View v){
        Intent intent=new Intent(MainActivity.this,SecndActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("这是-----Activity1>>>","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("这是-----Activity1>>>","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("这是-----Activity1>>>","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("这是-----Activity1>>>","onStop");
        

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("这是-----Activity1>>>","onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("这是-----Activity1>>>","onDestroy");
    }
}
