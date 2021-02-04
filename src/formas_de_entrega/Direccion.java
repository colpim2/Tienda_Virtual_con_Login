package formas_de_entrega;

import usuarios.UsuarioNormal;

import java.util.Scanner;

public class Direccion {
    /** Atributos */
    private String calle;
    private String noExterior;
    private String noInterior;

    /** Método Constructor */
    public Direccion(UsuarioNormal usuario) {
            calle = usuario.getCalle();
            noExterior = usuario.getNoExterior();
            noInterior = usuario.getNoInterior();
    }

    /**  Método Impresion Datos */
    public String ImprimirDireccion() {
        return "\n   Calle: " + this.getCalle() + "\n   No.Exterior: " + this.getNoExterior() + "\n   No.Interior: " + this.getNoInterior();
    }

    /** Getters */
    public String getCalle() {
        return calle;
    }

    public String getNoExterior() {
        return noExterior;
    }

    public String getNoInterior() {
        return noInterior;
    }

}