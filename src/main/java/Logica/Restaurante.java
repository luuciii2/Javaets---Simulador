package Logica;
import java.io.Serializable;
import java.util.ArrayList;

public class Restaurante implements Serializable{
    
    private String nombre;
    private String cif; //he quitado el final
    private Direccion direccion;
    private especialidades especialidad;  
    public enum especialidades {PASTA,PIZZA,MARISCO,HAMBURGUESA, VEGETARIANO, MEXICANO, INDIO, CHINO,GRILL, FASTFOOD};
    private boolean servicioCatering;   
    private Catering catering;
    private int tiempoEnvio;
    private double gastosEnvio;
    private double sumaCalificaciones;    
    private int numCalificaciones;
    private ArrayList<Comida> comidas;
    
//constructor con catering
    public Restaurante(String nombre, String cif, Direccion direccion, especialidades especialidad, int tiempoEnvio, double gastosEnvio, ArrayList<Comida> comidas,Catering catering) {
        this.nombre = nombre;
        this.cif = cif; 
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.catering = catering;
        this.tiempoEnvio = tiempoEnvio;
        this.gastosEnvio = gastosEnvio;
       
        this.comidas = comidas;
        servicioCatering = true;


    }
//constructor sin catering
    public Restaurante(String nombre, String cif, Direccion direccion, especialidades especialidad, int tiempoEnvio, double gastosEnvio, ArrayList<Comida> comidas) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.tiempoEnvio = tiempoEnvio;
        this.gastosEnvio = gastosEnvio;
        sumaCalificaciones =0;
        numCalificaciones =0;
        this.comidas = comidas;

    }
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }


    public double getSumaCalificaciones() {
        return sumaCalificaciones;
    }

    public void setSumaCalificaciones(double sumaCalificaciones) {
        this.sumaCalificaciones = sumaCalificaciones;
    }

    public int getNumCalificaciones() {
        return numCalificaciones;
    }

    public void setNumCalificaciones(int numCalificaciones) {
        this.numCalificaciones = numCalificaciones;
    }
    
    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }


    public int getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(int tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }


    public Catering getCatering() {
        return catering;
    }

    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    
    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }
    
    /**
     * comprueba que la comida no esté ya en el restaurante para evitar duplicados y la añade si es así
     * @param comida
     * @return true si se añade, false si no se ha añadido 
     */
    public boolean addComida(Comida comida){
    if (!comidas.contains(comida)){comidas.add(comida);return true;}
    return false;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean isServicioCatering() {
        return servicioCatering;
    }

    public void setServicioCatering(boolean servicioCatering) {
        this.servicioCatering = servicioCatering;
    }


    public especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidades especialidad) {
        this.especialidad = especialidad;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * crea un array con los nombres de todos los restaurantes del arrayList introducido
     * @param restaurantes
     * @return String[] con los nombre de los restaurantes 
     */
    public static String[] obtenerNombres(ArrayList<Restaurante> restaurantes){
        String[] nombres = new String[restaurantes.size()];
        int i =0;
        for (Restaurante rest: restaurantes){
            nombres[i]= rest.getNombre();
            i++;
        }
        return nombres;
    }
    /**
     * calcula la clificación media del restaurante
     * @return double calificacion
     */
    public double calcularCalificacion(){
        return sumaCalificaciones/numCalificaciones;
    }
    /**
     * guarda la calificacion del restaurante 
     * @param calificacion 
     */
    public void calificar (double calificacion){
        sumaCalificaciones += calificacion;
        numCalificaciones++;
    }
    /**
     * 
     * @return String[] con los nombres de las especialidades 
     */
    public static String[] especString (){
        especialidades[] esps=especialidades.values();
        String[] str = new String[esps.length];
        int i =0;
        for (especialidades esp: esps){
            str[i]= esp.name();
            i++;
        }
        return str;
    }
    /**
     * 
     * @return String[] con los nombres de las comida del restaurante
     */
    public String[] nombresComidas(){
        String[] nombres= new String [comidas.size()];
        int i =0;
        for (Comida com: comidas){
            nombres[i]= com.getTitulo();
            i++;
        }
        return nombres;
    }
    
            
    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", cif=" + cif + ", direccion=" + direccion +
                ", especialidad=" + especialidad.toString() + ", servicioCatering=" + servicioCatering + 
                ", catering=" + catering + ", tiempoEnvio=" + tiempoEnvio + ", gastosEnvio=" + gastosEnvio + ", calificacion=" + calcularCalificacion() + ", comidas=" + comidas.toString()+ '}';
    }

}
