package com.example.miappnavegable;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.miappnavegable.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

    private FragmentDetailBinding binding;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null){
            // Extraer los datos del bundle
            String mensaje = getArguments().getString("mensaje","Sin mensaje");
            int numero = getArguments().getInt("numero",0);

            // Mostrar en pantalla
            binding.txtMensajeDetalle.setText(mensaje + "\nNumero recibido: " + numero);
        }


        binding.btnVolver.setOnClickListener(v -> {

            NavController navController = NavHostFragment.findNavController(this);
            navController.navigate(R.id.action_detailFragment_to_homeFragment);
        });

    }

}