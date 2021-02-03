package formas_de_entrega;

public class ADomicilio {
    /** Atributos */
    private Direccion direccion;

    /** Método Constructor */
    public ADomicilio() {
        this.direccion = new Direccion();
    }

    /** Método Programar fecha de entrega */
    public String FechaDeEntrega() {
        return "31-Feb-2020";
    }

    /** Método Paquete enviado */
    public String PaqueteRecibido() {
        String Impresion = "Su paquete lo esta esperando en la puerta del domicilio:" + direccion.ImprimirDireccion();
        return Impresion;
    }
}