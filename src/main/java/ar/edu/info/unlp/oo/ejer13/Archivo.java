package ar.edu.info.unlp.oo.ejer13;

public class Archivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTamanio() {
        return nombre.length();
    }

    public String getNombre() {
        return nombre;
    }

}
