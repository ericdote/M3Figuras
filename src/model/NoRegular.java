package model;

/**
 * 
 * @author Eric
 */
public abstract class NoRegular extends Poligon {
    //Atribut heredable
    protected double[] medidaLados;
    /**
     * Constructor de clase NoRegular
     * @param medidaLados
     * @param lados
     * @param nom 
     */
    public NoRegular(double[] medidaLados, int lados, String nom) {
        super(lados, nom);
        this.medidaLados = medidaLados;
    }
    /**
     * Constructor
     * @param nom 
     */
    public NoRegular(String nom) {
        super(nom);
    }
    /**
     * Constructor
     * @param lados
     * @param nom 
     */
    public NoRegular(int lados, String nom) {
        super(lados, nom);
    }
    
   
    /**
     * Metodes heredats de la clase pare i que poden ser heredats per fills al ser abstract.
     * Permet calcular l'area
     * @return 
     */
    @Override
    public abstract double calculaArea();
    /**
     * Metodes heredats de la clase pare i que poden ser heredats per fills al ser abstract.
     * Permet calcular el perimetre
     * @return 
     */
    @Override
    public abstract double calculaPerimetre();


    
}
