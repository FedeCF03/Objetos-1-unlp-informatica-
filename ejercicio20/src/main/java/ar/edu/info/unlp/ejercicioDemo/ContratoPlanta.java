package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class ContratoPlanta extends Contrato {
    private double sueldoBasico;
    private double montoPorHijo;
    private double montoConyuge;

    public ContratoPlanta(double sueldoBasico, double montoPorHijo, double montoConyuge, LocalDate fechaInicio,
            LocalDate fechaFin) {
        super(fechaInicio, fechaFin);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoBasico + this.montoPorHijo + this.montoConyuge;
    }

    @Override
    public boolean esContratoVigente() {
        if (super.getFechaFin() == null)
            return true;
        return false;
    }

}
