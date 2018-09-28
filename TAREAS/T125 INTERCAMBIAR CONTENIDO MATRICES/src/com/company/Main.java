package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[][]={
                {1,2,3},
                {4,5,6}};
        int b[][]= {{6,5,4},{3,2,1}};
        mostrar(a);
        mostrar(b);

        intercambiar(a,b);
        mostrar(a);
        mostrar(b);

    }

    public static void intercambiar(int a[][], int b[][]){
        comprobar(a,b);

        int aux[][]= new int[a.length][a[0].length];

           /* for (int fila = 0; fila < a.length; fila++)
                for (int columna = 0; columna < a[fila].length; columna++)
                    a[fila][columna] = aux[fila][columna];
            for (int fila = 0; fila < b.length; fila++)
                for (int columna = 0; columna < b[fila].length; columna++)
                    a[fila][columna] = b[fila][columna];

            for (int fila = 0; fila < b.length; fila++)
                for (int columna = 0; columna < b[fila].length; columna++)
                    b[fila][columna] = aux[fila][columna];
            */

        for (int i = 0; i < a.length; i++) {
            aux[i]=a[i];
            a[i]=b[i];
            b[i]=aux[i];
        }
      //a^b;
    }

    public static void comprobar(int a[][], int b[][]) {
        assert a!=null || b!=null;
        assert a.length>0 || b.length>0;
        assert a.length==b.length;
        for (int i = 0; i < a.length ; i++) {
            assert a[i].length==b[i].length;

        }
    }

    public static void mostrar(int[][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length ; columna++) {
                if (fila == matriz.length-1 && columna== matriz.length){
                    System.out.print(matriz[fila][columna]);
                }
                else {
                    System.out.print(matriz[fila][columna] + ",");
                }
            }
        }


        System.out.println();

    }

}
