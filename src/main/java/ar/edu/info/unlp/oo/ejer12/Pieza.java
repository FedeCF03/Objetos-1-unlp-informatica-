package ar.edu.info.unlp.oo.ejer12;

public abstract class Pieza {
    private String material;
    private String color;
    
    public Pieza(String material, String color) {
        this.material = material;
        this.color = color;    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getVolumenDeMaterial();

    public abstract double getSuperficieDeColor();

}
