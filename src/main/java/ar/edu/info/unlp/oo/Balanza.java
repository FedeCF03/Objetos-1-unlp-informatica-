package ar.edu.info.unlp.oo;
import java.util.ArrayList;
import java.util.List;

import java.sql.Date;

public class Balanza {
    private int cantidadDeProductos = 0;
    private double precioTotal = 0;
    private double pesoTotal = 0;
    private List<Producto> items = new ArrayList<Producto>();
    public void Balanza() {
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
        this.items = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        this.cantidadDeProductos++;
        this.precioTotal += producto.getPrecio();
        this.pesoTotal += producto.getPeso();
        this.items.add(producto);
    }
    
    public Ticket emitirTicket() {
        return new Ticket(cantidadDeProductos, pesoTotal, precioTotal);
    }

    public List<Producto> getProductos() {
        return items;
    }

}
