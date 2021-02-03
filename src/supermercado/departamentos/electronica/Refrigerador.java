package supermercado.departamentos.electronica;

public class Refrigerador extends Electrodomestico {
    private int numeroAnaqueles;
    private int numeroCajones;
    private int numeroParrilas;

    public Refrigerador(){
        setPrecio((float) 4124.00);
        setCodigoIdentificacion("RH7P3");
        setMarca("HISENSE");
        setPotencia((float) 60);
        setVoltaje((float) 115);
        setColor("Rojo");
    }

    public void setNumeroAnaqueles(int numeroAnaqueles){
        this.numeroAnaqueles = numeroAnaqueles;
    }

    public int getNumeroAnaqueles(){
        return numeroAnaqueles;
    }

    public void setNumeroCajones(int numeroCajones){
        this.numeroCajones = numeroCajones;
    }

    public int getNumeroCajones(){
        return numeroCajones;
    }

    public void setNumeroParrilas(int numeroParrilas){
        this.numeroParrilas = numeroParrilas;
    }

    public int getNumeroParrilas(){
        return numeroParrilas;
    }
}
