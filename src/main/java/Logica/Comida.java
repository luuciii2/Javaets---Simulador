package Logica;

import java.io.Serializable;

public class Comida implements Serializable {
    private String titulo;
    private String fotopath;
    private String[] ingredientes;
    private double precioVenta;

    public Comida(String titulo, String fotografia, String[] ingredientes, double precioVenta) {
        this.titulo = titulo;
        this.fotopath = fotografia;
        this.ingredientes = ingredientes;
        this.precioVenta = precioVenta;
    }

    public String getFotopath() {
        return fotopath;
    }

    public void setFotopath(String fotopath) {
        this.fotopath = fotopath;
    }
    

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Comida{" + "titulo=" + titulo + ", fotopath=" + fotopath + ", precioVenta=" + precioVenta + '}';
    }


    
    

}
