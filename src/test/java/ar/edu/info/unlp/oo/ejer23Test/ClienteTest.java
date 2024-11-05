package ar.edu.info.unlp.oo.ejer23Test;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import ar.edu.info.unlp.oo.ejer23.Producto;
import ar.edu.info.unlp.oo.ejer23.Cliente;
import ar.edu.info.unlp.oo.ejer23.Contado;
import ar.edu.info.unlp.oo.ejer23.ExpressDomicilio;
import ar.edu.info.unlp.oo.ejer23.Vendedor;

public class ClienteTest {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private Contado formaPago;
    private ExpressDomicilio formaEnvio;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Juan", "Calle 123");
        vendedor = new Vendedor("Pedro", "Calle 456");
        producto = new Producto(2, "pera", "fruta", 10.0);
        formaPago = new Contado();
        formaEnvio = new ExpressDomicilio();
    }

    @Test
    void testCrearPedido() {
        vendedor.agregarProducto(producto);
        vendedor.crearPedido(cliente, vendedor, producto, 5, formaPago, formaEnvio);
        assertEquals(1, cliente.getCantCategorias("fruta"));
    }

}
