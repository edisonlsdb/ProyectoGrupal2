package com.example.proyectogrupal2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.ProductosviewHolder>{

    List<Producto> productos;

    public Adapter(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public ProductosviewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        ProductosviewHolder holder = new ProductosviewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ProductosviewHolder holder, int position){
        Producto producto = productos.get(position);
        holder.txt_nombre.setText(producto.getNombre());
        holder.txt_superm.setText(producto.getSupermercado());
        holder.txt_valoracion.setText(producto.getValoracion());
        holder.txt_conex.setText(producto.getConex());
    }

    @Override
    public int getItemCount(){
        return productos.size();
    }


    public static class ProductosviewHolder extends RecyclerView.ViewHolder{

        TextView txt_nombre,txt_superm,txt_valoracion,txt_conex;
        CircleImageView circleImageView;

        public ProductosviewHolder(View itemView) {
            super(itemView);
            txt_nombre = (TextView) itemView.findViewById(R.id.txt_nombre);
            txt_superm = (TextView) itemView.findViewById(R.id.txt_superm);
            txt_valoracion = (TextView) itemView.findViewById(R.id.txt_valoracion);
            txt_conex = (TextView) itemView.findViewById(R.id.txt_conex);
        }
    }
}
