package model;

import java.text.DecimalFormat;

/**
 * Clase pare de tota la jerarquia de clases
 *
 * @author Eric
 */
public abstract class Figura {

    final String nom;
    //DecimalFormat per tenir maxim 2 decimals.
    protected DecimalFormat df = new DecimalFormat("#.##");

    /**
     * Constructor de figura
     *
     * @param nom
     */
    public Figura(String nom) {
        this.nom = nom;
    }

    /**
     * Metode abastracte que sera utilitzat per calcular el perimetre per
     * diferents clases que heredin el metode
     *
     * @return
     */
    public abstract double calculaPerimetre();

    /**
     * Metode abastracte que sera utilitzat per calcular l'area per diferents
     * clases que heredin el metode
     *
     * @return
     */
    public abstract double calculaArea();

    /**
     * Metode que permet obtenir el nom de la figura
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

}
