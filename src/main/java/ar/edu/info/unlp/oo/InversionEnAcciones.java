package ar.edu.info.unlp.oo;

public class InversionEnAcciones implements valorAcciones {
    private String nombre;
	private int cantidad;
    private double valorUnitario;

    public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }
    
    
    @Override
    public double valorActual() {
        return cantidad * valorUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidad() {
        return cantidad;
    }

 
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double getValorUnitario() {
        return valorUnitario;
    }


    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
