package com.example.firsttime;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firsttime.databinding.ActivityMainBinding;
import com.example.firsttime.databinding.ActivityPerfilUsuarioBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /* VIEWBINDING : MODERNO */

        // 1. Inflar el layout usando el metodo estatico inflate()
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // 2. Pasar la raiz (root) del binding al setContentView
        // binding.getRoot() devuelve el contenedor padre del XML
        setContentView(binding.getRoot());

        binding.btnGo.setOnClickListener( v ->{
            // Definicion de Intent
            Intent intent = new Intent(this, PerfilUsuarioActivity.class);
            startActivity(intent);
        });


    }
}