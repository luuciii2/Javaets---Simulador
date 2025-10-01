package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;
public class Sistema {
    
    private static HashMap<String , Cliente> clientes= new HashMap<>();//clave = correo
    
    private static HashMap<String, Restaurante> restaurantes = new HashMap<>();//clave =cif
    
    private static ArrayList<Pedido> pedidos = new ArrayList<> (); 

    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public static void setPedidos(ArrayList<Pedido> pedidos) {
        Sistema.pedidos = pedidos;
    }


    public static HashMap<String, Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public static void setRestaurantes(HashMap<String, Restaurante> restaurantes) {
        Sistema.restaurantes = restaurantes;
    }


    public static HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(HashMap<String, Cliente> clientes) {
        Sistema.clientes = clientes;
    }
    /**
     * guarda en la copia de seguridad los objetos serializables de la clase Cliente
     */
    public static void guardarDatosClientes() {
        try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                FileOutputStream ostreamPer = new FileOutputStream("copiasegClientes.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                oosPer.writeObject(clientes);
                ostreamPer.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /**
     * recupera de la copia de seguridad los objetos serializados de la clase Cliente
     */
     public static void cargarDatosClientes() {
        try {
            //Lectura de los objetos
            FileInputStream istreamPer = new FileInputStream("copiasegclientes.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            clientes = (HashMap<String, Cliente>) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
      /**
     * guarda en la copia de seguridad los objetos serializables de la clase Pedido
     */
     public static void guardarDatosPedidos() {
        try {
            //Si hay datos los guardamos...
            if (!pedidos.isEmpty()) {
                FileOutputStream ostreamPer = new FileOutputStream("copiasegPedidos.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                oosPer.writeObject(pedidos);
                ostreamPer.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
     /**
     * recupera de la copia de seguridad los objetos serializados de la clase Pedido
     */
     public static void cargarDatosPedidos() {
        try {
            //Lectura de los objetos
            FileInputStream istreamPer = new FileInputStream("copiasegPedidos.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            pedidos = (ArrayList<Pedido>) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
      /**
     * guarda en la copia de seguridad los objetos serializables de la clase Restaurante
     */
     public static void guardarDatosRestaurantes() {
        try {
            //Si hay datos los guardamos...
            if (!restaurantes.isEmpty()) {
                FileOutputStream ostreamPer = new FileOutputStream("copiasegRest.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                oosPer.writeObject(restaurantes);
                ostreamPer.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
     /**
     * recupera de la copia de seguridad los objetos serializados de la clase Restaurante
     */
     public static void cargarDatosRestaurantes() {
        try {
            //Lectura de los objetos
            FileInputStream istreamPer = new FileInputStream("copiasegRest.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            restaurantes = (HashMap<String, Restaurante>) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
     }
     
     /**
      * comprueba que el usuario este dado de alta y que la clave coincide con la clave introducida del usuariio
      * @param correo
      * @param clave
      * @return true si es correcto, false si no lo es
      */
    public static boolean iniciarSesion(String correo, String clave){
        if (clientes.containsKey(correo)){
            
            return clave.equals(clientes.get(correo).getClave());
        } return false;
    }
    /**
     * comprueba que no exista ya una cuenta personal con ese correo electrónico y lo añade a la lista de usuarios
     * @param dni
     * @param correoElectronico
     * @param clave
     * @param nombre
     * @param telefono
     * @param direccion
     * @param tarjetaCredito
     * @return true si se ha dado de alta, false en cualquier otro caso 
     */
    public static boolean registrarClientePersonal(String dni, String correoElectronico, String clave, String nombre, String telefono, Direccion direccion, TarjetaCredito tarjetaCredito){
        if (!clientes.containsKey(correoElectronico)){
            clientes.put(correoElectronico,new ClientePersonal( dni,correoElectronico, clave, nombre, telefono, direccion, tarjetaCredito));
            return true;
        }
        return false;
    }
    /**
     * comprueba que no exista ya una cuenta de empresa con ese correo electrónico y lo añade a la lista de usuarios
     * @param cif
     * @param webURL
     * @param correoElectronico
     * @param clave
     * @param nombre
     * @param telefono
     * @param direccion
     * @param tarjetaCredito
     * @return true si se ha dado de alta, false en cualquier otro caso 
     */
    public static boolean registrarClienteEmpresa(String cif, String webURL, String correoElectronico, String clave, String nombre, String telefono, Direccion direccion, TarjetaCredito tarjetaCredito){
        if (!clientes.containsKey(correoElectronico)){
            clientes.put(correoElectronico, new ClienteEmpresa(cif, webURL, correoElectronico, clave, nombre, telefono, direccion, tarjetaCredito));
            return true;
        }
        return false;
    }
    /**
     * comprueba que no existe ya un restaurante con el cif introducido y lo da de alta si no es así
     * @param nombre
     * @param cif
     * @param direccion
     * @param especialidad
     * @param tiempoEnvio
     * @param gastosEnvio
     * @param comidas
     * @param catering
     * @param tieneCatering
     * @return true si se ha dado de alta, false en cualquier otro caso
     */
    public static boolean darDeAltaRestaurante(String nombre, String cif, Direccion direccion, Restaurante.especialidades especialidad, int tiempoEnvio, double gastosEnvio, ArrayList<Comida> comidas,Catering catering, boolean tieneCatering){
        if (!restaurantes.containsKey(cif)){
            if(tieneCatering)restaurantes.put(cif, new Restaurante(nombre, cif, direccion, especialidad, tiempoEnvio,gastosEnvio, comidas,catering));
            else restaurantes.put(cif, new Restaurante(nombre, cif, direccion, especialidad, tiempoEnvio,gastosEnvio,comidas));
            return true;
        }
        return false;
    }
    
    
    /**
     * compara las cuatro primeras cifras del cif del cliente con las de todos los restaurantes registrados 
     * @param cliente
     * @return ArrayList<Restaurante> de restaurantes cuyas 4 primeras letras coincidan con las del cliente
     */
    public static ArrayList<Restaurante> buscarCercanos(Cliente cliente){  
    ArrayList<Restaurante> cercanos = new ArrayList<>();
    Object[] restsAr = restaurantes.values().toArray();
    ArrayList<Restaurante> rests = new ArrayList<>();
    for (Object rest: restsAr){
        rests.add((Restaurante)rest);
    }
    String cp = cliente.getDireccion().getCp().substring(0, 4);
    for (Restaurante restaurante: rests){
    if (restaurante.getDireccion().getCp().substring(0, 4).equals(cp) )cercanos.add(restaurante);
    }
    return cercanos;
}
    /**
     * devuelve los restaurantes cuya especialidad coincida con la introducida
     * @param cercanos
     * @param especialidad
     * @return ArrayList<Restaurante> 
     */
    public static ArrayList<Restaurante> filtrarEspecialidad (ArrayList<Restaurante> cercanos, Restaurante.especialidades especialidad){
        return (ArrayList)cercanos.stream()
                .filter(t -> t.getEspecialidad().equals(especialidad))
                .collect(Collectors.toList());
    }
    /**
     * ordena los restaurantes introducidos de mayor a menor relevancia
     * @param cercanos
     * @return ArrayList<Restaurante> 
     */
    public static ArrayList<Restaurante> ordenarRelevancia(ArrayList<Restaurante> cercanos){
        
        cercanos=(ArrayList)cercanos.stream()
                .sorted((r1,r2)-> Double.compare(r1.calcularCalificacion(),r2.calcularCalificacion()))
                .collect(Collectors.toList());
        Collections.reverse(cercanos);
        return (cercanos);
    }
    /**
     * ordena los restaurantes introducidos de menor a mayor tiempo de envío
     * @param cercanos
     * @return ArrayList<Restaurante> 
     */
    public static ArrayList<Restaurante> ordenarTiempoEnvio(ArrayList<Restaurante> cercanos){     
        cercanos=(ArrayList)cercanos.stream()
                .sorted((r1,r2)-> Double.compare(r1.getTiempoEnvio() ,r2.getTiempoEnvio()))
                .collect(Collectors.toList());
        return cercanos;
    }
    /**
     * devuelve los restaurantes que ofrezcan servivio de catering
     * @param cercanos
     * @return ArrayList<Restaurante> 
     */
    public static ArrayList<Restaurante> filtrarCatering(ArrayList<Restaurante> cercanos){     
        return (ArrayList)cercanos.stream()
                .filter(t -> t.isServicioCatering())
                .collect(Collectors.toList());
    }
    /**
     * un ArrayList con todos los restaurantes
     * @return ArrayList<Restaurante> 
     */
    public static ArrayList<Restaurante> restaurantesArrayList(){
        Collection<Restaurante> coleccion = restaurantes.values();
        ArrayList<Restaurante> rest = new ArrayList<>(coleccion);
        
        return rest;
    }
    /**
     * 
     * @param restaurantes
     * @return Array con los nombres de los restaurantes introducidos en el parametro
     */
    public static String[] nombresRestaurantes ( ArrayList<Restaurante> restaurantes){
       
       Object[] nombres = restaurantes.stream().map(r->r.getNombre()).toArray();
       String[] nomStr= new String[nombres.length];
       for (int i =0; i<nombres.length; i++)nomStr[i] = (String)nombres[i];
       return nomStr;
    }
    /**
     * elimina el restaurante de la lista de restaurantes
     * @param res
     * @return true si se ha borrado correctamente
     */
    public static boolean borrarRestaurante (Restaurante res){
        if (restaurantes.containsKey(res.getCif())){
            restaurantes.remove(res.getCif());
            guardarDatosRestaurantes();
            for (Restaurante rest: restaurantesArrayList()){
                System.out.println(rest.getNombre());
            }
            return true;
        }return false;
    }
    /**
     * 
     * @param cliente
     * @return Array de Strings con los correos electrónicos de todos los clientes 
     */
    public static String[] correosClientes ( ArrayList<Cliente> cliente){
        String[] nombres= new String [cliente.size()];
        int i =0;
        for (Cliente cli: cliente){
            nombres[i]= cli.getCorreoElectronico();
            i++;
        }
        return nombres;
    }
    /**
    * 
    * @return ArrayList</Cliente/>  con todos los clientes 
    **/
    public static ArrayList<Cliente> clientesArrayList(){
        Collection<Cliente> coleccion = clientes.values();
        ArrayList<Cliente> clis = new ArrayList<>(coleccion);
        return clis;
    }
    /**
     * crea el String con la informacón del pedido que se debe guardar en el archivo de texto 
     * @param ped
     * @return String a escribir en el fivhero de texto
     */
    public static String escribirFactura(Pedido ped){
        String texto = "";
      texto += "Nombre: " + ped.getCliente().getNombre() + "\n";
      texto += "Correo electrónico: " + ped.getCliente().getCorreoElectronico() + "\n";
      texto += "Fecha del pedido: " + ped.getFecha().toString() + "\n";
      texto += "Restaurante: " + ped.getRestauranteElegido().getNombre() + ", " + ped.getRestauranteElegido().getCif() + "\n";
      texto += "Comidas: ";
      
      HashMap<Comida, Integer> aux = new HashMap <>(); 
      
      if (!ped.getCarritoCompra().isEmpty()){
        for (Comida comida: ped.getCarritoCompra()){
            if (!aux.containsKey(comida)){
                aux.put(comida, (int) ped.getCarritoCompra().stream().filter(t->t.equals(comida)).count());
            }
        }
        for (Comida comida : aux.keySet())texto +=comida.getTitulo()+" ("+aux.get(comida)+")"+", ";
      }
      
      else {

          for (Comida comida: ped.getCatering().getComidasElegidas()){
            if (!aux.containsKey(comida)){
                aux.put(comida, (int) ped.getCatering().getComidasElegidas().stream().filter(t->t.equals(comida)).count());
            }
        }
          for (Comida comida : aux.keySet())texto +=comida.getTitulo()+" ("+aux.get(comida)+")"+", ";
          texto += "\nServicios del catering: " ;
          if (ped.getCatering().isCamareros())texto+="camareros, ";
          if (ped.getCatering().isCocineros())texto+="cocineros, ";
          if (ped.getCatering().isDecoracion())texto+="decoracion, ";
          if (ped.getCatering().isEspacio())texto+="espacio, ";
      }
      
      texto+="\nimporte: "+ped.calcularPrecio();
      return texto;
    
    }
    /**
     * crea un fichero de texto llamado como la clave del pedido y escribe los datos del pedido
     * @param ped
     * 
     */
    public static void guardarFactura(Pedido ped){
      String clave = ped.getClave();
      if (!pedidos.contains(ped)) {
          pedidos.add(ped);
          
           File file = new File("historialPedidos/" + clave+ ".txt");
        
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(escribirFactura(ped));
            writer.close();
            
  
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el archivo.");
            e.printStackTrace();
        }   
      }
    }
    /**
     * centra en la pantalla el contenedor introducido
     * @param cont 
     */
    public static void centrarContainer (java.awt.Container cont){
        java.awt.Toolkit pantalla = java.awt.Toolkit.getDefaultToolkit();
        int alto = cont.getHeight();
        int ancho = cont.getWidth();
        java.awt.Dimension dimpant = pantalla.getScreenSize();
        cont.setLocation(dimpant.width/2-ancho/2, dimpant.height/2-alto/2);
    }
}
    