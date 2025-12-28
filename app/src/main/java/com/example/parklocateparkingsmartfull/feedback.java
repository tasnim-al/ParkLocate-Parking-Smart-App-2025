package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
public class feedback extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Button submit = findViewById(R.id.btnSubmitFeedbake);
        Button more_information = findViewById(R.id.api);
        submit.setOnClickListener(v ->
                startActivity(new Intent(feedback.this,thank.class)));
        more_information.setOnClickListener(v -> {
            Intent I = new Intent(Intent.ACTION_VIEW);
            Uri.parse("https://data.melbourne.vic.gov.au/api/explore/v2.1/catalog/datasets");
            startActivity(I);});} }