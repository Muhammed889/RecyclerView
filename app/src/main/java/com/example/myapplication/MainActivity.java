package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 List<MyItem> myItemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        setMyItemList();
        MyAdapter adapter = new MyAdapter(myItemList);
        recyclerView.setAdapter(adapter);
    }

    void setMyItemList ()
    {
        for(int i = 0; i < 20; i++) {
            myItemList.add(i, new MyItem("name " + i,i+"") );
        }
    }
}