package formas_de_entrega;

import usuarios.UsuarioNormal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ADomicilio {
    /** Atributos */
    private Direccion direccion;
    private int contador = 0;

    /** Método Constructor */
    public ADomicilio(UsuarioNormal usuario) {
        this.direccion = new Direccion(usuario);
        contador += 1;
    }

    /** Método Programar fecha de entrega */
    public String FechaDeEntrega() {
        return "31-Feb-2020";
    }

    /** Método para Generar los Archivos y Directorios Necesarios */
    private int GenerarArchivos(String cliente){
        String pathRecibo = "./recibos/Recibo_" +cliente + "_ADomicilio_"+ contador +".txt";;

        File directorioRecibo= new File("./recibos");
        File archivoRecibo = new File(pathRecibo);

        /** Validar Rutas */
        if(!directorioRecibo.exists()) {
            if (directorioRecibo.mkdir())
                try {
                    if (archivoRecibo.createNewFile()){
                        return 0;
                    }
                    else{
                        System.out.println("Sobreescribiendo Archivo");
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
                else{
                    System.out.println("Sobreescribiendo Archivo");
                    return 0;
                }
            }catch (IOException ioe) {
                System.out.println("ERROR: No se pudo crear el archivo");
                return 1;
            }
        }
    }

    /** Método GuardarRecibo */
    private void GuardarRecibo(String atendidoPor,String cliente, List<String> productos, List<Float> precios, float CantidadAPagar){
        String pathRecibo = "./recibos/Recibo_" +cliente + "_ADomicilio_"+ contador +".txt";
        File archivoRecibo= new File(pathRecibo);
        try{
            FileWriter archivoOut = new FileWriter(archivoRecibo, false);

            String texto = "==== ¡LOS TRES MOSQUETEROS! ====\n--------------------------------\n";
            texto += "ARTICULO         PRECIO:";
            for (int i = 0; i < productos.size(); i++)
                texto += "\n  " +productos.get(i)+" -------> "+precios.get(i);
            texto += "\nTotal M.N.$ : " + CantidadAPagar+"\n";

            //Información Cliente
            texto += "\n    CLIENTE: "+cliente;
            texto += "\n\nTOTAL DE ARTICULOS VENDIDOS = " + productos.size()+ "\n  Atendido por: "+ atendidoPor;

            //Fecha actual
            DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            texto += "\n  " + FormatoFecha.format(now);

            texto += "\n\nDATOS DE ENVIO: " + direccion.ImprimirDireccion();
            texto += "\n\nFecha tentativa de entrega:" + this.FechaDeEntrega();

            archivoOut.write(texto,0,texto.length());
            archivoOut.flush();
            archivoOut.close();
        }
        catch (IOException ioException){
            System.out.println("ERROR: No se pudo abrir el archivo");
        }
    }

    /** Método Imprimir Recibo */
    public void ImprimirRecibo(String atendidoPor,String cliente,List<String> productos,List<Float> precios,float CantidadAPagar) {
        System.out.println("Generando su recibo ... espere un momento");
        if (this.GenerarArchivos(cliente)!=1){
            this.GuardarRecibo(atendidoPor,cliente,productos,precios,CantidadAPagar);
            System.out.println("Recibo: Recibo_" +cliente + "_ADomicilio_" +contador +".txt generado");
        }
    }


    /** Método Paquete enviado */
    public String PaqueteRecibido() {
        return "Su paquete lo esta esperando en la puerta del domicilio:" + direccion.ImprimirDireccion();

    }
}