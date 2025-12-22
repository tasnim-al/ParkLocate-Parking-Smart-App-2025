package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class selsct_floor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selsct_floor);
        findViewById(R.id.btnFloor2)
                .setOnClickListener(v ->
                        startActivity(new Intent(this, select_slot.class)));
    }
}