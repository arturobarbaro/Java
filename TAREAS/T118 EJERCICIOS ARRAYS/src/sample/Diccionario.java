package sample;

import java.util.Arrays;

public class Diccionario {

    private static final int MAXPALABRAS=200;
    private Palabra[] palabras;
    int pos=0;

    public Diccionario(int numPalabras){
        assert numPalabras<=MAXPALABRAS: "Error:...";
        palabras=new Palabra[numPalabras];

    }

    public boolean agregar(Palabra palabra){
        assert palabra!=null : "Error: la palabra no puede ser nula";
        boolean agregada=false;

        if (pos<=palabras.length-1 ){

        }
        return agregada;
    }

     /**
     *
     * @param p
     * @return
     */

    private boolean buscar(Palabra p){
         boolean b=false;

         for (int i = 0; i < palabras.length; i++) {
             palabras[i]==p;
         }
        return b;
    }


    public static void eliminar(Palabra[] diccionario, Palabra palabra){
        assert diccionario.length>=1: "Error: El diccionario no puede ser nulo";
        assert diccionario.length>=1: "Error: El diccionario no puede tener longitud 0";
        assert palabra!=null: "Error: La palabra no puede ser nula";
        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i]==palabra){
                diccionario[i]=null;
                //pos++;
            }
        }

    }

    public void ordenarSeleccionDirecta(int[] array){
        int posmin, aux;
        for (int i = 0; i <array.length-1; i++) {
            posmin = i;
            for (int j=i+1; j < array.length; j++){
                if (array[j] < array[posmin]) {
                    posmin = j;
                }
            aux = array[posmin];
            array[posmin] = array[i];
            array[i] = aux;
            }

            /*if (array[posmin]=null) {
                posmin = j;
            }
                aux = array[posmin];
                array[posmin] = array[i];
                array[i] = aux;
            */
        }
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "palabras=" + Arrays.toString(palabras) +
                '}';
    }
}
