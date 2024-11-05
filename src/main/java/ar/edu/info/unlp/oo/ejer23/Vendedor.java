package ar.edu.info.unlp.oo.ejer23;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nombre;
    private String direccion;

    private List<Producto> productos;

    public Vendedor(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void crearPedido(Cliente cliente, Vendedor vendedor, Producto producto, int cantidad,
            FormaPago formaPago,
            FormaEnvio formaenvio) {
        if (this.tengoStock(producto, cantidad)) {
            Pedido pedido = new Pedido(cliente, vendedor, producto, cantidad, formaPago, formaenvio);
            vendedor.reducirStock(producto, cantidad);
            cliente.agregarPedido(pedido);
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void reducirStock(Producto producto, int cantidad) {
        productos.stream().filter(p -> p.equals(producto)).forEach(p -> p.reducirStock(cantidad));
    }

    public boolean tengoStock(Producto producto, int cantidad) {
        return productos.stream().anyMatch(p -> p.equals(producto) && p.getStock() >= cantidad);
    }
}
