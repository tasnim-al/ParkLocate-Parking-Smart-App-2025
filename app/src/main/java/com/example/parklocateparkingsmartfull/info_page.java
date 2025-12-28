package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class info_page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
        Button btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(v ->
                startActivity(new Intent(this, usertype_page.class)));}}