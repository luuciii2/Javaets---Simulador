package Logica;
import java.io.Serializable;
import java.time.LocalDate;
public class TarjetaCredito implements Serializable{
    
    private final String nombreTitular;
    private final String numeroTarjeta;
    private LocalDate fechaCaducidad;

    public TarjetaCredito(String nombreTitular, String numeroTarjeta, LocalDate fechaCaducidad) {
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "nombreTitular=" + nombreTitular + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }


    public String getNombreTitular() {
        return nombreTitular;
    }

}
