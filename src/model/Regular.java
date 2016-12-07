package model;

public class Regular extends Poligon{

    public Regular(int lados, double[] medidaLados, String nom) {
        super(lados, medidaLados, nom);
    }    
   

    @Override
    public double calculaArea() {
       return (calculaPerimetre() * calculaApotema()) / 2;
    }

    @Override
    public double calculaPerimetre() {
        return lados*medidaLados[0];
    } 
    
    public double calculaApotema(){
        double apotema = medidaLados[0] / (2*Math.tan((360/lados)/2));
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

    @Override
    public double[] getMedidaLados() {
        return medidaLados;
    }

    @Override
    public void setMedidaLados(double[] medidaLados) {
        this.medidaLados = medidaLados;
    }
    
    

    
}
