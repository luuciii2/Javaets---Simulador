package Logica;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Pedido implements Serializable  {
    
    private Cliente cliente;

    private Restaurante restauranteElegido;
    
    private ArrayList<Comida> carritoCompra;
    
    private double precio;
    
    private boolean pideCatering;
    
    private Catering catering;
    
    private LocalDateTime fecha;
    
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Catering getCatering() {
        return catering;
    }

    public void setCatering(Catering catering) {
        this.catering = catering;
    }


    public boolean isPideCatering() {
        return pideCatering;
    }

    public void setPideCatering(boolean pideCatering) {
        this.pideCatering = pideCatering;
    }

    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Comida> getCarritoCompra() {
        return carritoCompra;
    }

    public void setCarritoCompra(ArrayList<Comida> carritoCompra) {
        this.carritoCompra = carritoCompra;
    }


    public Restaurante getRestauranteElegido() {
        return restauranteElegido;
    }

    public void setRestauranteElegido(Restaurante restauranteElegido) {
        this.restauranteElegido = restauranteElegido;
    }
    /**
     * calcula el precio del pedido en funcion de las comidas, catering y tipo de cliente
     * @return double precio
     */
    public double calcularPrecio (){
       double total=0;
       for (Comida comida: carritoCompra){
           total += comida.getPrecioVenta();
       }
       if (pideCatering){      
           total+=catering.getPrecio();
        }
       if (cliente instanceof ClienteEmpresa){
           total*=0.9;
        }
      total += restauranteElegido.getGastosEnvio();
      total = Math.round(total*100);
      return total/100;
    }

    public Pedido(Cliente cliente, Restaurante restauranteElegido, Catering catering) {
        this.cliente = cliente;
        this.restauranteElegido = restauranteElegido;
        this.carritoCompra = new ArrayList<>();
        this.pideCatering =true;
        this.catering = catering;
        this.precio = calcularPrecio();
     }

    public Pedido(Cliente cliente, Restaurante restauranteElegido, ArrayList<Comida> carritoCompra) {
        this.cliente = cliente;
        this.restauranteElegido = restauranteElegido;
        this.carritoCompra = carritoCompra;
        this.pideCatering = false;
        this.catering = null;
        this.precio = calcularPrecio();
       
    }
    
    /**
     * crea la clave del pedido, que será el nombre del fichero de texto
     * @return String clave
     */
private String crearClave(){
    String miClave;
        String fechaClave =String.valueOf( this.getFecha().getYear());
        fechaClave +="-"+String.valueOf( this.getFecha().getMonth().name());
        fechaClave +="-"+String.valueOf( this.getFecha().getDayOfMonth())+" ";
        fechaClave +=String.valueOf( this.getFecha().getHour())+" h ";
        fechaClave +=String.valueOf( this.getFecha().getMinute())+" min";
        miClave = this.getCliente().getNombre()+" " +fechaClave;
    
    return miClave;
}

/**
 * cambia el estado del pedido a finalizado, determina la fecha y crea su nombre o clave característico
 */
public void finalizarPedido(){
   this.fecha = LocalDateTime.now();
   this.clave = crearClave();
}
    public static String[] obtenerNombres(ArrayList<Pedido> pedidos){
        String[] nombres = new String[pedidos.size()];
        int i =0;
        for (Pedido ped: pedidos){
            nombres[i]= ped.getClave();
            i++;
        }
        return nombres;
    }
    
    /**
         * abre el archivo de texto asociado al pedido
         * @param clave 
         */
            public static void abrirPedido(String clave) {
             try {
            File file = new File("historialPedidos/" + clave + ".txt");
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (file.exists()) {
                    desktop.open(file); 
                } else {
                    System.out.println("El archivo no existe.");
                }
            } else {
                System.out.println("Desktop no es compatible.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

