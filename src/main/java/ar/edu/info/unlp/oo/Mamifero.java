package ar.edu.info.unlp.oo;

import java.util.Date;

public class Mamifero {
    private String Identificador;
    private String Especie;
    private Date FechaNacimiento;
    private Mamifero Padre;
    private Mamifero Madre;
    private Mamifero AbueloPaterno;
    private Mamifero AbuelaPaterna;
    private Mamifero AbueloMaterno;
    private Mamifero AbuelaMaterna;

    public Mamifero(String Identificador) {
        this.Identificador = Identificador;
    }
    public Mamifero() {
        this.Identificador = "Anonimo";
    }

    public String getIdentificador() {
        return this.Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getEspecie() {
        return this.Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }
    
    public Date getFechaNacimiento() {
        return this.FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Mamifero getPadre() {
        return this.Padre;
    }

    public void setPadre(Mamifero Padre) {
        this.Padre = Padre;
    }

    public Mamifero getMadre() {
        return this.Madre;
    }

    public void setMadre(Mamifero Madre) {
        this.Madre = Madre;
    }

    public Mamifero getAbueloPaterno() {
        if ( this.Padre != null && this.Padre.getPadre() != null) {
            return this.Padre.getPadre();
        }
        return null;
    }

    public Mamifero getAbueloMaterno() {
    
        if(this.Madre != null && this.Madre.getPadre() != null) {
            return this.Madre.getPadre();
        }

        return null;
    }
    public void setAbueloPaterno(Mamifero AbueloPaterno) {
        this.AbueloPaterno = AbueloPaterno;
    }

    public Mamifero getAbuelaPaterna() {
        if (this.Padre != null && this.Padre.getMadre() != null)
            return this.Padre.getMadre();

        return null;
    }

    public Mamifero getAbuelaMaterna() {
        if (  this.Madre != null && this.Madre.getMadre() != null)
            return this.Madre.getMadre();
    return  null;
    }
    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        Boolean tiene = false;
        if (getPadre() != null) {
             if (getPadre().equals(unMamifero)) {
            return true;
        } else
            tiene = getPadre().tieneComoAncestroA(unMamifero);
        } 
        if (getMadre() != null && !tiene ) {
        if (getMadre().equals(unMamifero)) {
            return true;
        } else
            tiene = getMadre().tieneComoAncestroA(unMamifero);    
}
        
        return tiene;
    }    


}
