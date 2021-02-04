package usuarios;

public class MetodoDePago {
    /** Atributos */
    final String tarjeta;
    final String cvv;
    private float dinero;

    /** Método Constructor */
    public MetodoDePago(String tarjeta,String cvv) {
        this.tarjeta = tarjeta;
        this.cvv = cvv;

        this.dinero = 100000;
    }

    /** Método Impresién Datos */
    public String ImprimirMetodoDePago() {
        return "Método de pago\n   Tarjeta: " + this.getTarjeta() + "\n   CCV: " + this.getCVV();
    }

    /** Getters */
    public String getTarjeta() {
        return tarjeta;
    }

    public String getCVV() {
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