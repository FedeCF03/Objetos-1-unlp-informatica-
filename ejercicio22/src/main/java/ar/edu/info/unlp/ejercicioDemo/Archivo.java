package ar.edu.info.unlp.ejercicioDemo;

public class Archivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return nombre.length();
    }

    public String getNombre() {
        return nombre;
    }

}
