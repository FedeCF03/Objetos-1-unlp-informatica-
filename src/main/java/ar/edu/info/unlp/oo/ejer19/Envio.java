package ar.edu.info.unlp.oo.ejer19;

import java.time.LocalDate;
import java.util.Date;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public abstract class Envio {
    private LocalDate fecha;
    private String origen;
    private String destino;
    private Double peso;

    public Envio(LocalDate fecha, String origen, String destino, Double peso) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public boolean getPeriodo(DateLapse fecha) {
        return fecha.includesDate(this.fecha);
    }

    public abstract double calcularCosto();
}
