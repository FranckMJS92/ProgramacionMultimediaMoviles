package com.example.perfilapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.perfilapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Listener con lambda para el botón Crear Perfil
        binding.btnCrearPerfil.setOnClickListener(v -> {
            if (validarCampos()) {
                enviarDatos();
            }
        });
    }

    private boolean validarCampos() {
        String nombre = binding.etNombre.getText().toString().trim();
        String edad = binding.etEdad.getText().toString().trim();
        String email = binding.etEmail.getText().toString().trim();

        if (nombre.isEmpty()) {
            mostrarError("Nombre");
            return false;
        }

        if (edad.isEmpty()) {
            mostrarError("Edad");
            return false;
        }

        if (email.isEmpty()) {
            mostrarError("Email");
            return false;
        }

        if (binding.rgHobby.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Selecciona un hobby", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private void mostrarError(String campo) {
        Toast.makeText(this, "El campo " + campo + " es obligatorio", Toast.LENGTH_SHORT).show();
    }

    private void enviarDatos() {
        String nombre = binding.etNombre.getText().toString().trim();
        int edad = Integer.parseInt(binding.etEdad.getText().toString().trim());
        String email = binding.etEmail.getText().toString().trim();

        // Obtener hobby seleccionado
        int selectedId = binding.rgHobby.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedId);
        String hobby = radioButton.getText().toString();

        // Crear Intent explícito hacia PerfilActivity
        Intent intent = new Intent(MainActivity.this, PerfilActivity.class);
        intent.putExtra("EXTRA_NOMBRE", nombre);
        intent.putExtra("EXTRA_EDAD", edad);
        intent.putExtra("EXTRA_EMAIL", email);
        intent.putExtra("EXTRA_HOBBY", hobby);

        startActivity(intent);
    }
}