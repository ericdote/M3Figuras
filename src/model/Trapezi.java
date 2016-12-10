package model;

/**
 *
 * @author Eric
 */
public class Trapezi extends NoRegular {

    double altura;

    /**
     * Constructor de Trapezi.
     *
     * @param altura
     * @param medidaLados
     * @param lados
     * @param nom
     */
    public Trapezi(double altura, double[] medidaLados, int lados, String nom) {
        super(medidaLados, lados, nom);
        this.altura = altura;
    }

    /**
     * Constructor
     *
     * @param nom
     */
    public Trapezi(String nom) {
        super(nom);
    }

    /**
     * Metode heredat de la clase pare que permet calcular l'area del trapezi
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return ((medidaLados[0] + medidaLados[1]) / 2) * altura;
    }

    /**
     * Metode heredat de la clase pare que permet calcular el perimetre del
     * trapezi
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return (medidaLados[0] + medidaLados[1] + medidaLados[2] + medidaLados[3]);
    }

    /**
     * Metode que permet obtenir l'altura
     *
     * @return
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Metode que permet definir l'altura
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metode que permet obtenir la mesura dels costats
     *
     * @return
     */
    public double[] getMedidaLados() {
        return medidaLados;
    }

    /**
     * Metode que permet definir la mesura dels costats
     *
     * @param medidaLados
     */
    public void setMedidaLados(double[] medidaLados) {
        this.medidaLados = medidaLados;
    }

    /**
     * Mostra l'objecte trapezi amb els seus atributs
     *
     * @return
     */
    @Override
    public String toString() {
        return "Trapezi{ nom= " + nom + " altura=" + df.format(altura) + " baseMayor= " + df.format(medidaLados[0]) + " baseMenor= " + df.format(medidaLados[1]) + " diagonales= " + df.format(medidaLados[2]) + " perimetro= " + df.format(calculaPerimetre()) + " area= " + df.format(calculaArea()) + '}';
    }
}
