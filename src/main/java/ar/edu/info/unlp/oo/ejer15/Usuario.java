package ar.edu.info.unlp.oo.ejer15;

public class Usuario {
    private String nombre;
    private String domicilio;

    public Usuario(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }
}
