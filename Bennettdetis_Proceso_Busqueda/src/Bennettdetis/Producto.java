package Bennettdetis;

import java.util.*;

/**
 * 
 */
public class Producto{

    /**
     * Default constructor
     */
    public Producto() {
    }

    /**
     * 
     */
    private String idProducto;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String imagen;

    /**
     * 
     */
    private float precio;

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
    public String getImagen() {
        return imagen;
    }
    
    /**
     * @param imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    /**
     * @return
     */
    public float getPrecio() {
        return precio;
    }
    
    /**
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @param idProducto 
     * @return
     */
    public boolean buscarProducto(String idProducto) {
        ArrayList<Producto> productos = manejoArchivos.leerRegistros_Productos("Producto");
        
        for(Producto prod: productos){
            if(prod.idProducto.equals(idProducto))
                return true;
        }
        return false;
    }
    
    /**
     * @param idProducto 
     * @return
     */
    public Producto getProducto(String idProducto){
        if(buscarProducto(idProducto) == true){
            ArrayList<Producto> productos = manejoArchivos.leerRegistros_Productos("Producto");
            for(Producto prod: productos){
                if(prod.idProducto.equals(idProducto))
                    return prod;    
            }
        }
        return null;
    }

    /**
     * 
     */
    public void listarProductos() {
        ArrayList<Producto> p =  manejoArchivos.leerRegistros_Productos("Producto");
        
        for(Producto prod: p){
            System.out.println("");
            System.out.println("ID_Pro = " + prod.idProducto);
            System.out.println("Nombre = " + prod.nombre);
            System.out.println("Imagen = " + prod.imagen);
            System.out.println("Precio = " + prod.precio);
        }
    }

    /**
     * 
     */
    public void listarProductosEtiqueta(String etiqueta) {
        Etiqueta tmp = new Etiqueta();
        ArrayList<String> idProductos = tmp.buscarEtiqueta(etiqueta);
        ArrayList<Producto> p =  manejoArchivos.leerRegistros_Productos("Producto");
        
        for(String idProd: idProductos){
            for(Producto prod: p){
                if(idProd.equals(prod.getIdProducto())){
                    System.out.println("");
                    System.out.println("ID_Pro = " + prod.idProducto);
                    System.out.println("Nombre = " + prod.nombre);
                    System.out.println("Imagen = " + prod.imagen);
                    System.out.println("Precio = " + prod.precio);
                }
            }
        }
        
    }
}