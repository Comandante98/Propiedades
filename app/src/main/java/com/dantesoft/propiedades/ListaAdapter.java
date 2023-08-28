package com.dantesoft.propiedades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<Propiedad> {

    private Context context;
    private List<Propiedad> lista;
    private LayoutInflater li;
    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Propiedad> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null){
            itemView = li.inflate(R.layout.prop,parent,false);
        }
        Propiedad propiedad = lista.get(position);

        ImageView foto = itemView.findViewById(R.id.foto);
        foto.setImageResource(propiedad.getFoto());

        TextView direccion = itemView.findViewById(R.id.direccion);
        direccion.setText(propiedad.getDireccion());

        TextView precio = itemView.findViewById(R.id.precio);
        precio.setText(propiedad.getPrecio()+"");

        return itemView;
    }
}
