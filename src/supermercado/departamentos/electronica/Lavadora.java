package supermercado.departamentos.electronica;

public class Lavadora extends Electrodomestico{
    private int nivelesAgua;
    private int numeroCiclos;

    public Lavadora(){
        setPrecio((float) 7546.00);
        setCodigoIdentificacion("LM21KG");
        setMarca("Mabe");
        setPotencia((float) 1016);
        setVoltaje((float) 127);
        setColor("Blanca");
        setNivelesAgua(4);
        setNumeroCiclos(11);
    }

    public void setNivelesAgua(int nivelesAgua){
        this.nivelesAgua = nivelesAgua;
    }

    public int getNivelesAgua(){
        return nivelesAgua;
    }

    public void setNumeroCiclos(int numeroCiclos){
        this.numeroCiclos = numeroCiclos;
    }

    public int getNumeroCiclos(){
        return numeroCiclos;
    }
}
