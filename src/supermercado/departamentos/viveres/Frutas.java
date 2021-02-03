package com.poo.practica6.supermercado.departamentos.viveres;

/**
 * Clase abstracta que modela las caracteristicas generales de la fruta, de esta se derivan frutas más especificas
 */
public abstract class Frutas extends Viveres {
    private float pesoKG;

    /**
     * Getters y Setters
     */
    public void setPeso(float pesoKG) {
        this.pesoKG = pesoKG;
    }

    public float getPeso() {
        return pesoKG;
    }
}


