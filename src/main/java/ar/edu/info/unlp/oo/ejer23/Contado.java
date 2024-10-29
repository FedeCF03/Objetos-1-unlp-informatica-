package ar.edu.info.unlp.oo.ejer23;

public class Contado implements FormaPago {

    public double costoTotal(double precio, int cantidad, int cuotas) {
        return precio * cantidad;
    }

}
