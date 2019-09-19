package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Comida> listaComidas = new ArrayList<Comida>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView() {
        ArrayAdapter<Comida> adapter = new ListAdapter(this, R.layout.item, listaComidas, getLayoutInflater());

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    public void cargarDatos() {
        listaComidas.add(new Comida(R.drawable.pollo, "1 Pollo con fritas", 270));
        listaComidas.add(new Comida(R.drawable.pizza, "2 Pizzas", 200));
        listaComidas.add(new Comida(R.drawable.empanada, "1 docena de empanadas", 240));
    }
}
