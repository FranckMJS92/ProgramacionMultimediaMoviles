package com.example.miappnavegable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.miappnavegable.databinding.FragmentHomeBinding;


// HomeFragment extiende de Fragment (de la library androids)
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    // Constructor vacio OBLIGATORIO
    // Android lo necesita para recrear el FRagment (ej. al girar la pantalla
    public HomeFragment() {
        // No pongas nada aqui
    }

    // onCreateView: aqui inflamos (convertimos) el XML en una vista Java

    @Override
    public View onCreateView( LayoutInflater inflater,
                          ViewGroup container,
                         Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    // onViewCreated: la vista YA existe, es seguro buscar botones, textos, etc.
    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnDetalle.setOnClickListener(v -> {

            NavController navController = NavHostFragment.findNavController(this);

            Bundle datos = new Bundle();
            datos.putString("mensaje","Hola desde HomeFragment");
            datos.putInt("numero",73);

            navController.navigate(R.id.action_homeFragment_to_detailFragment,datos);
        });
    }
}