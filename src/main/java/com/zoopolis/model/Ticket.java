package com.zoopolis.model;

public class Ticket {
    private double precio;
    private String titulo;
    private String descripcion;               // OPCIONAL? SIN DESCRIPCION

    public Ticket(double precio, String descripcion, String titulo) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
