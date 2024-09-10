package ar.edu.info.unlp.oo;

public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo( ) {
        
    }

    public double getDiametro() {
        return 2 * radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setDiametro(double diametro) {
        this.radio = diametro / 2;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

}
