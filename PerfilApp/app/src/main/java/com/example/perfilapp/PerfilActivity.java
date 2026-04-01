package com.example.perfilapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.perfilapp.databinding.ActivityPerfilBinding;

public class PerfilActivity extends AppCompatActivity {

    private ActivityPerfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPerfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recibirDatos();

        binding.btnAjustes.setOnClickListener(v -> {
            Intent intent = new Intent(PerfilActivity.this, AjustesActivity.class);
            startActivity(intent);
        });

        binding.btnVolver.setOnClickListener(v -> finish());
    }

    private void recibirDatos() {
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("EXTRA_NOMBRE");
        int edad = intent.getIntExtra("EXTRA_EDAD", 0);
        String email = intent.getStringExtra("EXTRA_EMAIL");
        String hobby = intent.getStringExtra("EXTRA_HOBBY");

        binding.tvNombrePerfil.setText(nombre);
        binding.tvEdadPerfil.setText(edad + " años");
        binding.tvEmailPerfil.setText(email);
        binding.tvHobbyPerfil.setText(hobby);
    }
}