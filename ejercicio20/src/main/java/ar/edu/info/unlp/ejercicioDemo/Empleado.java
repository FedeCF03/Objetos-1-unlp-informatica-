package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private int cuil;
    private LocalDate fechaNacimiento;
    private boolean conyuge;
    private int hijosACargo;
    private List<Contrato> contratos;

    public Empleado(String apellido, boolean conyuge, int cuil, LocalDate fechaNacimiento, int hijosACargo,
            String nombre) {
        this.apellido = apellido;
        this.conyuge = conyuge;
        this.cuil = cuil;
        this.fechaNacimiento = fechaNacimiento;
        this.hijosACargo = hijosACargo;
        this.nombre = nombre;
        contratos = new ArrayList<>();
    }

    public void agregarContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    private double calcularSueldoBase() {
        return contratos.stream().filter(e -> e.esContratoVigente()).findFirst().get().calcularSueldo();
    }

    private double calcularAntiguedad() {
        return contratos.stream().mapToDouble(c -> c.getDuracion()).sum();
    }

    public ReciboDeSueldo generarReciboDeSueldo() {
        return new ReciboDeSueldo(this.calcularAntiguedad(), this.apellido, this.cuil, this.nombre,
                this.calcularSueldoBase());
    }
}
