package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={44, 22, 12, 34, 0, -5, 69};
        ordenarInsercionDirecta(a);
        mostrar(a);
        int[] b={88,0,-1,5,4,7};
        ordenarInsercionDirecta(b);
        mostrar(b);
    }

    public static void ordenarInsercionDirecta(int[] array) {
        /*
        Se toma el 1er elemento de entre los que quedan sin ordenar
        y se inserta en el lugar que le corresponda entre los elementos situados a
        su izquierda (que ya están ordenados) desplazando los componentes superiores
        al tratado un lugar hacia la derecha
         */
        comprobarArray(array);
        int aux;
        int j=0;
        for ( int i = 1; i < array.length; i++) {
            aux = array[i];
            j=i-1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }

    public static void ordenarSeleccionDirecta(int[] array){
       /* El método consiste en seleccionar en cada paso de ordenación el elemento de menor valor de
        *entre los que quedan por ordenar e intercambiarlo con el primero de la secuencia que se está
        *tratando en ese paso. El proceso se repite desde el primero al penúltimo elemento del array.
       */
       comprobarArray(array);
        int posmin, aux;
        for (int i = 0; i <array.length-1; i++)
        {
            posmin = i;
            for (int j=i+1; j < array.length; j++)
                if (array[j] < array[posmin])
                    posmin = j;
            aux = array[posmin];
            array[posmin] = array[i];
            array[i] = aux;
        }
    }

    private static void comprobarArray(int[] array){
        assert array!=null : "Error: la matriz no puede ser nula";
        assert array.length>0 : "Error: la matriz no puede estar vacia";
    }

    public static void mostrar(int a[]) {
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(","+a[i]);
        }
        System.out.println();

    }
}
