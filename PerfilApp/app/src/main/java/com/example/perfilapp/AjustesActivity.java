package com.example.perfilapp;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.perfilapp.databinding.ActivityAjustesBinding;

public class AjustesActivity extends AppCompatActivity {

    private ActivityAjustesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAjustesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Switch listener
        binding.swNotificaciones.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String mensaje = isChecked ? "Notificaciones activadas" : "Notificaciones desactivadas";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        });

        // SeekBar listener
        binding.sbTamanoTexto.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int tamano = progress + 12; // Mínimo 12, máximo 24
                binding.tvTamanoActual.setText("Tamaño: " + tamano + "sp");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // No es necesario implementar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // No es necesario implementar
            }
        });

        binding.btnGuardarVolver.setOnClickListener(v -> finish());
    }
}