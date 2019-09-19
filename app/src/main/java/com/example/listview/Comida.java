package com.example.listview;

public class Comida {
    private int foto;
    private String titulo;
    private double precio;

    public Comida(int foto, String titulo, double precio) {
        this.foto = foto;
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
