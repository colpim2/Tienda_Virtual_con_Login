package usuarios;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Registro {
    /** Atributos */
    private String nombre;
    private int noExterior;
    private int noInterior;
    private long noTarjeta;
    private int cvv;

    public Registro(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("DIRECCION");
        System.out.print("\tCalle: ");
        String calle = teclado.nextLine();
        System.out.print("\tNo. Exterior: ");
        noExterior = teclado.nextInt();
        System.out.print("\tNo. Interior: ");
        noInterior = teclado.nextInt();
        System.out.println("DATOS DE PAGO");
        System.out.println("no. Tarjeta: ");
        noTarjeta = teclado.nextLong();
        System.out.println("CVV: ");
        cvv = teclado.nextInt();
    }

    public int verificarRutas(){
        File directorioUsers = new File("./src/usuarios/UsersInfo");
        File archivoUsuarios = new File("./src/usuarios/UsersInfo/DataBase");
        if(!directorioUsers.exists()) {
            if (directorioUsers.mkdir()) {
                try {
                    if (archivoUsuarios.createNewFile())
                        System.out.println("Directorio y archivo creados correctamente");
                }catch (IOException ioe) {
                    System.out.println("ERROR: No se pudo crear el archivo");
                    return 0;
                }
            }
            else{
                System.out.println("ERROR: No se pudo crear el directorio");
                return 0;
            }
        }
        else{
            if(!archivoUsuarios.exists()){
                try{
                    if(archivoUsuarios.createNewFile()){
                        System.out.println("Archivo creado correctamente");
                    }
                }catch(IOException ioe){
                    System.out.println("ERROR: No se pudo crear el archivo");
                    return 0;
                }
            }
            return 1;
        }
        return 1;
    }

    public int guardarInfo(){
        if(verificarRutas() != 0){
            File archivoUsuarios = new File("./src/usuarios/UsersInfo/DataBase");
        }
        else{
            return 0;
        }
        return 1;
    }

}
