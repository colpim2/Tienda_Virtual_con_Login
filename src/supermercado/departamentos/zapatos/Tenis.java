package supermercado.departamentos.zapatos;

public class Tenis extends Calzado {
    private boolean agujetas;

    /**
     * Constructor preeestablecido
     */
    public Tenis() {
        setPrecio((float) 300.00);
    }

    /**
     * Getters y Setters
     */
    public boolean getAgujetas() {
        return agujetas;
    }

    public void setAgujetas(boolean agujetas) {
        this.agujetas = agujetas;
    }
}
