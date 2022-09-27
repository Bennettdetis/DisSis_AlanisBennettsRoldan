package Bennettdetis;

import java.util.*;

/**
 * 
 */
public class Etiqueta {

    /**
     * Default constructor
     */
    public Etiqueta() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String idProducto;

     /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     /**
     * @return
     */
    public String getIdProducto() {
        return idProducto;
    }
    
    /**
     * @param idProducto
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @param nombre 

     */
    public ArrayList<String> buscarEtiqueta(String nombre) { 
        ArrayList<Etiqueta> Etiquetas  = manejoArchivos.leerRegistros_Productos("Etiqueta");
        ArrayList<String> idProductos = new ArrayList<>();
        
        for(Etiqueta etiqueta: Etiquetas){
            if(etiqueta.getNombre().equals(nombre))
               idProductos.add(etiqueta.getIdProducto()); 
        }
            
        return idProductos;
    }

}