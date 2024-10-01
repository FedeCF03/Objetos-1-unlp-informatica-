package ar.edu.info.unlp.oo.ejer12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
    //final???
    private List<Pieza> piezas;

    public ReporteDeConstruccion() {
        this.piezas = new ArrayList<Pieza>();//puedo sacarlo?
    }

    public double volumenDeMaterial(String material) {
        double volumen;
        volumen = piezas.stream().findFirst().get().getVolumenDeMaterial();
        return volumen;
    }

    public double superficieDeColor(String color) {
        double superficie;
        superficie = piezas.stream().findFirst().get().getSuperficieDeColor();
        return superficie;
    }
    public void addPieza(Pieza pieza){
        this.piezas.add(pieza);
    }



}
