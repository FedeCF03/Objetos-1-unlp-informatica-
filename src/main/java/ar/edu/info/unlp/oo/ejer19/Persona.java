package ar.edu.info.unlp.oo.ejer19;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    public Persona(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.envios = new ArrayList<Envio>();
    }

    public void agregarEnvio(Envio envio) {
        envios.add(envio);
    }

    public double montoAPagar() {
        double monto = 0;

        return monto;
    }
}
