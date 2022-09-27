package Bennettdetis;

import java.util.*;

/**
 * 
 */
public class Pizza extends Producto{

    /**
     * Default constructor
     */
    public Pizza() {
    }

    /**
     * 
     */
    private String tamanio;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private boolean disponibilidad;

    /**
     * @param idProducto
     */
    public void mostrarPizza(String idProducto) {
        Producto p = new Producto().getProducto(idProducto);
        
        if(p != null){
            ArrayList<Pizza> pizzas = manejoArchivos.leerRegistros_Productos("Pizza");
            for(Pizza pizza: pizzas){
                if(pizza.getIdProducto().equals(idProducto)){
                    System.out.println("");
                    System.out.println("ID_Pro = " + p.getIdProducto());
                    System.out.println("Nombre = " + p.getNombre());
                    System.out.println("Imagen = " + p.getImagen());
                    System.out.println("Tamanio = " + pizza.tamanio);
                    System.out.println("Descripcion = " + pizza.descripcion);
                    System.out.println("Precio = " + p.getPrecio());
                    System.out.println("Disponibilidad = " + pizza.disponibilidad);
                }
            }
            
        }else
            System.out.print("No hay coincidiencia de ese producto...");
    }

    /**
     * @param tamanio
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return
     */
    public String getTamanio() {
        return tamanio;
    }
    
    /**
     * @param descripcio
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * @param disponibilidad
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return
     */
    public boolean getDisponibilidad() {
        return disponibilidad;
    }
}