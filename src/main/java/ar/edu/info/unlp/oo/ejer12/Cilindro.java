package ar.edu.info.unlp.oo.ejer12;

public class Cilindro extends Pieza{

    public int radio;
    public int altura;

    public Cilindro(int radio, int altura, String material, String color) {
        super(material, color);
        this.radio = radio;
        this.altura = altura;
    }
    
    @Override
    public double getVolumenDeMaterial() {
        return Math.PI * Math.pow(radio, 2)*altura;
    }

    @Override
    public double getSuperficieDeColor() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

}
