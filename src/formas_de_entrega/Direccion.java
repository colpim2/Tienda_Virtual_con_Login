package formas_de_entrega;

import java.util.Scanner;

public class Direccion {
    /** Atributos */
    private long telefono;
    private String calle;
    private String colonia;
    private int numeroPostal;

    /** Método Constructor */
    public Direccion() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Direccion\n   Calle: ");
            this.calle = teclado.nextLine();
            System.out.print("   Colonia: ");
            this.colonia = teclado.nextLine();
            System.out.print("   Numero Postal: ");
            this.numeroPostal = teclado.nextInt();
            System.out.print("   Numero Telefonico: ");
            this.telefono = teclado.nextLong();
        }
    }

    /**  Método Impresion Datos */
    public String ImprimirDireccion() {
        return "\n   Calle: " + this.getCalle() + "\n   Colonia: " + this.getColonia() + "\n   Codigo Postal: " + this.getNumeroPostal() + "\n   Numero Telefonico: " + this.getNumeroTelefonico();
    }

    /** Getters */
    public String getCalle() {
        return calle;
    }

    public String getColonia() {
        return colonia;
    }

    public int getNumeroPostal() {
        return numeroPostal;
    }

    public long getNumeroTelefonico() {
        return telefono;
    }

}