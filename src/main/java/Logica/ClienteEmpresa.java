package Logica;

import java.io.Serializable;

public class ClienteEmpresa extends Cliente implements Serializable{
     
    private String cif;
    private String webURL;

    public ClienteEmpresa(String cif, String webURL, String correoElectronico, String clave, String nombre, String telefono, Direccion direccion, TarjetaCredito tarjetaCredito) {
        super(correoElectronico, clave, nombre, telefono, direccion, tarjetaCredito);
        this.cif = cif;
        this.webURL = webURL;
    }

    @Override
    public String toString() {
        return super.toString()+ " {" + "cif=" + cif + ", webURL=" + webURL + '}';
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }


    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

}
