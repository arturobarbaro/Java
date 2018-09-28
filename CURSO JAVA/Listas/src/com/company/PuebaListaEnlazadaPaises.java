package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class PuebaListaEnlazadaPaises {
    public static void main(String[] args) {
        LinkedList<String> paises=new LinkedList<>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales=new LinkedList<>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");

        //System.out.println(paises+" "+capitales);

        ListIterator<String> itPaises=paises.listIterator();
        ListIterator<String> itCapitales=capitales.listIterator();

        while (itCapitales.hasNext()){
            if (itPaises.hasNext()){
                itPaises.next();
                itPaises.add(itCapitales.next());
            }
        }

        System.out.println(paises);

        itCapitales=capitales.listIterator();
        while(itCapitales.hasNext()){
            itCapitales.next();

            if (itCapitales.hasNext()){
                itCapitales.next();
                itCapitales.remove();
            }
        }
    }
}
