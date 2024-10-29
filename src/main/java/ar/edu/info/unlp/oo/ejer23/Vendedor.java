package ar.edu.info.unlp.oo.ejer23;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nombre;
    private String direccion;

    private final List<Producto> productos;

    public Vendedor(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void reducirStock(Producto producto, int cantidad) {
        productos.stream().filter(p -> p.equals(producto)).forEach(p -> p.reducirStock(cantidad));
    }

    public boolean tieneStock(Producto producto, int cantidad) {
        return productos.stream().anyMatch(p -> p.equals(producto) && p.getStock() >= cantidad);
    }
}
