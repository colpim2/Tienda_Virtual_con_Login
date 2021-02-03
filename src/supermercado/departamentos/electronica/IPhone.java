package supermercado.departamentos.electronica;



public class IPhone extends Celular{
    private boolean reconocimientoFacial;
    private boolean resistenciaAgua;

    public IPhone(String color){
        setPrecio((float) 17289.00);
        setCodigoIdentificacion("SS20128");
        setMarca("APPLE");
        setModelo("iPhone 12");
        setPixeles(64);
        setRAM(4);
        setROM(128);
        setPantalla((float) 6.1);
        setColor("Gris");
        setProcesador("Apple A14 Bionic");
        setSO("iOS 14");
        setLectorHuella(true);
        setBateria((float) 2775.00);
        setReconocimientoFacial(true);
        setResistenciaAgua(true);
    }

    public void setReconocimientoFacial(boolean reconocimientoFacial){
        this.reconocimientoFacial = reconocimientoFacial;
    }

    public boolean getReconocimientoFacial(){
        return reconocimientoFacial;
    }

    public void setResistenciaAgua(boolean resistenciaAgua){
        this.resistenciaAgua = resistenciaAgua;
    }

    public boolean getResistenciaAgua() {
        return resistenciaAgua;
    }
}
