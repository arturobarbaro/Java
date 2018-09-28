package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Personaje p1=new Personaje("Java");
        Personaje p2=new Personaje("Jva");

        System.out.println(p1.equals(p2));

        Personaje[] personajes ={new Personaje("Hola",180),new Personaje("Adios",170)};
        System.out.println(Personaje.busquedaLineal(personajes,"Adios"));

        //T151
        Personaje.mostrar(personajes);
        Personaje.ordenarSeleccionDirecta(personajes);
        Personaje.mostrar(personajes);
        Personaje.ordenarSeleccionDirectaDescendiente(personajes);
        Personaje.mostrar(personajes);
    }
}
