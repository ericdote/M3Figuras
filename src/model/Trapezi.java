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
public class Trapezi extends NoRegular{

    double altura;

    public Trapezi(double altura, int lados, double[] medidaLados, String nom) {
        super(lados, medidaLados, nom);
        this.altura = altura;
    }  

    public Trapezi(String nom) {
        super(nom);
    }

    @Override
    public double calculaArea() {
        return ((medidaLados[0] + medidaLados[1])/2) * altura ;
    }

    @Override
    public double calculaPerimetre() {
        return (medidaLados[0] + medidaLados[1] + medidaLados[2] + medidaLados[3]);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }   

    @Override
    public String toString() {
        return "Trapezi{" + "altura=" + altura + '}';
    }
    
    
}
