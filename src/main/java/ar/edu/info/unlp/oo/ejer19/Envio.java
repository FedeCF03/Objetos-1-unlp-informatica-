package ar.edu.info.unlp.oo.ejer19;

import java.util.Date;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public abstract class Envio {
    private Date fecha;
    private String origen;
    private String destino;
    private Double peso;

    public Envio(Date fecha, String origen, String destino, Double peso) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public DateLapse getFecha() {
        return fecha
    }

    public boolean getPeriodo() {

    }

    public abstract double calcularCosto();
}
