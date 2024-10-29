package ar.edu.info.unlp.oo.ejer23;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private List<Pedido> pedidos;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

}
