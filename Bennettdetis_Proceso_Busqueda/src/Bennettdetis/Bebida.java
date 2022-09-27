package Bennettdetis;

import java.util.*;

/**
 * 
 */
public class Bebida extends Producto{

    /**
     * Default constructor
     */
    public Bebida() {
    }

    /**
     * 
     */
    private String presentacion;

    /**
     * 
     */
    private String sabor;

    /**
     * 
     */
    private int cantidad;

    /**
     * @param idProducto
     */
    public void mostrarBebida(String idProducto) {
        Producto p = new Producto().getProducto(idProducto);
        
        if(p != null){
            ArrayList<Bebida> bebidas = manejoArchivos.leerRegistros_Productos("Bebida");
            for(Bebida bebida: bebidas){
                if(bebida.getIdProducto().equals(idProducto)){
                    System.out.println("");
                    System.out.println("ID_Pro = " + p.getIdProducto());
                    System.out.println("Nombre = " + p.getNombre());
                    System.out.println("Imagen = " + p.getImagen());
                    System.out.println("Presentacion = " + bebida.presentacion);
                    System.out.println("Sabor = " + bebida.sabor);
                    System.out.println("Precio = " + p.getPrecio());
                    System.out.println("Cantidad = " + bebida.cantidad);
                }
            }
            
        }else
            System.out.print("No hay coincidiencia de ese producto...");
    }

    /**
     * @param presentacion
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return
     */
    public String getPresentacion() {
        return presentacion;
    }
    
    /**
     * @param sabor
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return
     */
    public String getSabor() {
        return sabor;
    }
    
    /**
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }
}