package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class usertype_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usertype_page);

        findViewById(R.id.btnExisting)
                .setOnClickListener(v -> startActivity(new Intent(this, login_page.class)));
        findViewById(R.id.btnNewUser)
                .setOnClickListener(v -> startActivity(new Intent(this, signpu_page.class)));
    }
}