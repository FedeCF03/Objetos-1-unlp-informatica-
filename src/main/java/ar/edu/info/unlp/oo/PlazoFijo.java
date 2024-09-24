package ar.edu.info.unlp.oo;

import java.time.LocalDate;

public class PlazoFijo implements valorAcciones {

   private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;


    @Override
    public double valorActual() {
        LocalDate fechaActual = LocalDate.now();
        long dias = fechaActual.toEpochDay() - fechaDeConstitucion.toEpochDay();//dias restantes
        return montoDepositado * (1 + porcentajeDeInteresDiario) * dias;

    }

}
