package ar.edu.info.unlp.oo.ejer15;

public class Consumo {
    private Double energiaActiva;
    private Double energiaReactiva;

    public Consumo(Double energiaActiva, Double energiaReactiva) {
        this.energiaActiva = energiaActiva;
        this.energiaReactiva = energiaReactiva;
    }

    public Double getEnergiaActiva() {
        return this.energiaActiva;
    }

    public Double getEnergiaReactiva() {
        return this.energiaReactiva;
    }

    public void setEnergiaActiva(Double energiaActiva) {
        this.energiaActiva = energiaActiva;
    }

    public void setEnergiaReactiva(Double energiaReactiva) {
        this.energiaReactiva = energiaReactiva;
    }

    public Double getFpe() {
        return (this.energiaActiva / Math.sqrt(Math.pow(this.energiaActiva, 2) + Math.pow(this.energiaReactiva, 2)));
    }

}
