
import usuarios.*;
import formas_de_entrega.*;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("========= ¡LOS TRES MOSQUETEROS! =========");
            System.out.println("Bienvenido. Por favor, selecciona la opción que desea ejecutar");
            System.out.print("1. Iniciar sesión\n2. Registrarse\n3. Salir del programa\nOpción: ");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Scanner lector = new Scanner(System.in);
                    System.out.println("======= INICIO DE SESIÓN =======");
                    System.out.print("Correo Electrónico: ");
                    String nombre = lector.nextLine();
                    System.out.print("Contraseña: ");
                    String password = lector.nextLine();
                    Login login = new Login(nombre,password);
                    if(!login.iniciarSesion()){
                        System.out.println("Lo sentimos, ocurrió un error al iniciar sesión. Registrese, si no lo ha hecho, o intente nuevamente");
                        opcion = 4;
                        break;
                    }

                    /** Se crea al usuario y administrador involucrados en la prueba */
                    Administradores admin = new Administradores("Juan Carlos", 123);
                    UsuarioNormal usuario = new UsuarioNormal(login);

                    System.out.println("Bienvenid@ " + usuario.getNombre() +". Esperamos que su recorrido por la tienda sea de su agrado.");

                    /** Simulación */
                    usuario.RecorrerSupermercado();

                    float CantidadAPagar = admin.EmitirRecibo(usuario.getPrecios());

                    if (usuario.Pagar(CantidadAPagar)) {
                        admin.RecibirPago(usuario.getMetodoDePago(), CantidadAPagar);

                        /** Elegir Método de Entrega */
                        int Opcion;
                        do {
                            System.out.println("¿Cuál método de entrega desea ocupar?");
                            System.out.print("1)En tienda \n2)A domicilio \nOpcion: ");
                            Opcion = teclado.nextInt();
                            switch (Opcion) {
                                case 1:
                                    long CantidadDeProductos = (usuario.getCarrito()).size();
                                    EnTienda tienda = new EnTienda(CantidadDeProductos);
                                    tienda.ImprimirRecibo(admin.nombre, usuario.getNombre(), usuario.getCarrito(), usuario.getPrecios(), CantidadAPagar);
                                    tienda.Empaquetar();
                                    break;
                                case 2:
                                    ADomicilio domicilio = new ADomicilio(usuario);
                                    domicilio.ImprimirRecibo(admin.nombre, usuario.getNombre(),usuario.getCarrito(), usuario.getPrecios(),CantidadAPagar);
                                    System.out.println("Fecha tentativa de entrega: " + domicilio.FechaDeEntrega());
                                    System.out.println(domicilio.PaqueteRecibido());
                                    break;
                            }
                        } while (Opcion > 1 && Opcion < 2);
                        System.out.println("Gracias por comprar con nosotros");
                    }

                    break;
                case 2:
                    System.out.println("======= REGISTRO =======");
                    Login registro = new Login();
                    if(registro.guardarInfo()){
                        System.out.println("Usuario ya registrado, por favor, inicie sesión");
                        break;
                    }
                    if(registro.guardarInfo())
                        System.out.println("Su información ha sido registrada correctamente. Puede iniciar sesión.");
                    else
                        System.out.println("Lo sentimos, ocurrió un error durante el proceso, por favor, intente nuevamente :3");
                    break;
            }
        }while(opcion != 3);
        System.out.println("Vuelva pronto. Lo estaremos esperando siempre en LOS TRES MOSQUETEROS, su supermercado de confianza. c:");
    }

}