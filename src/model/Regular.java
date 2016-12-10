package model;

public class Regular extends Poligon{

    double medidaLado;

    public Regular(double medidaLado, int lados, String nom) {
        super(lados, nom);
        this.medidaLado = medidaLado;
    }
    
    @Override
    public double calculaArea() {
       return (calculaPerimetre() * calculaApotema()) / 2;
    }

    @Override
    public double calculaPerimetre() {
        return lados*medidaLado;
    } 
    
    public double calculaApotema(){
        double apotema = medidaLado / (2*Math.tan((360/lados)/2));
        return apotema;
    }


    @Override
    public int getLados() {
        return lados;
    }

    @Override
    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(double medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public String toString() {
        return "Regular{nom=" + nom + " lados= " + lados + " medidaLados= " + medidaLado + " area= " + calculaArea() + " perimetre= " + calculaPerimetre() + '}';
    }
    
    

    
}
