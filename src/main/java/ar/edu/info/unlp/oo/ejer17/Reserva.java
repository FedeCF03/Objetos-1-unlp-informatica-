package ar.edu.info.unlp.oo.ejer17;

import ar.edu.info.unlp.oo.ejer14.DateLapse;

public class Reserva {
    private DateLapse fecha;
    private Usuario propietario;
    private String estado;
    private double precioPorNoche;

    public Reserva(DateLapse fecha, Usuario propietario) {
        this.fecha = fecha;
        this.propietario = propietario;
        this.estado = "Disponible";
    }

    public boolean consultarFecha(DateLapse fecha) {

        if (this.fecha.includesDate(fecha.getTo()) && this.fecha.includesDate(fecha.getFrom()))
            if (fecha.includesDate(this.fecha.getTo()) && fecha.includesDate(this.fecha.getFrom()))
                return true;
        return false;
    }

    public boolean cancelarReserva(DateLapse fecha) {
        if (consultarFecha(fecha)) {
            this.estado = "Cancelada";
            return true;
        }
        return false;
    }

    public double precioReserva() {
        return precioPorNoche * fecha.sizeInDays();
    }

    public calcularPrecioGanancias( DateLapse fecha){
        if (fecha.includesDate(this.fecha.getFrom())){
            

        }

    }
}
