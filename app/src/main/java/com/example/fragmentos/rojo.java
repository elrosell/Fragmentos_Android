package com.example.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class rojo extends Fragment implements View.OnClickListener {

    Button botoncito;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vistita;
        vistita = inflater.inflate(R.layout.fragment_rojo, container, false);
        botoncito = vistita.findViewById(R.id.botonr);
        botoncito.setOnClickListener(this);
        return vistita;
    }

    @Override
    public void onClick(View v) {
        Clasesita objetito = new Clasesita();

        Toast.makeText(getContext(), objetito.mensajitoRojo(), Toast.LENGTH_SHORT).show();
    }
}