package com.poo.practica6.supermercado.departamentos.electronica;

import com.poo.practica6.supermercado.departamentos.Productos;

/**La clase electrodomestico (un producto de la tienda y por ende, una herencia de ésta)
 * abarca una gamma amplia de artículos, por ello que fue declarada como una clase abstracta,
 * a partir de la cual se podrán generar objetos como lavadoras y refrigeradores.
 */

public abstract class Electrodomestico extends Productos{
    private float potencia;
    private float voltaje;
    private String color;

    /**Declaracion de getters y setters para la manipulacion de los atributos del método
     */

    public void setPotencia(float potencia){
        this.potencia = potencia;
    }

    public float getPotencia(){
        return potencia;
    }

    public void setVoltaje(float voltaje){
        this.voltaje = voltaje;
    }

    public float getVolaje(){
        return voltaje;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
