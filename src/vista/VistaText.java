package vista;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class VistaText {

    //Scanner per poder agafar les dades que introduira el usuario
    Scanner lector = new Scanner(System.in);
    //Tots els string que venen ara son pels diferents SOUTS que es mostren per pantalla a l'usuari tant per confirmar, denegar valors com per demanar o mostrar dades.
    public static final String INTRODUIR_DIAGONAL = "Introdueix la diagonal: ";

    public static final String MISSATGE_SELECCIONA_FIGURA = "Introdueix el nom de la figura que vols modificar: ";

    public static final String MISSATGE_ERROR = "Aquest valor no es valid";

    public static final String MISSATGE_CORRECTE = "La figura ha sigut creada correctament!";

    public static final String MIDA_COSTATS = "Introdueix la mida del costat: ";

    public static final String NUMERO_COSTATS = "Introdueix el numero de costats: ";

    public static final String NOM_FIGURA = "Introdueix un nom per la figura: ";

    public static final String INTRODUIR_RADI = "Introdueix la mida del radi: ";

    public static final String INTRODUIR_BASEMAJOR = "Introdueix la mida de la  base major: ";

    public static final String INTRODUIR_BASEMENOR = "Introdueix la mida de la  base menor :";

    public static final String INTRODUIR_ALTURA = "Introdueix la mida de l'altura:";

    public static final String INTRODUIR_DIAGONALMAJOR = "Introdueix la mida de la diagonal mayor: ";

    public static final String INTRODUIR_DIAGONALMENOR = "Introdueix la mida de la diagonal menor: ";

    /**
     * Menu inicial amb el que comenza el programa i on podem accedir a els
     * altres menus.
     */
    public void mostrarMenuInicial() {
        System.out.println("\n\n\tMENU PRINCIPAL\n"
                + "-------------------------------------\n"
                + "1- Crear nova figura\n"
                + "2- Veure figura ja creada\n"
                + "3- Modificar figura\n"
                + "0- Sortir del programa");
    }

    /**
     * Submenu el cual permet modificar el cercle
     */
    public void mostrarSubmenuCercle() {
        System.out.println("\n1- Modificar el radi\n"
                + "2- Tornar al menu inicial\n"
                + "0- Sortir");
    }

    /**
     * Submenu el cual permet modificar el trapezi
     */
    public void mostrarSubmenuTrapezi() {
        System.out.println("\n1- Modificar mida costats\n"
                + "2- Tornar menú inicial\n"
                + "0- Sortir");
    }

    /**
     * Submenu el cual permet modificar el rombe
     */
    public void mostrarSubmenuRombe() {
        System.out.println("\n1- Modificar diagonal major\n"
                + "2- Modificar diagonal menor\n"
                + "3- Tornar menú inicial\n"
                + "0- Sortir");
    }

    /**
     * Submenu el cual permet modificar el regular
     */
    public void mostrarSubmenuRegular() {
        System.out.println("\n1- Modificar mida costats\n"
                + "2- Tornar menú inicial\n"
                + "0- Sortir");
    }

    /**
     * Menu que es mostra per poder crear les figures
     */
    public void menuFigura() {
        System.out.println("\nQuina figura vols crear?\n"
                + "1- Cercle\n"
                + "2- Regular\n"
                + "3- Rombe\n"
                + "4- Trapezi\n"
                + "0- Tornar enrere");
    }

    /**
     * Menu que es mostra per poder veure les figures
     */
    public void menuVeureFigura() {
        System.out.println("\nQuina figura vols veure?\n"
                + "1- Cercle\n"
                + "2- Regular\n"
                + "3- Rombe\n"
                + "4- Trapezi\n"
                + "5- Totes\n"
                + "0- Tornar enrere");
    }

    /**
     * Menu que es mostra per poder modificar les figures
     */
    public void menuModificarFigura() {
        System.out.println("\nQuina figura vols modificar?\n"
                + "1- Cercle\n"
                + "2- Regular\n"
                + "3- Rombe\n"
                + "4- Trapezi\n"
                + "0- Tornar enrere");
    }

    /**
     * Metode que mostra tots els missatges predeterminats del programa quan es
     * demani.
     *
     * @param missatge
     */
    public void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }

    /**
     * Metode que li arriba per parametre el rang de opcions que hi ha per poder
     * comporbar. Primer es mira si la opcio que vol escogir es un numero,
     * despres si esta en el rang. Un cop esta dins del rang es retorna com
     * opcio correcta per poder continuar amb el proces que es vol realitzar.
     *
     * @param rango
     * @return
     */
    public int recollirOpcio(int rango) {
        int opcio;
        do {
            if (!lector.hasNextInt()) {
                System.err.println("Ha de ser un numero enter");
                lector.next();
            } else {
                opcio = lector.nextInt();
                if (opcio <= rango && opcio >= 0) {
                    break;
                } else {
                    System.err.println("Ha de ser un numero entre 0 i " + rango);
                }
            }
        } while (true);
        return opcio;
    }

    /**
     * Aquest metode mira si el numero de costats escogits pel usuari es un
     * numero, en cas de ser numero mira si es superior a 0 Si es superior a 0
     * retorna el numero de costats com numero valid, per poder continuar amb la
     * creacio/modificacio d'una figura.
     *
     * @return
     */
    public int recollirCostats() {
        int opcio;
        do {
            if (!lector.hasNextInt()) {
                System.err.println("Ha de ser un numero enter");
                lector.next();
            } else {
                opcio = lector.nextInt();
                if (opcio > 0) {
                    break;
                } else {
                    System.err.println("Ha de ser un numero superior a 0");
                }
            }
        } while (true);
        return opcio;
    }

    /**
     * Aquest metode lo que fa es que recogeix el nom de la figura i el pasa a
     * majuscules per despres si es busca o s'ha de modificar Que sigui mes
     * facil de trobar amb el toUPPERCASE
     *
     * @return
     */
    public String recollirNomFigura() {
        String nom;
        nom = lector.next().toUpperCase();
        return nom;
    }

    /**
     * Aquest metode mira que la mesura introduida per l'usuari sigui un numero
     * real. En cas de ser un numero real mira si es superior a 0 En cas de ser
     * superior a 0 retorna el valor com a valid per poder crear l'objecte o
     * modificar-lo.
     *
     * @return
     */
    public double introduirMida() {
        double mida;
        do {
            if (!lector.hasNextDouble()) {
                System.err.println("Ha de ser un numero real");
                lector.next();
            } else {
                mida = lector.nextDouble();
                if (mida > 0) {
                    break;
                }
            }
        } while (true);
        return mida;
    }
}
