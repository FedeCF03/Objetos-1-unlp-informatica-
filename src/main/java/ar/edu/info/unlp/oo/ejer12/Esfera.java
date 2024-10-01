package ar.edu.info.unlp.oo.ejer12;

public class Esfera extends Pieza {
    private int radio;

    public Esfera(int radio , String material, String color) {
        super(material, color);
        this.radio = radio;
    }
    
    @Override
    public double getVolumenDeMaterial() {
        return   4/3* Math.PI * Math.pow(radio, 3);

    }

    @Override
    public double getSuperficieDeColor() {
        return 4 * Math.PI * Math.pow(radio, 2);

    }

   
}
