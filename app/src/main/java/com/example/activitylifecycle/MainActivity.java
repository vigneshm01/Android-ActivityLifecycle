package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate on Main Activity");
        setContentView(R.layout.activity_main);

        }
    public void next(View v){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("onStart on Main Activity");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println(" onResume on Main Activity");
    }

    @Override
    protected void onPause(){
        super.onPause();
       System.out.println("onPause on MainActivity");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("onDestroy on MainActivity");
    }
}