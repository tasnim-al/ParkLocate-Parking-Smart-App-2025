package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class booking_successful1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_successful1);
        Button next = findViewById(R.id.btnNext);
        next.setOnClickListener(v ->
                startActivity(new Intent(this, feedback.class)));}}