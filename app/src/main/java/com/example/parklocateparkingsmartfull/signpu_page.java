package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class signpu_page extends AppCompatActivity {
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signpu_page);

        auth = FirebaseAuth.getInstance();
        EditText email = findViewById(R.id.edtEmail);
        EditText password = findViewById(R.id.edtPassword);
        Button register = findViewById(R.id.btnRegister);
        Button back = findViewById(R.id.btnBack);
        register.setOnClickListener(v -> {
            auth.createUserWithEmailAndPassword(
                    email.getText().toString(),
                    password.getText().toString()
            ).addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    startActivity(new Intent(this, select_location.class));
                    finish();
                } else {
                    Toast.makeText(this, "Signup Failed", Toast.LENGTH_SHORT).show();
                }
            });
        });
        back.setOnClickListener(v -> finish());
    }
}