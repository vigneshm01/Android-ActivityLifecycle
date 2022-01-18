package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("onCreate on SecondActivity");
    }

    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("onStart on SecondActivity");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("onPause on SecondActivity");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("onResume on SecondActivity");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("onDestroy on SecondActivity");
    }
}