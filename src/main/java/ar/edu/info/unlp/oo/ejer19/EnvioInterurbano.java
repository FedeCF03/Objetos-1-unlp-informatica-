package ar.edu.info.unlp.oo.ejer19;

import java.time.LocalDate;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public class EnvioInterurbano extends Envio {
    private Double distancia;

    public EnvioInterurbano(LocalDate fecha, String origen, String destino, Double peso, Double distancia) {
        super(fecha, origen, destino, peso);
        this.distancia = distancia;
    }

    @Override
    public double calcularCosto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
