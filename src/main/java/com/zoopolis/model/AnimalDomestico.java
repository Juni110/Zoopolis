package com.zoopolis.model;

public class AnimalDomestico extends Animal {

    private String raza;
    private String color;

    public AnimalDomestico() {
    }

    public AnimalDomestico(String raza, String color, String rutaImagen, String especie, String sexo, int edad, String descripcion) {
        super(rutaImagen, especie, sexo, edad, descripcion);
        this.raza = raza;
        this.color = color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

        public String[] getVector() {
        String animal[] = new String[8];
        animal[0] = getEspecie();
        animal[1] = ""+getSexo();
        animal[2] = String.valueOf(getEdad());
        animal[3] = raza;
        animal[4] = color;
        animal[5] = "NO REGISTRA";
        animal[6] = "DOMÉSTICA";
        animal[7] = getDescripcion();

        return animal;
    }
}
