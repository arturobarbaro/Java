package com.company;

public class Persona {
    int anio;
    int estatura;       //cm

    public Persona(int anio, int estatura) {
        assert anio>0|| estatura>0: "Error: introduzca datos validos";

        this.anio = anio;
        this.estatura = estatura;
    }

    public int compareTo(Persona otra){
        int p=anio-otra.anio;
        if (p==0){
            p=estatura-otra.estatura;
        }
        return p;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "anio=" + anio +
                ", estatura=" + estatura +
                '}';
    }
}
