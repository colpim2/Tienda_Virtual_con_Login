package com.poo.practica6.supermercado.departamentos.ropa;

public class Camisa extends Ropa {
    private int numBotones;
    private String diseno;
    private String tipocuello;

    /** Constructor completo */
    public Camisa(String tamano, String color, String genero, String material, int numBotones, String diseno, String tipocuello) {
        super(tamano, color, genero, material);
        this.numBotones = numBotones;
        this.diseno = diseno;
        this.tipocuello = tipocuello;
        setPrecio((float) 200.00);
    }

    public int getNumBotones() {
        return numBotones;
        }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
        }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getTipocuello() {
        return tipocuello;
    }

    public void setTipocuello(String tipocuello) {
        this.tipocuello = tipocuello;
    }
}
