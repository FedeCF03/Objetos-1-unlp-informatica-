package ar.edu.info.unlp.oo.ejer13;

import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;
    private Integer espacio;

    public ClienteDeCorreo() {

    }

    public void recibir(Email email) {
        inbox.agregar(email);
        espacio += email.getTamanio();
    }

    public Email buscar(String texto) {
        return carpetas.stream().map(carpeta -> carpeta.buscar(texto)).findFirst()
                .orElse(null);
    }

    public int espacioOcupado() {
        return espacio;
    }

}
