package ar.edu.info.unlp.oo;

import java.time.LocalDate;

public class PlazoFijo implements valorAcciones {

   private LocalDate fechaDeConstitucion;
	private double montoDepositado;
    private double porcentajeDeInteresDiario;

    public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
        this.fechaDeConstitucion = fechaDeConstitucion;
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }
    

   @Override
    public double valorActual() {
        LocalDate fechaActual = LocalDate.now();
        long dias = fechaActual.toEpochDay() - fechaDeConstitucion.toEpochDay();//dias restantes
        if(dias==0){
            return montoDepositado;
        }
        return montoDepositado * (1 + porcentajeDeInteresDiario) * dias ;

    }


   
    public LocalDate getFechaDeConstitucion() {
        return fechaDeConstitucion;
    }

   
    public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
        this.fechaDeConstitucion = fechaDeConstitucion;
    }

    public double getMontoDepositado() {
        return montoDepositado;
    }

    public void setMontoDepositado(double montoDepositado) {
        this.montoDepositado = montoDepositado;
    }

    public double getPorcentajeDeInteresDiario() {
        return porcentajeDeInteresDiario;
    }

    public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

}
