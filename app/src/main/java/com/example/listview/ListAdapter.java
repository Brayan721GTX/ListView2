package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter {

    private Context context;
    private List<Comida> comidas;
    private LayoutInflater li;

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<Comida> comidas, LayoutInflater li) {
        super(context, resource, comidas);

        this.context = context;
        this.comidas = comidas;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null) {
            itemView = li.inflate(R.layout.item, parent, false);
        }

        Comida comida = comidas.get(position);

        ImageView foto = itemView.findViewById(R.id.foto);
        foto.setImageResource(comida.getFoto());

        TextView titulo = itemView.findViewById(R.id.titulo);
        titulo.setText(comida.getTitulo());

        TextView precio = itemView.findViewById(R.id.precio);
        precio.setText("$"+comida.getPrecio());

        return itemView;
    }
}
