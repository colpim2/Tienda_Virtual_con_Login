package com.poo.practica6.supermercado.departamentos.papeleria;

import com.poo.practica6.supermercado.departamentos.Productos;

/**
 * Clase Cuadernos que hereda de Productos
 */
public class Cuadernos extends Productos {
    private String tipoHoja;
    private int numeroHojas;

    /**
     * Constructor con parametros preestablecidos de la clase Cuadernos
     */
    public Cuadernos() {
        setPrecio((float) 37.40);
        setCodigoIdentificacion("CS100H");
        setMarca("SCRIBE");
        setTipoHoja("Cuadro chico");
        setNumeroHojas(100);
    }

    /**
     * Getters y Setters
     */
    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }
}
