package ar.edu.info.unlp.oo;

public abstract class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }
    
    protected void extraerSinControlar(double monto) {
        this.saldo -= monto;
    }

    public boolean extraer(double monto) {
        if (this.puedoExtraer(monto)) {
            this.extraerSinControlar(monto);
            return true;
        }
        return false;

    }
    
    public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
        if (this.puedoExtraer(monto) && cuentaDestino != null) {
            this.extraerSinControlar(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    } 

    protected abstract boolean puedoExtraer(double monto);

}
