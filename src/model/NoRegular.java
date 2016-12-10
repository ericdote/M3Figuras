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

    protected double[] medidaLados;

    public NoRegular(double[] medidaLados, int lados, String nom) {
        super(lados, nom);
        this.medidaLados = medidaLados;
    }

    public NoRegular(String nom) {
        super(nom);
    }

    public NoRegular(int lados, String nom) {
        super(lados, nom);
    }
    
   
    
    @Override
    public abstract double calculaArea();

    @Override
    public abstract double calculaPerimetre();


    
}
