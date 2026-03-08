package com.example.firsttime;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firsttime.databinding.ActivityPerfilUsuarioBinding;

public class PerfilUsuarioActivity extends AppCompatActivity {

    private static final String TAG = "Ciclo Vida";
    private ActivityPerfilUsuarioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        /* VIEWBINDING : MODERNO */

        // 1. Inflar el layout usando el metodo estatico inflate()
        binding = ActivityPerfilUsuarioBinding.inflate(getLayoutInflater());
        // 2. Pasar la raiz (root) del bindign al setContentView
        // binding.getRoot() devuelve el contenedor padre del XML
        setContentView(binding.getRoot());

        // 3. Acceder a las vistas directamente (camelCase)
        // Si es XML es: android:id"@+id/btn_aceptar" -> binding.btnAceptar
        // Si es XML es: android:id"@+id/txt_titulo_principal" -> binding.txtTituloPrincipal
        //binding.textPerfil.setText("Cambio de texto con ViewBinding");

        // Cambiar color texto y texto propiamente
        binding.tvEstado.setText("Estado Activo");
        binding.tvEstado.setTextColor(Color.BLUE);
        binding.tvEstado.setTextSize(24);

        // "Escuchador"
        binding.btnAcctualizar.setOnClickListener(v -> {
            String nombre = binding.etNombre.getText().toString();

            if(!nombre.isEmpty()){
                binding.tvSaludo.setText("Hola " + nombre + "!");
            }else{
                Toast.makeText(this,"Por favor escribe un nombre", Toast.LENGTH_SHORT).show();
            }
        });

        Log.d(TAG, "Metodo: OnCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Metodo: onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Metodo: onResume");

        // Forma antigua (findByViewId)
        //TextView txt = findViewById(R.id.textPerfil);
       // txt.setText("Francisco");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Metodo: onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Metodo: onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Metodo: onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "Metodo: onRestart");
    }


}
