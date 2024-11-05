package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Contrato {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Contrato(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public abstract double calcularSueldo();

    public int getDuracion() {
        if (fechaFin != null && fechaFin.isBefore(LocalDate.now())) {
            return fechaInicio.until(fechaFin).getYears();
        } else {
            return fechaInicio.until(LocalDate.now()).getYears();
        }
    }

    public abstract boolean esContratoVigente();

    public LocalDate getFechaFin() {
        return fechaFin;
    }

}
