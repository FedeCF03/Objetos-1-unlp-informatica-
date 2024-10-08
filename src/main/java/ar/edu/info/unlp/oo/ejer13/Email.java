
package ar.edu.info.unlp.oo.ejer13;

import java.util.ArrayList;
import java.util.List;

class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        adjuntos = new ArrayList<>();
    }

    public void agregarAdjunto(Archivo archivo) {
        adjuntos.add(archivo);
    }

    public int getTamanio() {
        return cuerpo.length() + getTamanioArchivos() + titulo.length();
    }

    private int getTamanioArchivos() {
        return adjuntos.stream().mapToInt(archivo -> archivo.getTamanio()).sum();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

}
