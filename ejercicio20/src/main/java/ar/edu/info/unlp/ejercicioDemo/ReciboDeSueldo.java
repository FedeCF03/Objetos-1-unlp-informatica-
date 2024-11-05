package ar.edu.info.unlp.ejercicioDemo;

public class ReciboDeSueldo {
    private String nombre;
    private String apellido;
    private int cuil;
    private double antiguedad;
    private double sueldo;

    public ReciboDeSueldo(double antiguedad, String apellido, int cuil, String nombre, double sueldo) {
        this.antiguedad = antiguedad;
        this.apellido = apellido;
        this.cuil = cuil;
        this.nombre = nombre;
        this.sueldo = calcularSueldo(sueldo, antiguedad);
    }

    private double calcularSueldo(double sueldoBase, double antiguedad) {
        if (antiguedad > 5 && antiguedad <= 10) {
            return sueldoBase + sueldoBase * 0.3;
        } else if (antiguedad > 10 && antiguedad <= 15) {
            return sueldoBase + sueldoBase * 0.5;
        } else if (antiguedad > 15 && antiguedad <= 20) {
            return sueldoBase + sueldoBase * 0.7;
        } else if (antiguedad > 20) {
            return sueldoBase + sueldoBase;
        }
        return sueldoBase;
    }

}
