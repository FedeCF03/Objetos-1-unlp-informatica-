package ar.edu.info.unlp.oo;

public class CuentaCorriente extends Cuenta {
    public double descubierto;

    public CuentaCorriente(double descubierto) {
        this.descubierto = descubierto;
    }

    public double getDescubierto() {
        return this.descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    @Override
    protected boolean puedoExtraer(double monto) {
        return this.getSaldo() + descubierto > monto  ;
    }
    

}
