package ar.edu.info.unlp.oo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Presupuesto {
        private LocalDate date = LocalDate.now();
    private String cliente;

    private List<Item> items = new ArrayList<Item>();

    public Presupuesto(String cliente) {
        this.cliente = cliente;

    }

    public void agregarItem(Item item) {
        items.add(item);
    }
    
    public double calcularTotal() {
        double costoTotal = 0;
        for (Item item : items) {
            costoTotal += item.costo();
        }
        return costoTotal;
    }
    
    public LocalDate getFecha() {
        return date;
    }
     
    public String getCliente() {
        return cliente;
    }

}
