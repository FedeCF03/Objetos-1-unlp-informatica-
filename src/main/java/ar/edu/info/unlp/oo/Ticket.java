package ar.edu.info.unlp.oo;
import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    private LocalDate fecha = LocalDate.now();
    private int cantidadDeProductos = 0;
    private double pesoTotal=0;
    private double montoTotal = 0;
    
    public Ticket(int cantidadDeProductos ,double pesoTotal, double montoTotal) {
        this.cantidadDeProductos = cantidadDeProductos;
        this.pesoTotal = pesoTotal;
        this.montoTotal = montoTotal;
    }

    public double impuesto() {
        return montoTotal * 0.21;

    }
    

}
