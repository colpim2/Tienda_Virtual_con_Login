package usuarios;

import java.io.*;
import java.util.Scanner;

public class Login {
    /** Atributos */
    private String correo;
    private String contrasena;
    private String nombre;
    private String calle;
    private String noExterior;
    private String noInterior;
    private String noTarjeta;
    private String cvv;
    public static final String separador = ",";

    public Login(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dirrección de correo electrónico: ");
        correo = teclado.nextLine();
    }

    public Login(String correo, String password){
        this.correo = correo;
        contrasena = password;
    }

    public void guardarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Password: ");
        contrasena = teclado.nextLine();
        System.out.print("DATOS PERSONALES\n\tNombre: ");
        nombre = teclado.nextLine();
        System.out.println("\tDIRECCION");
        System.out.print("\t\tCalle: ");
        calle = teclado.nextLine();
        System.out.print("\t\tNo. Exterior: ");
        noExterior = teclado.nextLine();
        System.out.print("\t\tNo. Interior: ");
        noInterior = teclado.nextLine();
        System.out.println("DATOS DE PAGO");
        System.out.print("\tno. Tarjeta: ");
        noTarjeta = teclado.nextLine();
        System.out.print("\tCVV: ");
        cvv = teclado.nextLine();
    }

    public boolean verificarRutas(){
        File directorioUsers = new File("./src/usuarios/UsersInfo");
        File archivoUsuarios = new File("./src/usuarios/UsersInfo/DataBase.csv");
        if(!directorioUsers.exists()) {
            if (directorioUsers.mkdir()) {
                try {
                    if (archivoUsuarios.createNewFile()) {
                        FileWriter fw = new FileWriter(archivoUsuarios);
                        fw.append("Correo,Password,Nombre,Calle,No. Exterior,No. Interior,No. Tarjeta,CVV\n");
                        fw.flush();
                        fw.close();
                        System.out.println("Directorio y archivo creados correctamente");
                    }
                }catch (IOException ioe) {
                    System.out.println("ERROR: No se pudo crear el archivo");
                    return false;
                }
            }
            else{
                System.out.println("ERROR: No se pudo crear el directorio");
                return false;
            }
        }
        else{
            if(!archivoUsuarios.exists()){
                try{
                    if(archivoUsuarios.createNewFile()){
                        FileWriter fw = new FileWriter(archivoUsuarios);
                        fw.append("Correo,Password,Nombre,Calle,No. Exterior,No. Interior,No. Tarjeta,CVV\n");
                        fw.flush();
                        fw.close();
                        System.out.println("Archivo creado correctamente");
                    }
                }catch(IOException ioe){
                    System.out.println("ERROR: No se pudo crear el archivo");
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public class correoInvalidoException extends Exception{
        public correoInvalidoException(){
            super("El formato del correo es invalido");
        }
    }

    public boolean verificarLogin(File rutaArchivo){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(rutaArchivo));
            String line = br.readLine();
            while(line != null) {
                String[] campos = line.split(separador);
                if (campos[0].equals(correo) && campos[1].equals(contrasena)){
                    nombre = campos[2];
                    calle = campos[3];
                    noExterior = campos[4];
                    noInterior = campos[5];
                    noTarjeta = campos[6];
                    cvv = campos[7];
                    return true;
                }
                line = br.readLine();
            }
        }catch(FileNotFoundException fnf){
            System.out.println("ERROR: El archivo que se quiere leer no existe");
            return false;
        }catch(IOException io){
            System.out.println("ERROR: No se pudo leer la informacion del archivo");
            return false;
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch(IOException io){
                    System.out.println("Problemas al cerrar el Buffer de lectura");
                }
            }
        }
        return false;
    }

    public boolean verificarRegistro(File rutaArchivo){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(rutaArchivo));
            String line = br.readLine();
            while(line != null){
                String [] campos = line.split(separador);
                if(campos[0].equals(correo)) return true;
                line = br.readLine();
            }
        }catch(FileNotFoundException fnf){
            System.out.println("ERROR: El archivo que se quiere leer no existe");
            return false;
        }catch(IOException io){
            System.out.println("ERROR: No se pudo leer la informacion del archivo");
            return false;
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch(IOException io){
                    System.out.println("Problemas al cerrar el Buffer de lectura");
                }
            }
        }
        return false;
    }

    public boolean iniciarSesion(){
        try {
            if (!correo.contains("@"))
                throw new correoInvalidoException();
            if(verificarRutas()) {
                File archivoUsuarios = new File("./src/usuarios/UsersInfo/DataBase.csv");
                return verificarLogin(archivoUsuarios);
            }
        }catch(correoInvalidoException inv){
            System.out.println("El correo introducido es invalido");
            return false;
        }
        return false;
    }

    public boolean guardarInfo(){
        if(verificarRutas()) {
            try {
                File archivoUsuarios = new File("./src/usuarios/UsersInfo/DataBase.csv");
                if (!verificarRegistro(archivoUsuarios)) {
                    this.guardarDatos();
                    String infoUsuario = correo + "," + contrasena + "," + nombre + "," + calle + "," + noExterior + "," + noInterior + "," + noTarjeta + "," + cvv;
                    FileWriter fw = new FileWriter(archivoUsuarios,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter textoSalida = new PrintWriter(bw);
                    textoSalida.println(infoUsuario);
                    textoSalida.close();
                    System.out.println("Informacion registrada corrctamente");
                    return true;
                }
            } catch(IOException io){
                System.out.println("ERROR: No se pudo modificar el archivo");
                return false;
            }
        }
        return true;
    }

    String getCorreo(){ return correo; }

    String getContrasena(){ return contrasena; }

    String getNombre(){ return nombre; }

    String getCalle(){ return calle; }

    String getNoExterior(){ return noExterior; }

    String getNoInterior(){ return noInterior; }

    String getNoTarjeta(){ return noTarjeta; }

    String getCvv(){ return cvv; }

}