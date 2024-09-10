package ar.edu.info.unlp.oo;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
 public Cuadrado() {
       
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return lado * lado;
    }

}
