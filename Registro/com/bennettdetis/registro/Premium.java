package com.bennettdetis.registro;
import java.util.*;

/**
 *
 */
public class Premium {

    /**
     * Default constructor
     */
    public Premium() {
    }

    /**
     *
     */
    public Persona persona;

    /**
     *
     */
    public boolean validez;

    /**
     *
     */
    public Date tiempoRestante;


    /**
     * @return
     */
    public Persona getPersona() {
        // TODO implement here
        System.out.println(persona.getNombre() + " es premium");
        return persona;
    }

    /**
     * @param value
     */
    public void setPersona(Persona value) {
        // TODO implement here
        persona=value;
    }

    /**
     * @return
     */
    public boolean getValidez() {
        // TODO implement here
        return false;
    }

    /**
     * @param value
     */
    public void setValidez(boolean value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Date getTiempoRestante() {
        // TODO implement here
        return tiempoRestante;
    }

    /**
     * @param value
     */
    public void setTiempoRestante(Date value) {
        // TODO implement here
    }

   

}
