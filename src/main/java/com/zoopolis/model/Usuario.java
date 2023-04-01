package com.zoopolis.model;

import java.util.ArrayList;

public class Usuario {
    private String id;
    private String nombre;
    private String eMail;
    private int visitas;
    private ArrayList<Venta> ventas;

    public Usuario(String id, String nombre, String eMail) {
        this.id = id;
        this.nombre = nombre;
        this.eMail = eMail;
        this.visitas = 0;
        this.ventas = new ArrayList<>();
    }
    
    //Cuando le da en confirmar compra:
    public void addVenta(Venta venta){
        ventas.add(venta);
    }
    
    //Retorna array de ventas:
    public ArrayList<Venta> getVentas(){
        return ventas;
    }
    
    public void contarVisitas(){
        visitas++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }
    
    
}
