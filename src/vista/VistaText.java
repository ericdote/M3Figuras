/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cercle;
import model.Figura;

/**
 *
 * @author ALUMNEDAM
 */
public class VistaText {

    Scanner lector = new Scanner(System.in);

    public static final String INTRODUIR_DIAGONAL = "Introdueix la diagonal: ";

    public static final String MISSATGE_SELECCIONA_FIGURA = "Introdueix el nom de la figura que vols modificar: ";

    public static final String MISSATGE_ERROR = "Valor no vàlid.";

    public static final String MISSATGE_CORRECTE = "FIGURA CREADA CORRECTAMENT.";

    public static final String MIDA_COSTATS = "Introdueix la mida del costat: ";

    public static final String NOM_COSTATS = "Introdueix el nombre de costats:";

    public static final String NOM_FIGURA = "Introdueix un nom per la figura:";

    public static final String INTRODUIR_RADI = "Introdueix la mida del radi:";

    public static final String INTRODUIR_BASEMAJOR = "Introdueix la mida de la  base major:";

    public static final String INTRODUIR_BASEMENOR = "Introdueix la mida de la  base menor:";

    public static final String INTRODUIR_ALTRUA = "Introdueix la mida de l'altura:";

    public static final String INTRODUIR_DIAGONALMAYOR = "Introdueix la mida de la diagonal mayor:";

    public static final String INTRODUIR_DIAGONALMENOR = "Introdueix la mida de la diagonal menorF:";

    public void mostrarMenuInicial() {
        System.out.print("MENu"
                + "1- Crear una nova figura.\n"
                + "2- Veure figura ja creada\n"
                + "3- Modificar figura.\n"
                + "0- Sortir.\n"
                + "\nOpcio: ");
    }

    public void mostrarSubmenuCercle() {
        System.out.println("1- Modificar radi."
                + "2- Tornar menú inicial."
                + "0- Sortir.");
    }

    public void mostrarSubmenuTrapezi() {
        System.out.println("1. Modificar mida costats."
                + "2. Tornar menú inicial."
                + "0. Sortir.\n"
                + "Opció:\n");
    }

    public void mostrarSubmenuRombe() {
        System.out.println("1. Modificar diagonal major."
                + "2. Modificar diagonal menor."
                + "3. Tornar menú inicial."
                + "0. Sortir."
                + "Opció: \n");
    }

    public void mostrarSubmenuRegular() {
        System.out.println("1. Modificar mida costats."
                + "2. Tornar menú inicial."
                + "0. Sortir."
                + "Opció: \n");
    }

    public void menuFigura() {
        System.out.println("\nQuina figura vols crear?\n"
                + "1- Cercle.\n"
                + "2- Regular.\n"
                + "3- Rombe.\n"
                + "4- Trapezi.\n"
                + "0- Tornar enrere.\n"
                + "Opció: \n");
    }

    public void menuVeureFigura() {
        System.out.println("\nQuina figura vols veure?\n"
                + "1- Cercle.\n"
                + "2- Regular.\n"
                + "3- Rombe.\n"
                + "4- Trapezi.\n"
                + "5- Totes"
                + "0- Tornar enrere.\n"
                + "Opció: \n");
    }

    public void menuModificarFigura() {
        System.out.println("\nQuina figura vols modificar?\n"
                + "1- Cercle.\n"
                + "2- Regular.\n"
                + "3- Rombe.\n"
                + "4- Trapezi.\n"
                + "0- Tornar enrere.\n"
                + "Opció: \n");
    }

    public void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }

    public int recollirOpcio() {
        return lector.nextInt();
    }

    public int recollirCostats() {
        return lector.nextInt();
    }

    public double introduirMida() {
        return lector.nextDouble();
    }

    public String recollirNomFigura() {
        return lector.next();
    }
    
    public int comprobarInt(){
        
    }


}
