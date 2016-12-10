
package model;


public class Cercle extends Figura{

    private double radi;

    public Cercle(double radi, String nom) {
        super(nom);
        this.radi = radi;
    }
    
    @Override
    public double calculaPerimetre() {     
        return (2*Math.PI*radi); 
    }

    @Override
    public double calculaArea() {
        return (Math.PI*Math.pow(radi, 2));
    } 

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle{ nom= " + nom + "radi=" + radi + " periemtre= "+ calculaPerimetre() + " area= " + calculaArea() +'}';
    }


    

}
