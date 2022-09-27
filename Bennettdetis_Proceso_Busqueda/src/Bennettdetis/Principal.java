package Bennettdetis;

import java.util.*;
import java.io.*;
import java.nio.*;
/**
 * 
 */
public class Principal{

    /**
     * Default constructor
     */
    public Principal() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        boolean seguir = true;
        Scanner x = new Scanner(System.in);
        int opc1;
        String etiqueta, idProd;
        Producto p = new Producto();
        Pizza piz = new Pizza();
        Bebida beb = new Bebida();
        
        while(seguir){
            System.out.println("");
            System.out.println("Menu de busqueda...\n");
            System.out.println("1. Ver todos los productos");
            System.out.println("2. Filtrar productos por etiqueta");
            System.out.println("3. Ver un producuto a detalle");
            System.out.println("0. Para Salir");
            System.out.print("-- Opcion elegida: ");
            opc1 = x.nextInt();
            
            if(opc1==1)
                p.listarProductos();
            else if(opc1==2){
                x.nextLine();
                System.out.println("");
                System.out.print("-- Etiqueta = ");
                etiqueta = x.nextLine();
                p.listarProductosEtiqueta(etiqueta);
            }
            else if(opc1==3){
                x.nextLine();
                System.out.println("");
                System.out.print("-- idProducto = ");
                idProd = x.nextLine();
                if(idProd.contains("P"))
                    piz.mostrarPizza(idProd);
                else
                    beb.mostrarBebida(idProd);
            }
            else
                seguir = false;
            
            
        } 
        /*
        
        p.listarProductos();
        p.listarProductosEtiqueta("Pizza");
        
        Pizza piz = new Pizza();
        piz.mostrarPizza("P1");
        
        Bebida beb = new Bebida();
        beb.mostrarBebida("B4");
        */
    }

}
