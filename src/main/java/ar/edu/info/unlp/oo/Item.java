package ar.edu.info.unlp.oo;
public class Item {
    private String detalle;
    private int cantidad;
    private double precioUnitario;

    public Item(String detalle, int cantidad, double precioUnitario) {
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double getCostoUnitario() {
        return  precioUnitario;
    }

    public double costo() {
        return cantidad * precioUnitario;
    }
}
