package ar.edu.info.unlp.oo.ejer23;

public class Producto {
    private int stock;
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(int stock, String nombre, String categoria, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }
}
