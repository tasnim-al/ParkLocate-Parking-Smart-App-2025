package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class welcome_page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(v ->
                startActivity(new Intent(this, info_page.class)));
    }
}