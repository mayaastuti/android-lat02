package com.example.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menggunakan lamda untuk menulis event listener & event handler
        Button btRealMadrid = findViewById(R.id.btRealmadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona) ;
        Button btLeicester = findViewById(R.id.btLeicester);
        Button btFlorentina = findViewById(R.id.btFlorentina);

        //Lamda
        btRealMadrid.setOnClickListener(v -> {
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "I'm Real Madrid", Toast.LENGTH_SHORT).show();

        });

        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "I'm Barcelona", Toast.LENGTH_SHORT).show());
        btLeicester.setOnClickListener(v -> Toast.makeText(this, "I'm Leicester", Toast.LENGTH_SHORT).show());
        btFlorentina.setOnClickListener(v -> Toast.makeText(this, "I'm Fiorentina", Toast.LENGTH_SHORT).show());
    }
}
