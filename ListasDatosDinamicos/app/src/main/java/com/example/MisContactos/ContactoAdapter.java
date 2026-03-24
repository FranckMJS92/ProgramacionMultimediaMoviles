package com.example.MisContactos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactoAdapter extends RecyclerView.Adapterr<ContactoAdapter.ContactoViewHolder> {
    private List<Contacto> listaContactos;

    public ContactoAdapter(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtTelefono, txtEmail;

        public ContactoViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(/* ¿qué layout? */, parent, false);
        return new ContactoViewHolder(vista);
    }


@Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



}
