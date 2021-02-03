package com.poo.practica6.supermercado.departamentos.ropa;

public class Calcetines extends Ropa {
    private String dibujo;

    /**
     * Constructor completo
     */
    public Calcetines(String tamano, String color, String genero, String material, String dibujo) {
        super(tamano, color, genero, material);
        this.dibujo = dibujo;
        setPrecio((float) 150.00);
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }
}
