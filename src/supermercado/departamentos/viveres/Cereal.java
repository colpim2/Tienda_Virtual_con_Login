package com.poo.practica6.supermercado.departamentos.viveres;

public class Cereal extends Viveres {
    private float contenidoNeto;
    private float calorias;

    /**
     * Constructor preestablecido
     */
    public Cereal() {
        setPrecio((float) 40.10);
        setCodigoIdentificacion("CKCF300");
        setMarca("Kellogs");
        setFechaCaducidad("31/Dic/2020");
        setContenidoNeto(300);
        setCalorias((float) 1080.00);
    }
    /**
     * Getters y Setters
     */
    public void setContenidoNeto(float contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }

    public float getContenidoNeto() {
        return contenidoNeto;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public float getCalorias() {
        return calorias;
    }
}
