package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class booking_successful2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_successful2);
       Button next = findViewById(R.id.btnFailNext);
        next.setOnClickListener(v -> {

            startActivity(new Intent(this, select_location.class));
            finish();
        });
    }
}