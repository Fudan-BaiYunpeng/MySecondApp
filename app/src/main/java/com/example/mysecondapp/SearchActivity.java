package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private SearchAdapter mSearchAdapter = new SearchAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mRecycleView = findViewById(R.id.rv);
        mRecycleView.setLayoutManager((new LinearLayoutManager(this)));
        mRecycleView.setAdapter(mSearchAdapter);

        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i ++){
            items.add(String.valueOf(i));
        }
        mSearchAdapter.notifyItems(items);
    }
}
