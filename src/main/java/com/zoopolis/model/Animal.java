package com.zoopolis.model;

public class Animal {
    private String rutaImagen;
    private String especie;
    private String sexo;
    private int edad;
    private String descripcion;

    public Animal() {
    }

    public Animal(String rutaImagen, String especie, String sexo, int edad, String descripcion) {
        this.rutaImagen = rutaImagen;
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
        this.descripcion = descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
