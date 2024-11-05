package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo() {
        carpetas = new ArrayList<>();
        inbox = new Carpeta("Inbox");
        carpetas.add(inbox);
    }

    public void recibir(Email email) {
        inbox.agregar(email);
    }

    public Email buscar(String texto) {
        return carpetas.stream().map(carpeta -> carpeta.buscar(texto)).filter(email -> email != null).findFirst()
                .orElse(null);
    }

    public int getEspacioOcupado() {
        return carpetas.stream().mapToInt(car -> car.getEspacioOcupado()).sum();
    }

    public void agregarCarpeta(Carpeta carpeta) {
        carpetas.add(carpeta);
    }
}
