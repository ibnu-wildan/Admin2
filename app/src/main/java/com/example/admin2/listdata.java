package com.example.admin2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class listdata extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private FirebaseDatabase fbDB;
    private DatabaseReference databaseReference;

    private TextView alamat;
    private TextView email;
    private TextView keluhan;
    private TextView nama;
    private TextView telepon;

    ArrayList<String> recordings = null;



    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        alamat = findViewById(R.id.dt_alamat2);
        email = findViewById(R.id.dt_email2);
        keluhan = findViewById(R.id.dt_keluhan);
        nama = findViewById(R.id.dt_nama2);
        telepon = findViewById(R.id.dt_telepon2);

        alamat = (TextView) findViewById(R.id.dt_alamat2);
        email = (TextView) findViewById(R.id.dt_email2);
        keluhan = (TextView) findViewById(R.id.dt_keluhan);
        nama = (TextView) findViewById(R.id.dt_nama2);
        telepon = (TextView) findViewById(R.id.dt_telepon2);


        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        fbDB = FirebaseDatabase.getInstance();
        databaseReference = fbDB.getReference("/");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                alamat.setText(dataSnapshot.child("Data Pendaftaran Tv/8403859355397/alamat").getValue().toString());
                email.setText(dataSnapshot.child("Data Pendaftaran Tv/8403859355397/alamat").getValue().toString());
                keluhan.setText(dataSnapshot.child("Data Pendaftaran Tv/8403859355397/alamat").getValue().toString());
                nama.setText(dataSnapshot.child("Data Pendaftaran Tv/8403859355397/alamat").getValue().toString());
                telepon.setText(dataSnapshot.child("Data Pendaftaran Tv/8403859355397/alamat").getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
    }

    public void back_home(View view) {
        Intent intent = new Intent(listdata.this, MainActivity.class);
        startActivity(intent);
    }

}