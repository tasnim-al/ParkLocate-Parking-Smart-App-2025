package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Button submit = findViewById(R.id.btnSubmitFeedbake);
        submit.setOnClickListener(v ->
                startActivity(new Intent(this, thank.class)));
    }
}