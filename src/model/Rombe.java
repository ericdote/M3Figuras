package model;

/**
 *
 * @author Eric
 */
public class Rombe extends NoRegular {

    private double diagonalMayor, diagonalMenor;

    /**
     * Constructor de la clase Rombe
     *
     * @param diagonalMayor
     * @param diagonalMenor
     * @param nom
     */
    public Rombe(double diagonalMayor, double diagonalMenor, String nom) {
        super(nom);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * Metode heredat de la clase pare que permet calcular l'area del rombe
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    /**
     * Metode heredat de la clase pare que permet calcular el perimetre del
     * rombe
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return Math.sqrt(Math.pow((diagonalMenor) / 2, 2) + Math.pow((diagonalMayor) / 2, 2));
    }

    /**
     * Metode que permet obtenir la mesura de la diagonal major
     *
     * @return
     */
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    /**
     * Metode que permet definir la mesura de la diagonal major
     *
     * @param diagonalMayor
     */
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    /**
     * Metode que permet obtenir la mesura de la diagonal menor
     *
     * @return
     */
    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    /**
     * Metode que permet definir la mesura de la diagonal inferior
     *
     * @param diagonalMenor
     */
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * Mostra l'objecte amb els seus atributs
     *
     * @return
     */
    @Override
    public String toString() {
        return "Rombe{ nom= " + nom + " diagonalMayor= " + df.format(diagonalMayor) + " diagonalMenor=" + df.format(diagonalMenor) + " perimetre= " + df.format(calculaPerimetre()) + " area= " + df.format(calculaArea()) + '}';
    }
}
