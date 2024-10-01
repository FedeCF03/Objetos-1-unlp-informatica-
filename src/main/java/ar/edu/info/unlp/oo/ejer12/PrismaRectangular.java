package ar.edu.info.unlp.oo.ejer12;

public class PrismaRectangular extends Pieza {
    private int ladoMayor;
    private int ladoMenor;
    private int altura;

    public PrismaRectangular(int ladoMayor, int ladoMenor, int altura, String material, String color) {
        super(material, color);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        this.altura = altura;
    }

    @Override
    public double getVolumenDeMaterial() {
        return ladoMayor * ladoMenor * altura;

    }

    @Override
    public double getSuperficieDeColor() {
        return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
    }
 

}
