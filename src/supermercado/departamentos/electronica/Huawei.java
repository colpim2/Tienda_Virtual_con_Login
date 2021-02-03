package supermercado.departamentos.electronica;

public class Huawei extends Celular {
    private boolean resistenciaAgua;

    public Huawei(String color) {
        setPrecio((float) 7899.00);
        setCodigoIdentificacion("SS20128");
        setMarca("HUAWEI");
        setModelo("P40");
        setPixeles(50);
        setRAM(8);
        setROM(128);
        setPantalla((float) 6.1);
        setColor("Rosa");
        setProcesador("Huawei Kirin 990");
        setSO("EMUI 10.1 (Basado en Android 10)");
        setLectorHuella(true);
        setBateria((float) 3800.00);
        setResistenciaAgua(true);
    }

    public void setResistenciaAgua(boolean resistenciaAgua){
        this.resistenciaAgua = resistenciaAgua;
    }

    public boolean geResistenciaAgua() {
        return resistenciaAgua;
    }
}