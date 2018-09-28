package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ejemplo={98,26,-8,0,19,48};
        System.out.println(Arrays.toString(ejemplo));
        burbuja(ejemplo);
        System.out.println(Arrays.toString(ejemplo));
    }

    public static void burbuja(int[] matriz){
        comprobar(matriz);

        int aux;
        for(int i=0;i<matriz.length-1;i++) {
            for (int j = 0; j < matriz.length - i - 1; j++)
                if (matriz[j + 1] < matriz[j]) {
                    aux = matriz[j + 1];
                    matriz[j + 1] = matriz[j];
                    matriz[j] = aux;
                }
        }
    }

    private static void comprobar(int[] matriz) {
        assert matriz!=null : "Error: la matriz no puede ser nula";
        assert matriz.length >0 : "Error: la matriz no puede estar vacia";
    }
}
