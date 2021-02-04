package formas_de_entrega;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EnTienda {
    /** Atributos */
    public long cantidadBolsas;
    private int contador = 0;

    /** Método Constructor */
    public EnTienda(long CantidadDePoductos) {
        this.cantidadBolsas = Math.round(CantidadDePoductos/3);
        contador += 1;
    }

    /** Método para Generar los Archivos y Directorios Necesarios */
    private int GenerarArchivos(){
        String pathRecibo = "./recibos/Recibo"+ contador +".txt";

        File directorioRecibo= new File("./recibos");
        File archivoRecibo = new File(pathRecibo);

        /** Validar Rutas **/
        if(!directorioRecibo.exists()) {
            if (directorioRecibo.mkdir())
                try {
                    if (archivoRecibo.createNewFile()){
                        return 0;
                    }
                }catch (IOException ioe) {
                    System.out.println("ERROR: No se pudo crear el archivo");
                    return 1;
                }
            else{
                System.out.println("ERROR: No se pudo crear el directorio");
                return 1;
            }
        }
        else{
            try {
                if (archivoRecibo.createNewFile()){
                    return 0;
                }
            }catch (IOException ioe) {
                System.out.println("ERROR: No se pudo crear el archivo");
                return 1;
            }
        }
        return 1;
    }

    /** Método GuardarRecibo */
    private void GuardarRecibo(String nombre,List<String> productos,List<Float> precios,float CantidadAPagar){
        String pathRecibo = "./recibos/Recibo_"+ contador +".txt";
        File recibo= new File(pathRecibo);

        System.out.println("Atendido por: "+nombre+"\nProductos comprados:");
        for (int i = 0; i < productos.size(); i++)
            System.out.println("  "+productos.get(i)+" -------> "+precios.get(i));
        System.out.println("Total: "+CantidadAPagar);
    }

    /** Método Imprimir Recibo */
    public void ImprimirRecibo(String nombre,List<String> productos,List<Float> precios,float CantidadAPagar) {
        System.out.println("Generando su recibo ... espere un momento");
        if (this.GenerarArchivos()!=1){
            this.GuardarRecibo(nombre,productos,precios,CantidadAPagar);
            System.out.println("Recibo: Recibo_" +contador +".txt generado");
        }
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