package Logica;

import java.io.Serializable;

public class ClientePersonal extends Cliente implements Serializable {
   
    private final String dni;

    public ClientePersonal(String dni, String correoElectronico, String clave, String nombre, String telefono, Direccion direccion, TarjetaCredito tarjetaCredito) {
        super(correoElectronico, clave, nombre, telefono, direccion, tarjetaCredito);
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString()+" {" + "dni=" + dni + '}';
    }

    

    public String getDni() {
        return dni;
    }
 
}
