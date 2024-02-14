package com.example.inputlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        RecyclerView recyclerView = findViewById(R.id.secondScreenRecyclerView);

        Intent intent = getIntent();
        String str = intent.getStringExtra("data");

        String[] wordsArray = Objects.requireNonNull(str).split(",");

        ArrayList<String> data = new ArrayList<>(Arrays.asList(wordsArray));

        if(!data.isEmpty()){
            WordAdapter adapter = new WordAdapter(data);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(SecondScreen.this));
        }
        else {
            recyclerView.setVisibility(View.GONE);
        }
    }
}