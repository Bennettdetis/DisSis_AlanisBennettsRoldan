package com.bennettdetis.registro;
import java.util.*;

public class Principal{

    public static void main (String []args){
        System.out.println("-> Bienvenido a Bennettdetis <-");
        System.out.println("-> Vamos a registrarnos <-");
        System.out.println("Ingrese su(s) nombre(s)");
        Scanner sc = new Scanner(System.in);
        String nombre= sc.nextLine();
        System.out.println("Ingrese su apellido paterno");
        String apellidoPaterno = sc.nextLine();
        System.out.println("Ingrese su apellido materno");
        String apellidoMaterno = sc.nextLine();
        System.out.println("Ingrese su edad");
        String edad = sc.nextLine();
        System.out.println("Ingrese su correo electronico");
        String email = sc.nextLine();
        String privilegios = "cliente";
        System.out.println("Ingrese password");
        String password = sc.nextLine();      
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellidoPaterno(apellidoPaterno);
        cliente.setApellidoMaterno(apellidoMaterno);
        cliente.setEdad(edad);
        cliente.setEmail(email);
        cliente.setPassword(password);
        System.out.println(cliente.toString());
        Premium premium = new Premium();
        premium.setPersona(cliente);
        premium.getPersona();
    }
}