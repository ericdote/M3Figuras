package control;

import java.util.ArrayList;
import model.Cercle;
import model.Figura;
import model.Regular;
import model.Rombe;
import model.Trapezi;
import vista.VistaText;

/**
 *
 * @author Eric
 */
public class ControlText {

    //Instancia de la clase Vista Text i creacio del ArrayList que contindra totes les figures creades
    VistaText vt = new VistaText();
    ArrayList<Figura> figures = new ArrayList();

    /**
     * Metode que crida al menu inicial de vt, y envia en funcio de la resposta
     * del usuari a un menu secundari o altre
     */
    public void menuInicial() {
        int opcio, rango = 3;
        do {
            vt.mostrarMenuInicial();
            opcio = vt.recollirOpcio(rango);
            switch (opcio) {
                case 1:
                    menuSeleccioFigura(opcio);
                    break;
                case 2:
                    menuSeleccioFigura(opcio);
                    break;
                case 3:
                    menuSeleccioFigura(opcio);
                case 0:
                    System.exit(0);
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (true);
    }

    /**
     * Metode que li arriba la opcio seleccionada per l'usuari al menu
     * principal. En funcio de la opcio seleccionada al metode s'envia a una
     * opcio o altre(creacio, visualitzacio o modificacio) Un cop aqui es mostra
     * el menu corresponent a la eleccio anterior i el usuari pot seleccionar
     * una opcio que se li mostra amb el menu corresponent del vt.
     *
     * @param opcioMenu
     */
    public void menuSeleccioFigura(int opcioMenu) {
        int opcio, rango;
        do {
            switch (opcioMenu) {
                case 1:
                    vt.menuFigura();
                    rango = 4;
                    opcio = vt.recollirOpcio(rango);
                    switch (opcio) {
                        case 1:
                            crearCercle();
                            break;
                        case 2:
                            crearRegular();
                            break;
                        case 3:
                            crearRombe();
                            break;
                        case 4:
                            crearTrapezi();
                            break;
                        case 0:
                            break;
                        default:
                            vt.mostrarMissatge(vt.MISSATGE_ERROR);
                    }
                    break;
                case 2:
                    vt.menuVeureFigura();
                    rango = 5;
                    opcio = vt.recollirOpcio(rango);
                    switch (opcio) {
                        case 1:
                            for (Figura figure : figures) {
                                if (figure instanceof Cercle) {
                                    System.out.println(figure);
                                }
                            }
                            break;
                        case 2:
                            for (Figura figure : figures) {
                                if (figure instanceof Regular) {
                                    System.out.println(figure);
                                }
                            }
                            break;
                        case 3:
                            for (Figura figure : figures) {
                                if (figure instanceof Rombe) {
                                    System.out.println(figure);
                                }
                            }
                            break;
                        case 4:
                            for (Figura figure : figures) {
                                if (figure instanceof Trapezi) {
                                    System.out.println(figure);
                                }
                            }
                            break;
                        case 5:
                            for (Figura figure : figures) {
                                System.out.println(figure);
                            }
                            break;
                        default:
                            vt.mostrarMissatge(vt.MISSATGE_ERROR);
                            break;
                    }
                    break;
                case 3:
                    vt.menuModificarFigura();
                    rango = 4;
                    opcio = vt.recollirOpcio(rango);
                    switch (opcio) {
                        case 1:
                            menuCercle();
                            break;
                        case 2:
                            menuRegular();
                            break;
                        case 3:
                            menuRombe();
                            break;
                        case 4:
                            menuTrapezi();
                            break;
                        case 0:
                            break;
                        default:
                            vt.mostrarMissatge(vt.MISSATGE_ERROR);
                            break;
                    }
                    break;
                default:
                    break;
            }
            break;
        } while (opcio != 0);
    }

    /**
     * En aquest metode controlem tot lo que te que veure amb l'edicio de un
     * objecte cercle. Es mostra el submenu de Cercle cridant a vt. I es demana
     * escogir una opcio. En el cas de la primer opcio demana seleccionar una
     * figura, la busca i permet editar el radi. La segona opcio ens fa tornar
     * al menu Inicial. La tercera acaba el programa.
     */
    public void menuCercle() {
        int opcio, rango = 2;
        String nom;
        Cercle c;
        double radi;
        do {
            vt.mostrarSubmenuCercle();
            opcio = vt.recollirOpcio(rango);
            switch (opcio) {
                case 1:
                    vt.mostrarMissatge(vt.MISSATGE_SELECCIONA_FIGURA);
                    nom = vt.recollirNomFigura();
                    for (Figura figure : figures) {
                        if ((figure instanceof Cercle) && ((Cercle) figure).getNom().equals(nom)) {
                            c = (Cercle) figure;
                            vt.mostrarMissatge(vt.INTRODUIR_RADI);
                            radi = vt.introduirMida();
                            if (c.getRadi() != radi) {
                                c.setRadi(radi);
                                vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
                            }
                        }
                    }
                    break;
                case 2:
                    menuInicial();
                    break;
                case 0:
                    System.exit(0);
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (true);
    }

    /**
     * En aquest metode controlem tot lo que te que veure amb l'edicio de un
     * objecte regular. Es mostra el submenu de Regular cridant a vt. I es
     * demana escogir una opcio. En el cas de la primer opcio demana seleccionar
     * una figura, la busca i permet editar la mida dels costats. La segona
     * opcio ens fa tornar al menu Inicial. La tercera acaba el programa.
     */
    public void menuRegular() {
        int opcio, rango = 2;
        String nom;
        Regular r;
        double mida;
        do {
            vt.mostrarSubmenuRegular();
            opcio = vt.recollirOpcio(rango);
            switch (opcio) {
                case 1:
                    vt.mostrarMissatge(vt.MISSATGE_SELECCIONA_FIGURA);
                    nom = vt.recollirNomFigura();
                    for (Figura figure : figures) {
                        if ((figure instanceof Regular) && ((Regular) figure).getNom().equals(nom)) {
                            r = (Regular) figure;
                            vt.mostrarMissatge(vt.MIDA_COSTATS);
                            mida = vt.introduirMida();
                            if (r.getMedidaLado() != mida) {
                                r.setMedidaLado(mida);
                            }
                        }
                    }
                    break;
                case 2:
                    menuInicial();
                    break;
                case 0:
                    System.exit(0);
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (true);
    }

    /**
     * En aquest metode controlem tot lo que te que veure amb l'edicio de un
     * objecte rombe. Es mostra el submenu de Rombe cridant a vt. I es demana
     * escogir una opcio. En el cas de la primer opcio demana seleccionar una
     * figura, la busca i permet editar la diagonal major. La segona opcio
     * demana seleccionar una figura, la busca i permet editar la diagonal
     * menor. La tercera retorna al menu incial. La quarta acaba el programa.
     */
    public void menuRombe() {
        int opcio, rango = 3;
        String nom;
        Rombe r;
        double mida, mida2;
        do {
            vt.mostrarSubmenuRombe();
            opcio = vt.recollirOpcio(rango);
            switch (opcio) {
                case 1:
                    vt.mostrarMissatge(vt.MISSATGE_SELECCIONA_FIGURA);
                    nom = vt.recollirNomFigura();
                    for (Figura figure : figures) {
                        if ((figure instanceof Rombe) && ((Rombe) figure).getNom().equals(nom)) {
                            r = (Rombe) figure;
                            vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMAJOR);
                            mida = vt.introduirMida();
                            if (r.getDiagonalMayor() != mida) {
                                r.setDiagonalMayor(mida);
                            }
                        }
                    }
                    break;
                case 2:
                    vt.mostrarMissatge(vt.MISSATGE_SELECCIONA_FIGURA);
                    nom = vt.recollirNomFigura();
                    for (Figura figure : figures) {
                        if ((figure instanceof Rombe) && ((Rombe) figure).getNom().equals(nom)) {
                            r = (Rombe) figure;
                            vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMENOR);
                            mida2 = vt.introduirMida();
                            if (r.getDiagonalMenor() != mida2) {
                                r.setDiagonalMayor(mida2);
                            }
                        }
                    }
                    break;
                case 3:
                    menuInicial();
                    break;
                case 0:
                    System.exit(0);
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (true);
    }

    /**
     * En aquest metode controlem tot lo que te que veure amb l'edicio de un
     * objecte trapezi. Es mostra el submenu de trapezi cridant a vt. I es
     * demana escogir una opcio. En el cas de la primer opcio demana seleccionar
     * una figura, la busca i permet tots els seus costats. La segona permet
     * tornar al menu inicial La tercera acaba el programa.
     */
    public void menuTrapezi() {
        int opcio, rango = 2;
        String nom;
        Trapezi t;
        double mida[] = new double[4];
        do {
            vt.mostrarSubmenuTrapezi();
            opcio = vt.recollirOpcio(rango);
            switch (opcio) {
                case 1:
                    vt.mostrarMissatge(vt.MISSATGE_SELECCIONA_FIGURA);
                    nom = vt.recollirNomFigura();
                    for (Figura figure : figures) {
                        if ((figure instanceof Trapezi) && ((Trapezi) figure).getNom().equals(nom)) {
                            t = (Trapezi) figure;
                            vt.mostrarMissatge(vt.INTRODUIR_BASEMAJOR);
                            mida[0] = vt.introduirMida();
                            vt.mostrarMissatge(vt.INTRODUIR_BASEMENOR);
                            mida[1] = vt.introduirMida();
                            vt.mostrarMissatge(vt.INTRODUIR_DIAGONAL);
                            mida[2] = vt.introduirMida();
                            mida[3] = mida[2];
                            t.setMedidaLados(mida);
                        }
                    }
                    break;
                case 2:
                    menuInicial();
                    break;
                case 0:
                    System.exit(0);
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (true);
    }

    /**
     * Metode que crea un cercle. Demana nom, radi y amb aixo crea un objecte
     * cercle. Aquest cercle despres es emmagatzemat a un arraylist.
     */
    public void crearCercle() {
        String nom;
        double radi;
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.INTRODUIR_RADI);
        radi = vt.introduirMida();
        Cercle cercle = new Cercle(radi, nom);
        figures.add(cercle);
        vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
    }

    /**
     * Metode que crea un trapezi. Demana nom, altura, base major, base menor i
     * diagonals y amb aixo crea un objecte trapezi. Aquest trapezi despres es
     * emmagatzemat a un arraylist.
     */
    public void crearTrapezi() {
        String nom;
        double altura;
        int lados = 4;
        double medidaLados[] = new double[lados];
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.INTRODUIR_ALTURA);
        altura = vt.introduirMida();
        vt.mostrarMissatge(vt.INTRODUIR_BASEMAJOR);
        medidaLados[0] = vt.introduirMida();
        vt.mostrarMissatge(vt.INTRODUIR_BASEMENOR);
        medidaLados[1] = vt.introduirMida();
        vt.mostrarMissatge(vt.INTRODUIR_DIAGONAL);
        medidaLados[2] = vt.introduirMida();
        medidaLados[3] = medidaLados[2];
        Trapezi trapezi = new Trapezi(altura, medidaLados, lados, nom);
        figures.add(trapezi);
        vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
    }

    /**
     * Metode que crea un regular. Demana nom, costats i les mesures dels
     * costats y amb aixo crea un objecte regular. Aquest regular despres es
     * emmagatzemat a un arraylist.
     */
    public void crearRegular() {
        String nom;
        double altura;
        int lados;
        double medidaLados[];
        double medida;
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.NUMERO_COSTATS);
        lados = vt.recollirCostats();
        vt.mostrarMissatge(vt.MIDA_COSTATS);
        medida = vt.introduirMida();
        Regular regular = new Regular(medida, lados, nom);
        figures.add(regular);
        vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
    }

    /**
     * Metode que crea un rombe. Demana nom, diagonal major i diagonal menor y
     * amb aixo crea un objecte rombe. Aquest rombe despres es emmagatzemat a un
     * arraylist.
     */
    public void crearRombe() {
        String nom;
        double diagonalMayor, diagonalMenor;
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMAJOR);
        diagonalMayor = vt.recollirCostats();
        vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMENOR);
        diagonalMenor = vt.recollirCostats();
        Rombe rombe = new Rombe(diagonalMayor, diagonalMenor, nom);
        figures.add(rombe);
        vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
    }

}
