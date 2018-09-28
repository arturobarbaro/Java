package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void burbuja(int [] array){

        int aux;

        for(int i=0; i<array.length-1; i++) {

            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
        }
    }

    public static void burbuja(Coches[] array){

        Coches aux;

        for(int i=0; i<array.length-1; i++) {

            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j + 1].compareTo(array[j])<0) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
        }
    }

    /*public void ordenar(){
        boolean hayCambio=false;
        int n=coches.length;

        do {
            for (int i=1; i<=n-1; i++) {
                // hayCambio=false;
                if (coches[i-1].compareTo(coches[i]) != 0) {
                    //hayCambio=false;
                    intercambiar((i-1), i);
                    hayCambio = true;
                }
            }
            n--;
        } while (hayCambio);

    }*/
}
