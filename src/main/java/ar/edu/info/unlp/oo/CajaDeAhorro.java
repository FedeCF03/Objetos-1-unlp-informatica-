package ar.edu.info.unlp.oo;

public class CajaDeAhorro extends  Cuenta {
    
    @Override
    protected boolean puedoExtraer(double monto) {
        return this.getSaldo() >= monto;
    }
    @Override 
    public boolean extraer(double monto) {
        monto = monto * 1.02;
        if (this.puedoExtraer(monto)) {
            this.extraerSinControlar(monto);
            return true;
        }
        return false;

    }
    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
        double montoaux = monto * 1.02;
        if (this.puedoExtraer(montoaux) && cuentaDestino != null}) {
            this.extraerSinControlar(montoaux);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    } 


}
