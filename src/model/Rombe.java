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
public class Rombe extends NoRegular {

    public Rombe(double longitud, int lados, String nom) {
        super(longitud, lados, nom);
    }    
    
    @Override
    public double calculaArea() {
        return (longitud * longitud) / 2;
    }

    @Override
    public double calculaPerimetre() {
        return Math.sqrt(Math.pow((longitud)/2, 2) + Math.pow((longitud)/2, 2));
    }
    
}
