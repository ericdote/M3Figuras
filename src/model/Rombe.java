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

    private double diagonalMayor, diagonalMenor;

    public Rombe(double diagonalMayor, double diagonalMenor, String nom) {
        super(nom);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    @Override
    public double calculaArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public double calculaPerimetre() {
        return Math.sqrt(Math.pow((diagonalMenor)/2, 2) + Math.pow((diagonalMayor)/2, 2));
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String toString() {
        return "Rombe{ nom= " + nom + "diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + " perimetre= " + calculaPerimetre() + " area= " + calculaArea() + '}';
    } 
}
