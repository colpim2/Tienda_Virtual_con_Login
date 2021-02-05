package supermercado.departamentos.zapatos;

public class Sandalias extends Calzado {
    private String tipoSandalia;

    public Sandalias() {
        setPrecio((float) 100.00);
    }

    /**
     * Getters y Setters
     */
    public String getTipoSandalia() {
        return tipoSandalia;
    }

    public void setTipoSandalia(String tipoSandalia) {
        this.tipoSandalia = tipoSandalia;
    }
}
