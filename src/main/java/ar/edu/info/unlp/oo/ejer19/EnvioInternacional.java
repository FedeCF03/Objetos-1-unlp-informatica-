package ar.edu.info.unlp.oo.ejer19;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public class EnvioInternacional extends Envio {
    public EnvioInterurbano(DateLapse fecha, String origen, String destino, Double peso) {
        super(fecha, origen, destino, peso);}

    @Override
     public double calcularCosto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }     
}
