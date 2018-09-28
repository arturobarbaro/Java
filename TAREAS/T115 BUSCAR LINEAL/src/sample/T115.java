package sample;

import com.sun.org.apache.xpath.internal.SourceTree;

public class T115 {

    static int[] buscarLineal2(int[] a, int b){
        assert  a!=null: "Error: el array no puede ser nulo.";
        assert a.length > 0: "Error: El array debe tener longitud";

        int contador=0;
        for (int i=0; i<a.length; i++){
            if (b==a[i])
                contador++;

        }
        int[] posiciones = new int[contador];

        for (int i=0, j=0; i<a.length; i++){
            if (b==a[i]){
                posiciones[j]=i;
                j++;
            }
        }
        return posiciones;

    }

    static void mostrar(int[] a){
        System.out.print(a[0]);
        for (int i=1; i<a.length; i++)
            System.out.print(","+a[i]);
    }
}
