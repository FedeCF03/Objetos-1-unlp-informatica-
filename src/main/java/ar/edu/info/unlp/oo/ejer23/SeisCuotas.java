package ar.edu.info.unlp.oo.ejer23;

public class SeisCuotas implements FormaPago {
    @Override
    public double costoTotal(double precio, int cantidad) {
        return (precio * cantidad) * 1.2;

    }
}
