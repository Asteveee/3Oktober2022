package com.example.a3oktober2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.btn_pindah);

        btnPindah.setOnClickListener();
        Override
                public void onClick(View v) {
            Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(pindah);
        }
    }
}