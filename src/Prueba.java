
import usuarios.*;
import formas_de_entrega.*;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("========= NombreTienda =========");
            System.out.println("Bienvenido. Por favor, selecciona la opción que desea ejecutar");
            System.out.println("1. Iniciar sesión\n2.Registrarse\n3.Salir del programa\nOpción: ");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\n\n");
                    break;

                case 2:
                    System.out.println("======= REGISTRO =======");
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.println("DIRECCION");
                    System.out.print("\tCalle: ");
                    String calle = teclado.nextLine();
                    System.out.print("\tNo. Exterior: ");
                    int noExterior = teclado.nextInt();
                    System.out.print("\tNo. Interior: ");
                    int noInterior = teclado.nextInt();
                    System.out.println("DATOS DE PAGO");
                    System.out.println("no. Tarjeta: ");
                    long noTarjeta = teclado.nextLong();
                    System.out.println("CVV: ");
                    int cvv = teclado.nextInt();
                    System.out.println("Procesando datos. Un momento por favor...");

            }


        /** Se crea al usuario y administrador involucrados en la prueba */
        Administradores admin = new Administradores("Juan Carlos",123);
        UsuarioNormal usuario = new UsuarioNormal();

        /** Simulación */
        usuario.RecorrerSupermercado();

        float CantidadAPagar = admin.EmitirRecibo(usuario.getPrecios());

        if (usuario.Pagar(CantidadAPagar) == true ) {
            admin.RecibirPago(usuario.getMetodoDePago(),CantidadAPagar);

            /** Elegir Método de Entrega */
            int Opcion;
            do{
                System.out.println("¿Cuál método de entrega desea ocupar?");
                System.out.print("1)En tienda \n2)A domicilio \nOpcion: ");
                Scanner teclado = new Scanner(System.in);
                Opcion = teclado.nextInt();
                switch(Opcion){
                    case 1:
                        long CantidadDeProductos = (usuario.getCarrito()).size();
                        EnTienda tienda = new EnTienda(CantidadDeProductos);
                        tienda.ImprimirRecibo(admin.nombre, usuario.getCarrito(), usuario.getPrecios(), CantidadAPagar);
                        tienda.Empaquetar();
                        break;
                    case 2:
                        ADomicilio domicilio = new ADomicilio();
                        System.out.println("Fecha tentativa de entrega: "+domicilio.FechaDeEntrega());
                        System.out.println(domicilio.PaqueteRecibido());
                        break;
                }
            } while (Opcion > 1 && Opcion < 2);
            System.out.println("Gracias por comprar con nosotros");
        }
        else
            System.out.println("...bai");
    }

}