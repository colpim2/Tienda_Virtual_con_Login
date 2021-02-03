package com.poo.practica6.supermercado.departamentos.ropa;

import com.poo.practica6.supermercado.departamentos.Productos;

/**
 * La clase Ropa es una clase abstracta ya que no se puede tener un objeto tipo ropa, sin embargo, a partir de esta se
 * derivan clases hijas que tienen en común todos los elementos de la ropa
 */
public abstract class Ropa extends Productos {
    private String tamano;
    private String color;
    private String genero;
    private String material;

    /**
     * Constructor a heredar
     */
    public Ropa(String tamano, String color, String genero, String material) {
        this.tamano = tamano;
        this.color = color;
        this.genero = genero;
        this.material = material;
    }

    /**
     * Getters y Setters
     */
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}



