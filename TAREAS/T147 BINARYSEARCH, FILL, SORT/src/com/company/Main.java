package com.company;

import java.util.Arrays;
import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1,10,2,3};
        // Realiza una busqueda pero no llega hasta el ultimo elemento
        System.out.println(binarySearch(a,0,3,10));

        //
        //Asigna el valor especificado a cada elemento de la matriz
        fill(a,1);
        System.out.println(Arrays.toString(a));


        // Ordena la matriz especificada en orden numérico ascendente
        int[] b={3,2,10,98,-8};
        sort(b);
        System.out.println(Arrays.toString(b));

       // toString deviuelve la matriz y su contenido
    }
}
