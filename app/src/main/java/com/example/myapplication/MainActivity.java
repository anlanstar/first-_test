package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Test> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lv);
        init();
        Log.i("TAG", "size: "+list.size());
        Log.i("TAG", "MainActivity: "+MainActivity.this);
        abc abc = new abc(this, R.layout.listvew_holder, list);
        listAdapter listAdapter = new listAdapter(this,list);
        listView.setAdapter(listAdapter);
    }

    public void init(){
        for (int i = 0; i < 20; i++) {
            Test test = new Test();
            test.i=R.drawable.ic_launcher_background;
            test.string=String.valueOf(i);
            list.add(test);
        }
    }
}