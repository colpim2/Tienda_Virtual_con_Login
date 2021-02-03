package com.poo.practica6.supermercado.departamentos.viveres;

import com.poo.practica6.supermercado.departamentos.Productos;

/**
 * Clase abstracta que modela las caracteristicas generales de los viveres, de esta se derivan otros alimentos más
 * especificos
 */
public abstract class Viveres extends Productos {
    private String fechaCaducidad;

    /**
     * Getters y Setters
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
}
