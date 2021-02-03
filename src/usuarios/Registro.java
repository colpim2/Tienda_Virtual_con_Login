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

    public void guardarInfo(){
        File directorioUsers = new File("./src/usuarios/UsersInfo");
        if(!directorioUsers.exists()) {
            if (directorioUsers.mkdir()) {
                System.out.println("Directorio creado correctamente.");
            }
        }
        else{
            System.out.println("No se pudo crear el directorio");
        }
    }
}
