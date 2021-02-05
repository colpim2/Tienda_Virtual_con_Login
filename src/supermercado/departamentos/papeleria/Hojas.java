package supermercado.departamentos.papeleria;

import supermercado.departamentos.Productos;

/** Clase hojas que hereda de la clase Productos */
public class Hojas extends Productos{
    private int numeroHojas;
    private float porcentajeBlancura;

    /** Constructor preestablecido de la clase Hojas*/
    public Hojas(){
        setPrecio((float) 113.00);
        setCodigoIdentificacion("HX99PB");
        setMarca("XEROX");
        setnumeroHojas(500);
        setPorcentajeBlancura((float)99.9);
    }

    /**
     * Getters y Setters
     */
    public void setnumeroHojas(int numeroHojas){
        this.numeroHojas = numeroHojas;
    }

    public int getNumeroHojas(){
        return numeroHojas;
    }

    public void setPorcentajeBlancura(float porcentajeBlancura){
        this.porcentajeBlancura = porcentajeBlancura;
    }

    public float getPorcentajeBlancura(){
        return porcentajeBlancura;
    }
}
