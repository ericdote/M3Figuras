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
public abstract class NoRegular extends Poligon {
    
    protected double longitud;

    public NoRegular(double longitud, int lados, String nom) {
        super(lados, nom);
        this.longitud = longitud;
    }

    @Override
    public abstract double calculaArea();

    @Override
    public abstract double calculaPerimetre();

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
}
