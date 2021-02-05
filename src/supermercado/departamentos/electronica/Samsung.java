package supermercado.departamentos.electronica;

import supermercado.departamentos.Productos;
import supermercado.departamentos.electronica.Celular;


public class Samsung extends Celular{
    public Samsung(String color) {
        setPrecio((float) 17289.00);
        setCodigoIdentificacion("SS20128");
        setMarca("SAMSUNG");
        setModelo("Galaxy S20");
        setPixeles(64);
        setRAM(8);
        setROM(128);
        setPantalla((float) 6.2);
        setColor("Azul");
        setProcesador("Exynos 990");
        setSO("Android 10");
        setLectorHuella(true);
        setBateria((float) 4000.00);
    }
}