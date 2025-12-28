package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
public class select_slot extends AppCompatActivity {
    boolean isSlotSelected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_slot);
        Button slotA1 = findViewById(R.id.butSlotA1);
        Button slotA2 = findViewById(R.id.butSlotA2);
        Button slotA3 = findViewById(R.id.butSlotA3);
        Button btnContinue = findViewById(R.id.btnContinueSlot);
        slotA1.setOnClickListener(v -> isSlotSelected = true);
        slotA2.setOnClickListener(v -> isSlotSelected = true);
        slotA3.setOnClickListener(v -> isSlotSelected = true);
        btnContinue.setOnClickListener(v -> {
            if (isSlotSelected) {
                startActivity(new Intent(this, booking_successful1.class));
            } else {
                Toast.makeText(this, "Please select a parking slot first", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, booking_successful2.class));}});}}