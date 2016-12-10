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

    public Trapezi(double altura, double[] medidaLados, int lados, String nom) {
        super(medidaLados, lados, nom);
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

    public double[] getMedidaLados() {
        return medidaLados;
    }

    public void setMedidaLados(double[] medidaLados) {
        this.medidaLados = medidaLados;
    }
    
    

    @Override
    public String toString() {
        return "Trapezi{ nom= " + nom + " altura=" + altura + " baseMayor= " + medidaLados[0] + " baseMenor= "  + medidaLados[1] + " diagonales= " + medidaLados[2] + " perimetro= " + calculaPerimetre() + " area= " + calculaArea() +  '}';
    }

 
    
    
}
