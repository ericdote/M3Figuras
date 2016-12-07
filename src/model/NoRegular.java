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

    public NoRegular(int lados, double[] medidaLados, String nom) {
        super(lados, medidaLados, nom);
    }

    public NoRegular(String nom) {
        super(nom);
    }
    
    @Override
    public abstract double calculaArea();

    @Override
    public abstract double calculaPerimetre();


    
}
