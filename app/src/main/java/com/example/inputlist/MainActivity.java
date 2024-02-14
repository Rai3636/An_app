package com.example.inputlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText inputString = findViewById(R.id.string);
        RecyclerView recyclerView = findViewById(R.id.recylerView);

        findViewById(R.id.submitBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] wordsArray = Objects.requireNonNull(inputString.getText()).toString().split(",");
                ArrayList<String> data = new ArrayList<>(Arrays.asList(wordsArray));

                if(!data.isEmpty()){
                    WordAdapter adapter = new WordAdapter(data);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                }
                else {
                    recyclerView.setVisibility(View.GONE);
                }
            }
        });

    }
}