package com.company;

import java.text.Collator;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String b="a";
        Collator e = Collator.getInstance(new Locale("es","ES"));
        System.out.println(e.compare("a","b"));
        System.out.println((char)"a".compareTo("a"));
    }

    private static int compareTo(String a){
        assert a!=null: "Error: la palabra no puede ser nula";
        assert a.length()>0: "Error: la palabra no puede estar vacia";

        int comparador=-1;
        do{
            for (int i = 0; i < a.length(); i++) {
                //comparador=this.charAt(i)-a.charAt(i);
            }
        }while (comparador!=0);

        return comparador;
    }
}
