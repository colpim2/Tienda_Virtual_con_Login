package usuarios;
import supermercado.departamentos.electronica.*;
import supermercado.departamentos.papeleria.*;
import supermercado.departamentos.viveres.*;
import supermercado.departamentos.ropa.*;
import supermercado.departamentos.zapatos.*;

import java.util.ArrayList;
import java.util.List;

public class UsuarioNormal {
    /** Atributos */
    private final String correo;
    private final String nombre;
    private final String calle;
    private final String noExterior;
    private final String noInterior;
    private final String noTarjeta;
    private final String cvv;
    private MetodoDePago metodoDePago;
    private List<String> carrito;
    private List<Float> precios;

    /** Método Constructor */
    public UsuarioNormal(Login login) {
        correo = login.getCorreo();
        nombre = login.getNombre();
        calle = login.getCalle();
        noExterior = login.getNoExterior();
        noInterior = login.getNoInterior();
        noTarjeta = login.getNoTarjeta();
        cvv = login.getCvv();

        this.carrito = new ArrayList<String>();
        this.precios = new ArrayList<Float>();
    }

    /** Método Recorrer Supermercado */
    public void RecorrerSupermercado() {
        System.out.println("Pasillo: Viveres");
        Cereal cereal = new Cereal();
        precios.add(cereal.getPrecio());
        carrito.add("Cereal");
        System.out.println("  Cereal "+cereal.getMarca()+" $"+cereal.getPrecio()+" agregado al carrito");
        Manzanas manzanas = new Manzanas();
        precios.add(manzanas.getPrecio());
        carrito.add("Manzanas");
        System.out.println("  Manzanas "+manzanas.getMarca()+" $"+manzanas.getPrecio()+" agregado al carrito");
        Platanos platanos = new Platanos();
        precios.add(platanos.getPrecio());
        carrito.add("Platanos");
        System.out.println("  Platanos "+platanos.getMarca()+" $"+platanos.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Papeleria");
        Cuadernos cuadernos = new Cuadernos();
        precios.add(cuadernos.getPrecio());
        carrito.add("Cuadernos");
        System.out.println("  Cuadernos "+cuadernos.getMarca()+" $"+cuadernos.getPrecio()+" agregado al carrito");
        Hojas hojas = new Hojas();
        precios.add(hojas.getPrecio());
        carrito.add("Hojas");
        System.out.println("  Hojas "+hojas.getMarca()+" $"+hojas.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Electronicos");
        Lavadora lavadora = new Lavadora();
        precios.add(lavadora.getPrecio());
        carrito.add("Lavadora");
        System.out.println("  Lavadora "+lavadora.getMarca()+" $"+lavadora.getPrecio()+" agregado al carrito");
        Refrigerador refrigerador = new Refrigerador();
        precios.add(refrigerador.getPrecio());
        carrito.add("Refrigerador");
        System.out.println("  Refrigerador "+refrigerador.getMarca()+" $"+refrigerador.getPrecio()+" agregado al carrito");
        IPhone iPhone = new IPhone("Gris");
        precios.add(iPhone.getPrecio());
        carrito.add("IPhone");
        System.out.println("  Celular "+iPhone.getMarca()+" $"+iPhone.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Ropa");
        Calcetines calcetines = new Calcetines("Mediano","Gris","Unisex","Algodon","Patos");
        precios.add(calcetines.getPrecio());
        carrito.add("Calcetines");
        System.out.println("  Calcetines $"+calcetines.getPrecio()+" agregado al carrito");
        Camisa camisa = new Camisa("Mediano","Azul","Masculino","Algodon",8,"Liso","Redondo");
        precios.add(camisa.getPrecio());
        carrito.add("Camisa");
        System.out.println("  Camisa $"+camisa.getPrecio()+" agregado al carrito");
        Pantalon pantalon = new Pantalon("Mediano","Azul","Masculino","Algodon","Recto",4);
        precios.add(pantalon.getPrecio());
        carrito.add("Pantalon");
        System.out.println("  Pantalon $"+pantalon.getPrecio()+" agregado al carrito");

        System.out.println("Pasillo: Zapatos");
        Sandalias sandalias = new Sandalias();
        precios.add(sandalias.getPrecio());
        carrito.add("Sandalias");
        System.out.println("  Sandalias $"+sandalias.getPrecio()+" agregado al carrito");
        Tacones tacones = new Tacones();
        precios.add(tacones.getPrecio());
        carrito.add("Tacones");
        System.out.println("  Tacones $"+tacones.getPrecio()+" agregado al carrito");
        Tenis tenis = new Tenis();
        precios.add(tenis.getPrecio());
        carrito.add("Tenis");
        System.out.println("  Tenis $"+tenis.getPrecio()+" agregado al carrito");
    }

    /** Método Pagar */
    public boolean Pagar(float CantidadAPagar) {
        try{
            ComprobarCantidadAPagar(CantidadAPagar);
            System.out.println("Pagando " + CantidadAPagar + " por " + carrito.size() + " productos");
            this.metodoDePago = new MetodoDePago(this.getNoTarjeta(),this.getCvv());
            try{
                ComprobarDinero(CantidadAPagar, metodoDePago.getDinero());
                return true;
            }
            catch (ExcepcionDineroInsuficiente dineroInsuficiente){
                System.out.println("Error: " + dineroInsuficiente);
                return false;
            }
        }
        catch (ExcepcionCantidadAPagar excepcionCantidadAPagar){
            System.out.println("Error: " + excepcionCantidadAPagar);
            return false;
        }
    }

    /** Excepción Propia Dinero Insuficiente */
    static class ExcepcionDineroInsuficiente extends Exception{
        private String detalle;

        ExcepcionDineroInsuficiente(float dinero){
            detalle = String.valueOf(dinero);
        }
        public String toString() {
            return "Dinero Insuficiente[" + detalle + "]";
        }

    }

    void ComprobarDinero(float CantidadAPagar, float dinero) throws ExcepcionDineroInsuficiente {
        if(CantidadAPagar > dinero) {
            throw new ExcepcionDineroInsuficiente(dinero);
        }
    }

    /** Excepción Propia Cantidad a Pagar = 0 */
    static class ExcepcionCantidadAPagar extends Exception{
        private String detalle;

        ExcepcionCantidadAPagar(float CantidadAPagar){
            detalle = String.valueOf(CantidadAPagar);
        }
        public String toString() {
            return "Cantidad a Pagar = " + detalle +"\n Lamentamos que no haya encontrado lo que buscaba";
        }
    }

    void ComprobarCantidadAPagar(float CantidadAPagar) throws ExcepcionCantidadAPagar {
        if(CantidadAPagar <= 0) {
            throw new ExcepcionCantidadAPagar(CantidadAPagar);
        }
    }


    /** Getters */
    public String getCorreo(){ return correo; }

    public String getNombre(){ return nombre; }

    public String getCalle(){ return calle; }

    public String getNoExterior(){ return noExterior; }

    public String getNoInterior(){ return noInterior; }

    public String getNoTarjeta(){ return noTarjeta; }

    public String getCvv(){ return cvv; }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public List<String> getCarrito() {
        return carrito;
    }

    public List<Float> getPrecios() {
        return precios;
    }

}