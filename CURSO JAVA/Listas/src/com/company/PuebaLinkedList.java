package com.company;

import java.util.*;

public class PuebaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> personas=new LinkedList<>();
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Laura");
        ListIterator<String> it=personas.listIterator();
        it.hasNext();
        it.add("Juan");

        System.out.println(personas.size());
        mostrar(personas);


    }

    private static void mostrar(LinkedList<String> personas){
        for (String persona : personas) {
            System.out.println(persona);
        }
    }
}
