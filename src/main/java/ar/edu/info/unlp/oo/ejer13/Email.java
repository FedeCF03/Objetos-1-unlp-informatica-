
package ar.edu.info.unlp.oo.ejer13;

import java.util.List;

class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    public Email(String titulo, String cuerpo, List<Archivo> adjuntos) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = adjuntos;
    }

    public void agregarAdjunto(Archivo archivo) {
        adjuntos.add(archivo);
    }

    public Integer getTamanio() {
        return adjuntos.stream().map(archivo -> archivo.getTamanio()).reduce(0, (a, b) -> a + b);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

}
