package ar.edu.info.unlp.oo.ejer23;

public class Cuotas implements FormaPago {

    public double costoTotal(double precio, int cantidad, int cuotas) {
        precio = precio * cantidad;
        if (cuotas == 6) {
            return precio * 1.2;
        }
        return precio;
    }
}
