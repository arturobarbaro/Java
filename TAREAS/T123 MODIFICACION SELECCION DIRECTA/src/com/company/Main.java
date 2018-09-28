package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a ={1,0,2};
        POSICIONDELMINIMO(a);
        System.out.println(Arrays.toString(a));

    }

    private static void POSICIONDELMINIMO(int[] array) {
        comprobarArray(array);

        int posmin;
        for (int i = 0; i <array.length-1; i++)
        {
            posmin = i;
            for (int j=i+1; j < array.length; j++)
                if (array[j] < array[posmin])
                    posmin = j;

        }
    }

    private static void INTERCAMBIAR(int[] array, int i) {
        comprobarArray(array);
        assert i>=0 && i<array.length : "Error : posicion no valida, debe estar comprendida entre los valores de la longitud de la matriz";
        int posmin=0, aux=0;
        POSICIONDELMINIMO(array);
        aux = array[posmin];
        array[posmin] = array[i];
        array[i] = aux;
    }

    private static void comprobarArray(int[] array){
        assert array!=null : "Error: la matriz no puede ser nula";
        assert array.length>0 : "Error: la matriz no puede estar vacia";
    }
}
