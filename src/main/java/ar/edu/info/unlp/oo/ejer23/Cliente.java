package ar.edu.info.unlp.oo.ejer23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
    private String nombre;
    private String direccion;
    private List<Pedido> pedidos;
    private Map<String, Integer> categorias;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
        this.categorias = new HashMap<>();
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        if (this.categorias.containsKey(pedido.getCategoria())) {
            this.categorias.put(pedido.getCategoria(), this.categorias.get(pedido.getCategoria()) + 1);
        } else {
            this.categorias.put(pedido.getCategoria(), 1);
        }

    }

    public int getCantCategorias(String categoria) {
        return this.categorias.get(categoria);

    }
}