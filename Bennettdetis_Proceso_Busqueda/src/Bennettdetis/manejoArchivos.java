/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bennettdetis;
import java.util.*;
import java.lang.*;
import java.nio.file.*;
import java.io.*;

/**
 *
 * @author anton
 */
public class manejoArchivos {
    private static Formatter salida; //Para enviar texto a un archivo
    private static Scanner lectura; // Para leer texto de un archivo
    
    
    //----------------------------------------- LECTURA DE ARCHIVO
    //Abre Archivo
    public static void abrirArchivoLectura(String tipo){
        try{
            File carpeta = new File( "src/Bennettdetis" );
            File archivo_Productos;
            if(tipo.equals("Producto"))
                archivo_Productos = new File(carpeta, "Benneddetis_Productos.csv");
            else if(tipo.equals("Pizza"))
                archivo_Productos = new File(carpeta, "Benneddetis_Pizzas.csv");
            else if(tipo.equals("Bebida"))
                archivo_Productos = new File(carpeta, "Benneddetis_Bebidas.csv");
            else
                archivo_Productos = new File(carpeta, "Benneddetis_Etiquetas.csv");
            
            if( archivo_Productos.exists() == false )
                archivo_Productos.createNewFile();
            lectura = new Scanner(archivo_Productos);// Abre el archivo
        }
        catch(IOException ioException){
            System.err.println("Error al abrir el archivo...");
            System.err.println(ioException);
            System.exit(1); //Termina el programa
        }
    }

    //Leer registros al archivo
    public static ArrayList leerRegistros_Productos(String tipo){
        abrirArchivoLectura(tipo);
        
        ArrayList<Producto> datosProd = new ArrayList<>();
        ArrayList<Pizza> datosPiz = new ArrayList<>();
        ArrayList<Bebida> datosBeb = new ArrayList<>();
        ArrayList<Etiqueta> datosEti = new ArrayList<>();
        Producto producto;
        Pizza pizza;
        Bebida bebida; 
        Etiqueta etiqueta;
        
        try{
            String s = lectura.nextLine();
            
            if(tipo.equals("Producto")){
                while(lectura.hasNext()){
                    producto = new Producto();

                    s = lectura.nextLine();
                    String[] sParts = s.split(";");

                    producto.setIdProducto(sParts[0]);
                    producto.setNombre(sParts[1]);
                    producto.setImagen(sParts[2]);
                    producto.setPrecio(Float.parseFloat(sParts[3]));

                    datosProd.add(producto);
                }
            }
            else if(tipo.equals("Pizza")){
                while(lectura.hasNext()){
                    pizza = new Pizza();

                    s = lectura.nextLine();
                    String[] sParts = s.split(";");
                    
                    pizza.setIdProducto(sParts[0]);
                    pizza.setTamanio(sParts[1]);
                    pizza.setDescripcion(sParts[2]);
                    pizza.setDisponibilidad(Boolean.parseBoolean(sParts[3]));
                    
                    datosPiz.add(pizza);
                }
            }
            else if(tipo.equals("Bebida")){
                while(lectura.hasNext()){
                    bebida = new Bebida();

                    s = lectura.nextLine();
                    String[] sParts = s.split(";");
                    
                    bebida.setIdProducto(sParts[0]);
                    bebida.setPresentacion(sParts[1]);
                    bebida.setSabor(sParts[2]);
                    bebida.setCantidad(Integer.parseInt(sParts[3]));

                    datosBeb.add(bebida);
                }
            }
            else if(tipo.equals("Etiqueta")){
                while(lectura.hasNext()){
                    etiqueta = new Etiqueta();

                    s = lectura.nextLine();
                    String[] sParts = s.split(";");

                    etiqueta.setIdProducto(sParts[0]);
                    etiqueta.setNombre(sParts[1]);
                    
                    datosEti.add(etiqueta);
                }
            }     
        }
        catch(NoSuchElementException elementException){
            System.err.println("El archivo no esta bien formado...");
        }
        catch(IllegalStateException stateException){
            System.err.println("Error al leer del archivo...");	
        }
        cerrarArchivoLectura();
        
        if(tipo.equals("Producto"))
            return datosProd;
        else if(tipo.equals("Pizza"))
            return datosPiz;
        else if(tipo.equals("Bebida"))
            return datosBeb;
        else
            return datosEti;
    }
	
    //Cierra el archivo
    public static void cerrarArchivoLectura(){
        if(lectura != null)
            lectura.close();
    }
}

