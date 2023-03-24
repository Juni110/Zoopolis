package com.zoopolis.zoopolis;

public class AnimalSalvaje extends Animal{
    private String peligrosidad;

    public AnimalSalvaje(String peligrosidad, String nombreComun, String nombreCientifico, String tipoAnimal, String tipooAlimentacion, String descripcion) {
        super(nombreComun, nombreCientifico, tipoAnimal, tipooAlimentacion, descripcion);
        this.peligrosidad = peligrosidad;
    }
    
    
}
