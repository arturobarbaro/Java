package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{0,1,2}};
        mostrar(matriz);
        transpuesta(matriz);

        int[][] a ={{1,2,2},{3,4,5},{7,8,9}};
        mostrar(a);
        transpuesta(a);

    }

    public static void transpuesta(int[][] matriz){
        comprobacionDeParametros(matriz);

        int contador=0;
         do {
             for (int j = 0; j < matriz[j].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                    System.out.print(matriz[i][j]+ " ");
                    }
                 System.out.println();
                 contador++;
             }
             System.out.println();
         } while (contador < matriz.length-1);

    }

    public static void mostrar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void comprobacionDeParametros(int[][] matriz){
        assert matriz!=null : "Error: la matriz no puede ser nula";
        assert matriz.length>0 : "Error: la matriz no puede ser vacia";

        for (int i = 0; i < matriz.length; i++) {
            assert matriz[i].length>0 : "Error: la matriz no puede ser vacia";
        }
    }
}
