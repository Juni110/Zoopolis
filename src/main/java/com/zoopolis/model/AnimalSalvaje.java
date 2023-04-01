package com.zoopolis.model;

public class AnimalSalvaje extends Animal {

    private String peligrosidad;
    private String habitat;

    public AnimalSalvaje() {
    }

    public AnimalSalvaje(String peligrosidad, String rutaImagen, String especie, String sexo, int edad, String descripcion, String habitat) {
        super(rutaImagen, especie, sexo, edad, descripcion);
        this.peligrosidad = peligrosidad;
        this.habitat = habitat;
    }

    public String getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String[] getVector() {
        String animal[] = new String[8];
        animal[0] = getEspecie();
        animal[1] = ""+getSexo();
        animal[2] = String.valueOf(getEdad());
        animal[3] = "NO REGISTRA";
        animal[4] = "NO REGISTRA";
        animal[5] = peligrosidad;
        animal[6] = habitat;
        animal[7] = getDescripcion();

        return animal;
    }
}
