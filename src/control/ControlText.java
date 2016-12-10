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
 * @author ALUMNEDAM
 */
public class ControlText {

    VistaText vt = new VistaText();
    ArrayList<Figura> figures = new ArrayList();

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

    public void crearTrapezi() {
        String nom;
        double altura;
        int lados = 4;
        double medidaLados[] = new double[lados];
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.INTRODUIR_ALTRUA);
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

    public void crearRegular() {
        String nom;
        double altura;
        int lados;
        double medidaLados[];
        double medida;
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.NOM_COSTATS);
        lados = vt.recollirCostats();
        vt.mostrarMissatge(vt.MIDA_COSTATS);
        medida = vt.introduirMida();
        Regular regular = new Regular(medida, lados, nom);
        figures.add(regular);
        vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
    }

    public void crearRombe() {
        String nom;
        double diagonalMayor, diagonalMenor;
        vt.mostrarMissatge(vt.NOM_FIGURA);
        nom = vt.recollirNomFigura();
        vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMAYOR);
        diagonalMayor = vt.recollirCostats();
        vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMENOR);
        diagonalMenor = vt.recollirCostats();
        Rombe rombe = new Rombe(diagonalMayor, diagonalMenor, nom);
        figures.add(rombe);
        vt.mostrarMissatge(vt.MISSATGE_CORRECTE);
    }

    public void menuInicial() {
        int opcio;
        do {
            vt.mostrarMenuInicial();
            opcio = vt.recollirOpcio();
            switch (opcio) {
                case 1:
                    menuSeleccioFigura(opcio);
                    break;
                case 2:
                    menuSeleccioFigura(opcio);
                    break;
                case 3:
                    menuSeleccioFigura(opcio);
                case 4:
                    System.exit(0);
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (true);
    }

    public void menuSeleccioFigura(int opcioMenu) {
        int opcio;
        do {

            switch (opcioMenu) {
                case 1:
                    vt.menuFigura();
                    opcio = vt.recollirOpcio();
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
                        default:
                            vt.mostrarMissatge(vt.MISSATGE_ERROR);
                    }
                    opcioMenu = 0;
                    break;
                case 2:
                    vt.menuVeureFigura();
                    opcio = vt.recollirOpcio();
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
                        default:
                            vt.mostrarMissatge(vt.MISSATGE_ERROR);
                            break;
                    }
                    opcioMenu = 0;
                    break;
                case 3:
                    vt.menuModificarFigura();
                    opcio = vt.recollirOpcio();
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
                    opcioMenu = 0;
                    break;
                default:
                    break;
            }
        } while (opcioMenu != 0);
    }

    public void menuCercle() {
        int opcio;
        String nom;
        Cercle c;
        double radi;
        do {
            vt.mostrarSubmenuCercle();
            opcio = vt.recollirOpcio();
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
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (opcio != 2);
    }

    public void menuRegular() {
        int opcio;
        String nom;
        Regular r;
        double mida;
        do {
            vt.mostrarSubmenuCercle();
            opcio = vt.recollirOpcio();
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
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (opcio != 3);
    }

    public void menuRombe() {
        int opcio;
        String nom;
        Rombe r;
        double mida, mida2;
        do {
            vt.mostrarSubmenuCercle();
            opcio = vt.recollirOpcio();
            switch (opcio) {
                case 1:
                    vt.mostrarMissatge(vt.MISSATGE_SELECCIONA_FIGURA);
                    nom = vt.recollirNomFigura();
                    for (Figura figure : figures) {
                        if ((figure instanceof Rombe) && ((Rombe) figure).getNom().equals(nom)) {
                            r = (Rombe) figure;
                            vt.mostrarMissatge(vt.INTRODUIR_DIAGONALMAYOR);
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
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (opcio != 3);
    }

    public void menuTrapezi() {
        int opcio;
        String nom;
        Trapezi t;
        double mida[] = new double[4];
        do {
            vt.mostrarSubmenuCercle();
            opcio = vt.recollirOpcio();
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
                default:
                    vt.mostrarMissatge(vt.MISSATGE_ERROR);
            }
        } while (opcio != 2);
    }

}
