package com.poo.practica6.usuarios;
import com.poo.practica6.supermercado.departamentos.electronica.*;
import com.poo.practica6.supermercado.departamentos.papeleria.*;
import com.poo.practica6.supermercado.departamentos.viveres.*;
import com.poo.practica6.supermercado.departamentos.ropa.*;
import com.poo.practica6.supermercado.departamentos.zapatos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioNormal {
    /** Atributos */
    public String nombre;
    private MetodoDePago metodoDePago;
    private List<String> carrito;
    private List<Float> precios;

    /** Método Constructor */
    public UsuarioNormal() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Bienvenido\nIngrese su nombre: ");
        this.nombre = teclado.nextLine();

        this.carrito = new ArrayList<String>();
        this.precios = new ArrayList<Float>();
    }

    /** Método Recorrer Supermercado */
    public void RecorrerSupermercado() {
        System.out.println("Pasillo: Viveres");
        Cereal cereal = new Cereal();
        precios.add(cereal.getPrecio());
        carrito.add("Cereal");
        System.out.println("  Cereal "+cereal.getMarca()+" $"+cereal.getPrecio()+" agregado al carrito");
        Manzanas manzanas = new Manzanas();
        precios.add(manzanas.getPrecio());
        carrito.add("Manzanas");
        System.out.println("  Manzanas "+manzanas.getMarca()+" $"+manzanas.getPrecio()+" agregado al carrito");
        Platanos platanos = new Platanos();
        precios.add(platanos.getPrecio());
        carrito.add("Platanos");
        System.out.println("  Platanos "+platanos.getMarca()+" $"+platanos.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Papeleria");
        Cuadernos cuadernos = new Cuadernos();
        precios.add(cuadernos.getPrecio());
        carrito.add("Cuadernos");
        System.out.println("  Cuadernos "+cuadernos.getMarca()+" $"+cuadernos.getPrecio()+" agregado al carrito");
        Hojas hojas = new Hojas();
        precios.add(hojas.getPrecio());
        carrito.add("Hojas");
        System.out.println("  Hojas "+hojas.getMarca()+" $"+hojas.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Electronicos");
        Lavadora lavadora = new Lavadora();
        precios.add(lavadora.getPrecio());
        carrito.add("Lavadora");
        System.out.println("  Lavadora "+lavadora.getMarca()+" $"+lavadora.getPrecio()+" agregado al carrito");
        Refrigerador refrigerador = new Refrigerador();
        precios.add(refrigerador.getPrecio());
        carrito.add("Refrigerador");
        System.out.println("  Refrigerador "+refrigerador.getMarca()+" $"+refrigerador.getPrecio()+" agregado al carrito");
        IPhone iPhone = new IPhone("Gris");
        precios.add(iPhone.getPrecio());
        carrito.add("IPhone");
        System.out.println("  Celular "+iPhone.getMarca()+" $"+iPhone.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Ropa");
        Calcetines calcetines = new Calcetines("Mediano","Gris","Unisex","Algodon","Patos");
        precios.add(calcetines.getPrecio());
        carrito.add("Calcetines");
        System.out.println("  Calcetines $"+calcetines.getPrecio()+" agregado al carrito");
        Camisa camisa = new Camisa("Mediano","Azul","Masculino","Algodon",8,"Liso","Redondo");
        precios.add(camisa.getPrecio());
        carrito.add("Camisa");
        System.out.println("  Camisa $"+camisa.getPrecio()+" agregado al carrito");
        Pantalon pantalon = new Pantalon("Mediano","Azul","Masculino","Algodon","Recto",4);
        precios.add(pantalon.getPrecio());
        carrito.add("Pantalon");
        System.out.println("  Pantalon $"+pantalon.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Zapatos");
        Sandalias sandalias = new Sandalias();
        precios.add(sandalias.getPrecio());
        carrito.add("Sandalias");
        System.out.println("  Sandalias $"+sandalias.getPrecio()+" agregado al carrito");
        Tacones tacones = new Tacones();
        precios.add(tacones.getPrecio());
        carrito.add("Tacones");
        System.out.println("  Tacones $"+tacones.getPrecio()+" agregado al carrito");
        Tenis tenis = new Tenis();
        precios.add(tenis.getPrecio());
        carrito.add("Tenis");
        System.out.println("  Tenis $"+tenis.getPrecio()+" agregado al carrito");
    }

    /** Método Pagar */
    public boolean Pagar(float CantidadAPagar) {
        if (CantidadAPagar > 0) {
            System.out.println("Pagando " + CantidadAPagar + " por " + carrito.size() + " productos");
            this.metodoDePago = new MetodoDePago();
            if (CantidadAPagar > metodoDePago.getDinero()) {
                System.out.println("Dinero Insuficiente");
                return false;
            } else
                return true;
        } else
            return false;
    }

    /** Método Impresión Elementos En Carrito */
    public void ImprimirElementosCarrito() {
        for (int i = 0; i < carrito.size(); i++)
            System.out.println(carrito.get(i));
    }

    /** Método Impresión de Datos */
    public String ImprimirDatos() {
        MetodoDePago imprimirMetodo = this.getMetodoDePago();
        String Impresion = "Usuario: " + this.nombre + "\n" + imprimirMetodo.ImprimirMetodoDePago();
        return Impresion;
    }

    /** Getters */
    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public List<String> getCarrito() {
        return carrito;
    }

    public List<Float> getPrecios() {
        return precios;
    }

}