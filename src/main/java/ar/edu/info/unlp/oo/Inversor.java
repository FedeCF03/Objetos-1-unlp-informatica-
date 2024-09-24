package ar.edu.info.unlp.oo;

import java.util.ArrayList;
import java.util.List;
public class Inversor {
    private String nombre;
    List<valorAcciones> inversiones;

    public void inversor(String nombre) {
        this.nombre = nombre;
        inversiones = new ArrayList<>();
    }

    public void agregarInversion(valorAcciones inversion) {
        inversiones.add(inversion);
    }

    public List<valorAcciones> getInversiones() {
        return inversiones;
    }
    public double valorInversiones() {
        return inversiones.stream().mapToDouble(valorAcciones::valorActual).sum();
    }

}
