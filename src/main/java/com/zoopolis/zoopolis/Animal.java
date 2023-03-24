package com.zoopolis.zoopolis;

public class Animal {
    private String nombreComun;
    private String nombreCientifico;
    private String tipoAnimal;
    private String tipooAlimentacion;
    private String descripcion;

    public Animal(String nombreComun, String nombreCientifico, String tipoAnimal, String tipooAlimentacion, String descripcion) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipoAnimal = tipoAnimal;
        this.tipooAlimentacion = tipooAlimentacion;
        this.descripcion = descripcion;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipooAlimentacion() {
        return tipooAlimentacion;
    }

    public void setTipooAlimentacion(String tipooAlimentacion) {
        this.tipooAlimentacion = tipooAlimentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
