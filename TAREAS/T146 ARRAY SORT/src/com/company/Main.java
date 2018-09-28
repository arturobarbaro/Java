package com.company;

import java.util.Arrays;

import static java.util.Arrays.parallelSort;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={9,4,1,98};
        System.out.println(Arrays.toString(a));

        parallelSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void mostrar(int[] a){
        assert a!=null : "Error: el array no puede ser nulo";
        assert a.length>0 : "Error: el array no puede estar vacio";
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(","+a[i]);
        }
    }
}
