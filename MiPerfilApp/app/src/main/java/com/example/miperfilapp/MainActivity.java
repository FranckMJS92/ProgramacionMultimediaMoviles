package com.example.miperfilapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miperfilapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "mi_perfil_prefs";
    private static final String KEY_NOMBRE = "nombre";
    private static final String KEY_EDAD = "edad";
    private static final String KEY_COLOR = "color";
    private static final String KEY_MODO_OSCURO = "modo_oscuro";

    // VISTAS
    private EditText editNombre,editEdad,editColor;
    private Switch switchOscuro;
    private Button btnGuardar,btnCargar,btnBorrar;
    private TextView txtEstado;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());  // Inflar el binding
        setContentView(binding.getRoot());  // Establecer la vista raíz


    }
}