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
public abstract class Poligon extends Figura {
    
    protected int lados;
   
    public Poligon(String nom) {
        super(nom);
    }

    public Poligon(int lados, String nom) {
        super(nom);
        this.lados = lados;
    }

    @Override
    public abstract double calculaArea();

    @Override
    public abstract double calculaPerimetre();
    
    public int getLados() {
        return lados;
    }    
}
