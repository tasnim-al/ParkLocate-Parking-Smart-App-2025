package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class thank extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank);
        Button backHome = findViewById(R.id.btnBackHome);
        backHome.setOnClickListener(v -> {
            Intent intent = new Intent(thank.this, welcome_page.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish(); });}}