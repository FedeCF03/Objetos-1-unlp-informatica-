package ar.edu.info.unlp.oo.ejer15;

import java.time.LocalDate;

public class Factura {
    private Usuario usuario;
    private Consumo consumo;
    private Tarifa tarifa;
    private LocalDate fecha;
    private Double bonificacion;

    public Factura(Usuario usuario, Consumo consumo, Tarifa tarifa, LocalDate fecha) {
        this.usuario = usuario;
        this.consumo = consumo;
        this.tarifa = tarifa;
        this.fecha = fecha;
    }

    private Double calcularMontoFinal() {
        Double monto = this.consumo.getEnergiaActiva() * this.tarifa.getPrecio();
        if (consumo.getFpe() > 0.8) {
            this.bonificacion = monto * 0.1;
            monto -= this.bonificacion;
        }
        return monto;
    }
}
