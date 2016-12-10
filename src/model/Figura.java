package model;


public abstract class Figura {
    
    final String nom;   

    public Figura(String nom) {
        this.nom = nom;
    }

    public abstract double calculaPerimetre();
    
    public abstract double calculaArea();

    public String getNom() {
        return nom;
    }
    
    
}
