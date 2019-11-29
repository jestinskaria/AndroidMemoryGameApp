package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_4_start = (Button) findViewById(R.id.btn4Start);
        Button button = (Button) findViewById(R.id.button35);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        btn_4_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int start = 1;
               int end = 50;

            }
        });
    }
}
