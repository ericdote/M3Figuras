package model;

/**
 *
 * @author Eric
 */
public class Cercle extends Figura {

    //Atribut privat per el cercle
    private double radi;

    /**
     * Constructor del Cercle que li arriba el nom del objecte i el radi
     *
     * @param radi
     * @param nom
     */
    public Cercle(double radi, String nom) {
        super(nom);
        this.radi = radi;
    }

    /**
     * Metode heredat de la clase pare que permet calcular el perimetre del
     * Cercle
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return (2 * Math.PI * radi);
    }

    /**
     * Metode heredat de la clase pare que permet calcular l'area del Cercle
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return (Math.PI * Math.pow(radi, 2));
    }

    /**
     * Podemos obtenir el radi amb aquest metode
     *
     * @return
     */
    public double getRadi() {
        return radi;
    }

    /**
     * Podem donar valor al radi amb aquest metode
     *
     * @param radi
     */
    public void setRadi(double radi) {
        this.radi = radi;
    }

    /**
     * Mostra per pantalla l'objecte Cercle amb les caracteristiques que
     * desitjem
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cercle{ nom= " + nom + " radi= " + df.format(radi) + " periemtre= " + df.format(calculaPerimetre()) + " area= " + df.format(calculaArea()) + '}';
    }

}
