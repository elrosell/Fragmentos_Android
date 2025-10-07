package com.example.fragmentos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btrojito, btverdecito;
    FragmentTransaction fragmentTransaction;
    Inicio inicio;
    Verde verde;
    rojo rojo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btrojito = findViewById(R.id.btrojo);
        btverdecito = findViewById(R.id.btverde);
        btrojito.setOnClickListener(this);
        btverdecito.setOnClickListener(this);

        inicio = new Inicio();
        verde = new Verde();
        rojo = new rojo();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragmentos, inicio).commit();
    }

    @Override
    public void onClick(View v) {
        String cadenita= ((Button)v).getText().toString();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (cadenita.equals("rojo")){
            fragmentTransaction.replace(R.id.contenedorfragmentos, rojo).commit();
        }
        else
            if (cadenita.equals("verde")){
                fragmentTransaction.replace(R.id.contenedorfragmentos,verde);
            }

    }
}