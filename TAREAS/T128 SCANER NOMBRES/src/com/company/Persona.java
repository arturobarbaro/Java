package com.company;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        assert nombre.length()>0 : "Error: el nombre no puede ser una cadena vacia";
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void mostrar(Persona[] a) {
        assert a!=null : "Error: la persona no puede ser nula";

        System.out.println(a[0].nombre);
        for (int i = 1; i < a.length; i++) {
            System.out.println(", "+a[i].nombre);
        }

    }
}
