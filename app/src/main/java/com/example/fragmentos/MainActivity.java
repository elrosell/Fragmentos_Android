package com.example.fragmentos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button brojito, bverdecito;
    FragmentTransaction transaction;
    Inicio oinicio;
    rojo orojo;
    Verde overde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        brojito = findViewById(R.id.brojo);
        bverdecito = findViewById(R.id.bverde);
        brojito.setOnClickListener(this);
        bverdecito.setOnClickListener(this);
        oinicio = new Inicio();
        orojo = new rojo();
        overde = new Verde();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragmentos, oinicio).commit();
    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        transaction = getSupportFragmentManager().beginTransaction();

        if (cadenita.equals("rojo"))
            transaction.replace(R.id.contenedorfragmentos, orojo).commit();
        else
        if (cadenita.equals("verde"))
            transaction.replace(R.id.contenedorfragmentos, overde).commit();
    }
}