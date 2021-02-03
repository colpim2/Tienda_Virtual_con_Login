package com.poo.practica6.supermercado.departamentos;

import com.poo.practica6.supermercado.departamentos.*;
import com.poo.practica6.supermercado.departamentos.electronica.*;
import com.poo.practica6.supermercado.departamentos.papeleria.*;
import com.poo.practica6.supermercado.departamentos.viveres.*;

public class PruebaProductos{

    public static void main(String [] args){
        Productos cel1 = new Samsung("Azul");
        Productos cel2 = new IPhone("Rosa");
        Productos cel3 = new Huawei("Blanco");

        System.out.println("Celular " + cel1.getMarca());
        System.out.println("Celular " + cel2.getMarca());
        System.out.println("Celular " + cel3.getMarca());

        Productos elec1 = new Lavadora();
        Productos elec2 = new Refrigerador();

        System.out.println("Lavadora " + elec1.getMarca());
        System.out.println("Refrigerador " +  elec2.getMarca());

        Productos pap1 = new Cuadernos();
        Productos pap2 = new Hojas();

        System.out.println("Cuadernos " + pap1.getMarca());
        System.out.println("Hojas Blancas " + pap2.getMarca());

        Productos vive1 = new Manzanas();
        Productos vive2 = new Platanos();
        Productos vive3 = new Cereal();

        System.out.println("1 KG de manzanas " + vive1.getMarca());
        System.out.println("1 KG de platanos " + vive2.getMarca());
        System.out.println("Cereal Corn Flakes " + vive3.getMarca());
    }
}

