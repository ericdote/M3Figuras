/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALUMNEDAM
 */
public class Regular extends Poligon{

    private double longitud;
    
    public Regular(double longitud, int lados, String nom) {
        super(lados, nom);
        this.longitud = longitud;
    }

    @Override
    public double calculaArea() {
       return (calculaPerimetre() * calculaApotema()) / 2;
    }

    @Override
    public double calculaPerimetre() {
        return lados*longitud;
    } 
    
    public double calculaApotema(){
        double apotema = longitud / (2*Math.tan((360/lados)/2));
        return apotema;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Regular{" + "longitud=" + longitud + '}';
    }
    
}
