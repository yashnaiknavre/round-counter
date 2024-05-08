package com.yash.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView txtcount = findViewById(R.id.counter1);
        Button btncount = findViewById(R.id.controller);
        Button btnreset = findViewById(R.id.reset);
    counter=0;
        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                txtcount.setText(""+counter);
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter= 0;
                txtcount.setText(""+counter);
            }
        });
    }
}