package com.poo.practica6.supermercado.departamentos;

/**Todas las tiendas estan formadas por productos que la gente puede adquirir. Pero productos es
 * un concepto muy amplio y por ello, debe ser manejado como una clase abstracta. A partir de ella
 * todos los productos podran poseer un precio, un codigo de intentificacion (parecido al codigo
 * de barras) y una marca.
 */

public abstract class Productos {
    private float precio;
    private String codigoIdentificacion;
    public String marca;

    /**Declaracion de los metodos getters y setters para la manipulacion de atributos*/

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion){
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getCodigoIdentificacion(){
        return codigoIdentificacion;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}