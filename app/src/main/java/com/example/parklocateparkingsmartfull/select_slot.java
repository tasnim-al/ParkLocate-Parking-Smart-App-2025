package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class select_slot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_slot);
        Button cont = findViewById(R.id.btnContinueSlot);
        cont.setOnClickListener(v ->
                startActivity(new Intent(this, booking_successful1.class)));
    }
}