package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a ={2,4,6,8,10};
        int[] b={2,4,6,8,10,12};
        System.out.println(buscarDicotomica(a,8));
        System.out.println(buscarDicotomica(b,8));
    }

    public static int buscarDicotomica(int[] numeros, int valorBuscado)
    {

        assert numeros!=null : "Error: el array no puede ser nulo";
        assert numeros.length>0 : "Error: el array no puede ser vacio";

        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length-1;
        int mitad = 0;
        int contador=0;

        do {
            contador++;
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado) {
                encontrado = true;
                return contador;
            }
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        } while (izquierda<=derecha && !encontrado);
        return contador;
    }

}
