package com.poo.practica6.usuarios;

import java.util.List;

public class Administradores {
    /** Atributos */
    public String nombre;
    public long id;

    /** Método Constructor */
    public Administradores(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    /** Método Recibir Pago */
    public void RecibirPago(MetodoDePago metodoDePago, float CantidadAPagar) {
        System.out.println("Bienvenido, lo esta atendiendo: " + this.nombre);
        System.out.println("Cargando $" + CantidadAPagar + " a la tarjeta: " + metodoDePago.getTarjeta());
        float DineroTotal = metodoDePago.getDinero();
        float DineroRestante = DineroTotal - CantidadAPagar;
        metodoDePago.setDinero(DineroRestante);
        System.out.println("Transacción existoso, dinero restante: " + metodoDePago.getDinero());
    }

    /** Método Emitir Recibo */
    public float EmitirRecibo(List<Float> precios) {
        float CantidadAPagar = 0;
        for (int i = 0; i < precios.size(); i++)
            CantidadAPagar += precios.get(i);
        return CantidadAPagar;
    }

}