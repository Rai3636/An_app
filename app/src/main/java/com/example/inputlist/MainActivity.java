package com.example.inputlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

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
                String str = Objects.requireNonNull(inputString.getText()).toString();
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                intent.putExtra("data",str);
                startActivity(intent);
            }
        });

    }
}