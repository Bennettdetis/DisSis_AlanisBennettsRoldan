package com.bennettdetis.registro;
import java.util.*;

/**
 *
 */
public class Cliente extends Persona {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     *
     */
    public String ofertasDisponibles;

    /**
     *
     */
    public Date fechaInicio;

    /**
     *
     */
    public Date fechaFin;

    /**
     * @return
     */
    public String getOfertasDisponibles() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setOfertasDisponibles(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Date getFechaInicio() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setFechaInicio(Date value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Date getFechaFin() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setFechaFin(Date value) {
        // TODO implement here
    }

    public String toString(){
        return "Se registro el usuario con \nnombre: " +nombre +"\napellido paterno: "+ apellidoPaterno + "\napellido materno: "+ apellidoMaterno + "\nedad: " +edad + "\ncorreo: " +email+ "\n" ;

    }
}
