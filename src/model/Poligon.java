package model;

/**
 *
 * @author Eric
 */
public abstract class Poligon extends Figura {

    //Atribut heredable
    protected int lados;

    /**
     * Constructor de la clase poligon
     *
     * @param nom
     */
    public Poligon(String nom) {
        super(nom);
    }

    /**
     * Constructor de la clase poligon
     *
     * @param nom
     */
    public Poligon(int lados, String nom) {
        super(nom);
        this.lados = lados;
    }

    /**
     * Metode heredat de la clase pare que pot ser heredable pels fills Permet
     * cacular l'area
     *
     * @return
     */
    @Override
    public abstract double calculaArea();

    /**
     * Metode heredat de la clase pare que pot ser heredable pels fills Permet
     * cacular el perimetre
     *
     * @return
     */
    @Override
    public abstract double calculaPerimetre();

    /**
     * Metode que permet obtenir el nombre de costats
     *
     * @return
     */
    public int getLados() {
        return lados;
    }

    /**
     * Metode que permet definir quants costats hi haura.
     *
     * @param lados
     */
    public void setLados(int lados) {
        this.lados = lados;
    }

}
