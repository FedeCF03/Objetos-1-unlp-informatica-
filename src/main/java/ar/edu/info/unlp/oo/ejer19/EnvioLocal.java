package ar.edu.info.unlp.oo.ejer19;

import java.time.LocalDate;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public class EnvioLocal extends Envio {
    private boolean entregaRapida;

    public EnvioLocal(boolean entregaRapida, LocalDate fecha, String origen, String destino, Double peso) {
        super(fecha, origen, destino, peso);
        this.entregaRapida = entregaRapida;
    }

    @Override
    public double calcularCosto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
