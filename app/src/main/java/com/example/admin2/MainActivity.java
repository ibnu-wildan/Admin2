package com.example.admin2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lihat_pendaftar(View view) {
        Intent intent = new Intent(MainActivity.this, listpendaftar.class);
        startActivity(intent);

    }

    public void lihat_keluhan(View view) {
        Intent intent = new Intent(MainActivity.this, listdata.class);
        startActivity(intent);
    }
}