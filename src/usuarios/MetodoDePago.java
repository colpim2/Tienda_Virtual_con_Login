package usuarios;

import java.util.Scanner;

public class MetodoDePago {
    /** Atributos */
    private long tarjeta;
    private int cvv;
    private float dinero;

    /** Método Constructor */
    public MetodoDePago() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Método de Pago\n   Número tarjeta: ");
        this.tarjeta = teclado.nextLong();
        System.out.print("   CVV: ");
        this.cvv = teclado.nextInt();

        this.dinero = 100000;
    }

    /** Método Impresién Datos */
    public String ImprimirMetodoDePago() {
        String Impresion = "Método de pago\n   Tarjeta: " + this.getTarjeta() + "\n   CCV: " + this.getCVV();
        return Impresion;
    }

    /** Getters */
    public long getTarjeta() {
        return tarjeta;
    }

    public int getCVV() {
        return cvv;
    }

    public float getDinero() {
        return dinero;
    }

    /**  Setters */
    public void setDinero(float Cantidad) {
        this.dinero = Cantidad;
    }
}