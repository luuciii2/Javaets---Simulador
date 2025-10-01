package Logica;

import java.io.Serializable;

public class Cliente implements Serializable {
    
    private String correoElectronico;
    private String clave;
    private String nombre;
    private String telefono;
    private Direccion direccion;
    private TarjetaCredito tarjetaCredito;
    
    
    public Cliente(String correoElectronico, String clave, String nombre, String telefono, Direccion direccion, TarjetaCredito tarjetaCredito) {
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjetaCredito = tarjetaCredito;
        
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correoElectronico=" + correoElectronico + ", clave=" + clave + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", tarjetaCredito=" + tarjetaCredito + '}';
    }
    
}


