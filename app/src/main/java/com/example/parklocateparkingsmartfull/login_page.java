package com.example.parklocateparkingsmartfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class login_page extends AppCompatActivity {
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        auth = FirebaseAuth.getInstance();
        EditText email = findViewById(R.id.edtUsername);
        EditText password = findViewById(R.id.edtPassword);
        Button login = findViewById(R.id.btnLogin);
        login.setOnClickListener(v -> {
            auth.signInWithEmailAndPassword(
                    email.getText().toString(),
                    password.getText().toString()
            ).addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    startActivity(new Intent(this, select_location.class));
                    finish();
                } else {
                    Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            });
        });
    }
}