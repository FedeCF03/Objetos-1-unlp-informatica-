package ar.edu.info.unlp.oo;

public class Producto {

    private double precioPorKilo;
    private double peso;
    private String nombre;

    public Producto(String nombre, double precioPorKilo, double peso) {
        this.nombre = nombre;
        this.precioPorKilo = precioPorKilo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precioPorKilo * peso;
    }

    public double getPeso() {
        return peso;
    }

    
}
