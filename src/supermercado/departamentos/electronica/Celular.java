package supermercado.departamentos.electronica;

import supermercado.departamentos.Productos;

/** La clase Celular, al ser un producto de venta en la tienda, debe heredar los métodos y atributos
 * de los Productos. Cada celular cuenta con las características esceciales que cualquier comprador
 * desea conocer al momento de comprar un celular
 */
public abstract class Celular extends Productos {
    private String modelo;
    private int camPixeles;
    private int memoriaRAM;
    private int memoriaROM;
    private float pantalla;
    public String color;
    private String procesador;
    private String SO;
    private boolean lectorHuella;
    private float bateria;

    /**Métodos getters y setters para poder acceder a cada atributo de la clase
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPixeles(int camPixeles) {
        this.camPixeles = camPixeles;
    }

    public int getPixeles() {
        return this.camPixeles;
    }

    public void setRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getRam() {
        return memoriaRAM;
    }

    public void setROM(int memoriaROM) {
        this.memoriaROM = memoriaROM;
    }

    public int getROM() {
        return memoriaROM;
    }

    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
    }

    public float getPantalla() {
        return pantalla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getSO() {
        return SO;
    }

    public void setLectorHuella(boolean lectorHuella) {
        this.lectorHuella = lectorHuella;
    }

    public boolean getLectorHuella() {
        return lectorHuella;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public float getBateria() {
        return bateria;
    }
}

