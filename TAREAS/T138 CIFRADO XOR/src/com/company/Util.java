package com.company;

public class Util {
    public static void rotarDerecha(char[] a) {
        if (a==null || a.length <= 1)
            return;

        char aux = a[a.length-1];
        for (int i = a.length-1; i >= 1; i--)
            a[i] = a[i - 1];
        a[0] = aux;
    }

    public static void rotarDerecha(char[] a, int veces) {
        for (int i = 1; i <= veces ; i++)
            rotarDerecha(a);
    }

    /**
     * Búsqueda dicotómica
     * Requiere:    que el array a esté ordenado
     * @param a     Array donde se va a buscar el caracter
     * @param c     Carácter a buscar
     * @return      Posición del carácter encontrado o -1 e.o.c.
     */
    public static int buscarDicotomica(char[] a, char c) {
        int izquierda = 0;
        int derecha = a.length-1;
        int posicion = -1;

        int mitad;
        while (izquierda<=derecha) {
            mitad = (izquierda+derecha)/2;
            if (a[mitad]==c) {
                posicion = mitad;
                break;
            } else if (a[mitad]>c)
                derecha = mitad -1;
            else // a[mitad] < c
                izquierda = mitad + 1;
        }
        return posicion;
    }

}

