package model;

/**
 *
 * @author Eric
 */
public class Regular extends Poligon {

    double medidaLado;

    /**
     * Constructor de la clase regular
     *
     * @param medidaLado
     * @param lados
     * @param nom
     */
    public Regular(double medidaLado, int lados, String nom) {
        super(lados, nom);
        this.medidaLado = medidaLado;
    }

    /**
     * Metode heredat per calcular l'area de un poligon regular
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return (calculaPerimetre() * calculaApotema()) / 2;
    }

    /**
     * Metode heredat per calcular el perimetre de un poligon regular
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return lados * medidaLado;
    }

    /**
     * Metode que permet calcular l'apotema per despures utilitzar l'apotema per
     * calcular l'area
     *
     * @return
     */
    public double calculaApotema() {
        double apotema = medidaLado / (2 * Math.tan((360 / lados) / 2));
        return apotema;
    }

    /**
     * Permet obtenir el nombre de costats. Es heredat de la clase pare
     *
     * @return
     */
    @Override
    public int getLados() {
        return lados;
    }

    /**
     * Permet definir quants costats tindra el poligon. Es heredat de la clase
     * pare.
     *
     * @param lados
     */
    @Override
    public void setLados(int lados) {
        this.lados = lados;
    }

    /**
     * Permet obtenir la mesura dels costats.
     *
     * @return
     */
    public double getMedidaLado() {
        return medidaLado;
    }

    /**
     * Permet definir la mesura dels costats
     *
     * @param medidaLado
     */
    public void setMedidaLado(double medidaLado) {
        this.medidaLado = medidaLado;
    }

    /**
     * Mostra l'objecte Regular i els seus atributs
     *
     * @return
     */
    @Override
    public String toString() {
        return "Regular{nom= " + nom + " lados= " + df.format(lados) + " medidaLados= " + df.format(medidaLado) + " area= " + df.format(calculaArea()) + " perimetre= " + df.format(calculaPerimetre()) + '}';
    }

}
