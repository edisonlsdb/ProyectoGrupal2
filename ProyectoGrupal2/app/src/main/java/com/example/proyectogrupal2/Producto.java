package com.example.proyectogrupal2;

public class Producto {
    String nombre, supermercado, valoracion, conex;

    public Producto(){

    }

    public Producto(String nombre, String supermercado, String valoracion, String conex){
        this.nombre = nombre;
        this.supermercado = supermercado;
        this.valoracion = valoracion;
        this.conex = conex;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public String getValoracion() {
        return valoracion;
    }

    public String getConex() {
        return conex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public void setConex(String conex) {
        this.conex = conex;
    }
}
