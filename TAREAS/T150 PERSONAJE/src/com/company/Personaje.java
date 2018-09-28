package com.company;

public class Personaje {
    private String alias;
    private int altura;

    public Personaje(String alias) {
        setAlias(alias);
    }

    public Personaje(String alias, int altura) {
        setAlias(alias);
        setAltura(altura);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        assert altura>0 : "Error: la altura no puede ser negativa";
        this.altura = altura;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        assert alias!=null : "Error: el alias no puede ser nulo";
        assert alias.length()>0 : "Error: el alias no puede ser vacio";
        this.alias = alias;
    }

    public boolean equals(Personaje p) {
        assert p!=null : "Error: el personaje no puede ser nulo";

        if (this == p)
            return true;
        if (p == null || getClass() != p.getClass())
            return false;
        return this.alias== p.alias;
    }

    // Devuelve la posicion
    public static int busquedaLineal(Personaje[] p, String alias){
        assert p!=null : "Error: el array no puede ser nulo";
        assert p.length>0 : "Error: el array no puede ser vacio";
        assert alias!=null : "Error: el alias no puede ser nulo";
        assert alias.length()>0 : "Error: el alias no puede ser vacio";
        
        int pos=-1;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getAlias()==alias){
                pos=i;
            }
        }
        return pos;
    }
    public int compareTo(Personaje p) {
        assert p!=null : "Error: el personaje no puede ser nulo";

        if (this == p) {
            return 0;
        }

        return this.getAltura()-p.getAltura();
    }

    public static void ordenarSeleccionDirecta(Personaje[] personajes) {
        assert personajes!=null : "Error: el array no puede ser nulo";
        assert personajes.length>0 : "Error: el array no puede ser vacio";
        Personaje aux;
        int posmin;

        for (int i = 0; i <personajes.length-1; i++)
        {
            posmin = i;
            for (int j=i+1; j < personajes.length; j++)
                if (personajes[j].compareTo(personajes[i])<0)
                    posmin = j;
            aux = personajes[posmin];
            personajes[posmin] = personajes[i];
            personajes[i] = aux;
        }
    }

    public static void ordenarSeleccionDirectaDescendiente(Personaje[] personajes) {
        assert personajes!=null : "Error: el array no puede ser nulo";
        assert personajes.length>0 : "Error: el array no puede ser vacio";
        Personaje aux;
        int posmin;

        for (int i = 0; i <personajes.length-1; i++)
        {
            posmin = i;
            for (int j=i+1; j < personajes.length; j++)
                if (personajes[j].compareTo(personajes[i])>0)
                    posmin = j;
            aux = personajes[posmin];
            personajes[posmin] = personajes[i];
            personajes[i] = aux;
        }
    }

    public static void mostrar(Personaje[] personajes){
        assert personajes !=null : "Error: el array no puede ser nulo";
        assert personajes.length>0 : "Error: el array no puede ser vacio";

        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i].getAlias()+", "+ personajes[i].getAltura());
        }
    }

    public int compareToMejorado(Personaje p) {
        assert p!=null : "Error: el personaje no puede ser nulo";
        assert  p.getAlias().length()>0 : "Error: el alias del personaje no puede ser vacio";

        if (this == p) {
            return 0;
        }
        if (this.getAlias().compareTo(p.getAlias())==0){
            return this.getAltura()-p.getAltura();
        }

        return this.getAlias().compareTo(p.getAlias());
    }
}

