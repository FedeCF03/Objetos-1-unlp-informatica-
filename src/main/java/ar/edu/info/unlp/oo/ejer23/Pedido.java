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

    public double calcularTotal() {
        return formaPago.costoTotal(producto.getPrecio(), this.cantidad) + formaenvio.costoEnvio();

    }

    public String getCategoria() {
        return this.producto.getCategoria();
    }

}
