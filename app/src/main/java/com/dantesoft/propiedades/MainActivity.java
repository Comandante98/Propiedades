package com.dantesoft.propiedades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Propiedad> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargaPropiedades();
        crearLista();
    }

    public void cargaPropiedades(){

        lista.add(new Propiedad(R.drawable.casa1, "Los Angeles", 500000));
        lista.add(new Propiedad(R.drawable.casa2, "Miami", 600000));
        lista.add(new Propiedad(R.drawable.casa3, "New York", 750000));
    }

    public void crearLista(){

        ArrayAdapter<Propiedad> adapter = new ListaAdapter(this, R.layout.prop, lista, getLayoutInflater());
        ListView l = findViewById(R.id.mLista);
        l.setAdapter(adapter);
    }
}