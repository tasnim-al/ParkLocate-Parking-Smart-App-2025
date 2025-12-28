package com.example.parklocateparkingsmartfull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
public class select_location extends AppCompatActivity {
    ListView listLocations;
    Button btnNext;
    String selectedLocation = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_location);
        listLocations = findViewById(R.id.listLocations);
        btnNext = findViewById(R.id.btnNext);
        String[] locations = {
                "Muscat Mall",
                "City Centre Muscat",
                "Mall of Oman",
                "Panorama Mall",
                "Avenues Mall",
                "AlAraimi Boulevard",
                "Seeb Souq",
                "AlKhoudh Souq",
                "Mutrah Souq",
                "SalalahGardens Mall"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_single_choice,
                locations );
        listLocations.setAdapter(adapter);
        listLocations.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listLocations.setOnItemClickListener((parent, view, position, id) -> {
            selectedLocation = locations[position]; });
        btnNext.setOnClickListener(v -> {
            if (selectedLocation.isEmpty()) {
                Toast.makeText(this, "Please select a location", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(select_location.this, selsct_floor.class);
                intent.putExtra("location", selectedLocation);
                startActivity(intent); } });}}