package com.poo.practica6.supermercado.departamentos.zapatos;

import com.poo.practica6.supermercado.departamentos.Productos;

/**
 * Clase abstracta del calzado, de la que se derivan tipos especificos
 */
public abstract class Calzado extends Productos {
    private int tamano;
    private String material;
    private String diseno;
    private String suela;

    /**
     * Getters y Setters
     */
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }
}





