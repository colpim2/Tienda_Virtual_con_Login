package formas_de_entrega;

import java.util.List;

public class EnTienda {
    /** Atributos */
    public long cantidadBolsas;

    /** Método Constructor */
    public EnTienda(long CantidadDePoductos) {
        this.cantidadBolsas = Math.round(CantidadDePoductos/3);
    }

    /** Método Imprimir Recibo */
    public void ImprimirRecibo(String nombre,List<String> productos,List<Float> precios,float CantidadAPagar) {
        System.out.println("Atendido por: "+nombre+"\nProductos comprados:");
        for (int i = 0; i < productos.size(); i++)
            System.out.println("  "+productos.get(i)+" -------> "+precios.get(i));
        System.out.println("Total: "+CantidadAPagar);
    }

    /** Método Empaquetar */
    public void Empaquetar() {
        for (int i = 0; i <= cantidadBolsas; i++) {
            System.out.println("Empaquetando...");
            System.out.println("Bolsa Llena...");
        }
        System.out.println("Total de bolsas: "+cantidadBolsas);
    }
}