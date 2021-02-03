package supermercado.departamentos.zapatos;

public class Tacones extends Calzado {
    private int tamanoTacon;

    /**
     * Constructor preestablecido
     */
    public Tacones() {
        setPrecio((float) 300.00);
    }

    /**
     * Getters y Setters
     */
    public int getTamanoTacon() {
        return tamanoTacon;
    }

    public void setTamanoTacon(int tamanoTacon) {
        this.tamanoTacon = tamanoTacon;
    }
}
