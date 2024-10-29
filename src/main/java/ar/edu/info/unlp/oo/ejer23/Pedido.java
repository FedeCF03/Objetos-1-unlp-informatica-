package ar.edu.info.unlp.oo.ejer23;

public class Pedido {
    private Vendedor vendedor;
    private Producto producto;
    private int cantidad;
    private FormaPago formaPago;
    private FormaEnvio formaenvio;
    private Cliente cliente;

    public Pedido(Cliente cliente, Vendedor vendedor, Producto producto, int cantidad, FormaPago formaPago,
            FormaEnvio formaenvio) {
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.formaPago = formaPago;
        this.formaenvio = formaenvio;
        this.cliente = cliente;
    }

    private void agregarProducto() {
        if (vendedor.tieneStock(producto, cantidad)) {
            vendedor.reducirStock(producto, cantidad);
            cliente.agregarPedido(this);
        }
    }

    public double calcularTotal() {
        return formaPago.costoTotal() + formaenvio.calcularTotal());

    }

}
