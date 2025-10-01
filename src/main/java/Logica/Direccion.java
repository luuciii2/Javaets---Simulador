package Logica;
import java.io.Serializable;
public class Direccion implements Serializable{
    
    private String calle;
    private String numero;
    private String ciudad;
    private String cp;

    public Direccion(String calle, String numero, String ciudad, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + ", cp=" + cp + '}';
    }
    
    public void setCp(String cp){
        this.cp = cp;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    

    public String getCp() {
        return cp;
    }


    public String getCiudad() {
        return ciudad;
    }


    public String getNumero() {
        return numero;
    }


    public String getCalle() {
        return calle;
    }

}
