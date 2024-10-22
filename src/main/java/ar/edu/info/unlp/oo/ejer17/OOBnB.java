package ar.edu.info.unlp.oo.ejer17;

import java.util.ArrayList;
import java.util.List;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public class OOBnB {
    private List<Usuario> usuarios;
    private List<Inmueble> inmuebles;

    public OOBnB() {
        this.usuarios = new ArrayList<>();
        this.inmuebles = new ArrayList<>();
    }

    public boolean consultarInmueble(Inmueble inmueble, DateLapse fecha) {
        return inmuebles.stream().anyMatch(inm -> inm.equals(inmueble) && inm.consultarDisponibilidad(fecha));

    }

    public void addInmueble(Inmueble inmueble) {
        this.inmuebles.add(inmueble);
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public boolean crearReserva(Inmueble inmueble, DateLapse fecha, Usuario usuario) {
        if (consultarInmueble(inmueble, fecha)) {
            inmueble.addReserva(fecha, usuario);
            return true;
        }
        return false;
    }

    public double calcularGanancias(DateLapse fecha, Inmueble inmueble) {
        return inmuebles.stream().filter(inm -> inm.equals(inmueble)).findFirst().get().calcularGanancias(fecha);// consultar
                                                                                                                 // que
                                                                                                                 // hago
                                                                                                                 // con
                                                                                                                 // las
                                                                                                                 // fechaas?
    }

}
