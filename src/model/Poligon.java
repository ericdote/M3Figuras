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
    protected double[] medidaLados;
   
    public Poligon(String nom) {
        super(nom);
    }

    public Poligon(int lados, double[] medidaLados, String nom) {
        super(nom);
        this.lados = lados;
        this.medidaLados = medidaLados;
    }

    @Override
    public abstract double calculaArea();

    @Override
    public abstract double calculaPerimetre();

    public int getLados() {
        return lados;
    }

    public double[] getMedidaLados() {
        return medidaLados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public void setMedidaLados(double[] medidaLados) {
        this.medidaLados = medidaLados;
    }

  
    
   
}
