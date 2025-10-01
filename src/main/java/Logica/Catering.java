package Logica;
import java.io.Serializable;
import java.util.*;

public class Catering implements Serializable{
    private boolean camareros;  
    private boolean cocineros;
    private boolean decoracion;
    private boolean espacio;
    private double precio;
    private ArrayList<Comida> comidasElegidas;

    public ArrayList<Comida> getComidasElegidas() {
        return comidasElegidas;
    }

    public void setComidasElegidas(ArrayList<Comida> comidasElegidas) {
        this.comidasElegidas = comidasElegidas;
    }
    
    
    public boolean isEspacio() {
        return espacio;
    }

    public void setEspacio(boolean espacio) {
        this.espacio = espacio;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isCamareros() {
        return camareros;
    }

    public void setCamareros(boolean camareros) {
        this.camareros = camareros;
    }

    public boolean isCocineros() {
        return cocineros;
    }

    public void setCocineros(boolean cocineros) {
        this.cocineros = cocineros;
    }

    public boolean isDecoracion() {
        return decoracion;
    }

    public void setDecoracion(boolean decoracion) {
        this.decoracion = decoracion;
    }
    /**
     * calcula el precio del catering en funcion de los servicios y comidas
     * @return double precio del catering
     */
    public double calcularPrecioTotal() {
        double precioTotal=0;
        if (camareros){precioTotal += 800;}
        if (cocineros){precioTotal += 1000;}
        if (decoracion){precioTotal += 500;}
        if (espacio){precioTotal += 1000;}
        for (Comida comida:comidasElegidas){
            precioTotal += comida.getPrecioVenta();
        }
        return precioTotal;
    }

    public Catering(boolean camareros, boolean cocineros, boolean decoracion, boolean espacio, ArrayList<Comida> comidasElegidas) {
        this.camareros = camareros;
        this.cocineros = cocineros;
        this.decoracion = decoracion;
        this.espacio = espacio;
        this.comidasElegidas = comidasElegidas;
        this.precio = calcularPrecioTotal();
    }

    
    
}
