package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato {
    private double valorHora;
    private int horasTrabajadas;

    public ContratoPorHoras(double valorHora, int horasTrabajadas, LocalDate fechaInicio,
            LocalDate fechaFin) {
        super(fechaInicio, fechaFin);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return this.valorHora * this.horasTrabajadas;
    }

    @Override
    public boolean esContratoVigente() {
        return this.getFechaFin().isAfter(LocalDate.now());
    }

}
