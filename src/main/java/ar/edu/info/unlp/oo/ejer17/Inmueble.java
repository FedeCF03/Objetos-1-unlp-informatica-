package ar.edu.info.unlp.oo.ejer17;

import java.util.List;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public class Inmueble {
    private String direccion;
    private String nombreDescriptivo;
    private double precioPorNoche;
    private List<Reserva> reservas;

    public boolean consultarDisponibilidad(DateLapse fecha) {

        return reservas.stream().noneMatch(reserva -> reserva.consultarFecha(fecha));
    }

    void addReserva(DateLapse fecha, Usuario usuario) {
        this.reservas.add(new Reserva(fecha, usuario));
    }

    public double calcularGanancias(fecha)

}
