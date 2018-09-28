package com.company;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a="aa,";

        System.out.println(Arrays.toString(ejemploStringTokenizer(a)));
    }


    public static String[] ejemploStringTokenizer(String cadena) {
        assert cadena!=null : "Error: la cadena no puede ser nula";
        assert cadena.length()>=1 : "Error: la cadena no puede tener longitud nula";
        final String SEPARADOR = ",";
        StringTokenizer frase = new StringTokenizer(cadena, SEPARADOR);
        String unaPalabra = "";
        int contador=0;
        while (frase.hasMoreTokens())
        {
            contador++;
        }
        String[] animales = new String[contador];

        int pos=0;
        while (frase.hasMoreTokens()) {
            animales[pos] = frase.nextToken();
            pos++;

        }
        return animales;
    }
}
