import java.lang.reflect.Array;
import java.util.Arrays;

public class CifradoCesar {
    private static  final char[] ALFABETO;
    private static  final char[] ALFABETOC;

    static {

        ALFABETO = new char[27];
        char letra;

        //letra = (char) ('a'+i);
        /*int i=0;
        do {

                ALFABETO[i] = (char) ('a' + i);
                System.out.print(ALFABETO[i]);
                i++;
            }
            while(i<='o');
        do {
                ALFABETO[i] = (char) ('a' + i-1);
                System.out.print(ALFABETO[i]);
                i++;
            }
            while(i>'o');
            */

        ALFABETOC= Arrays.copyOf(ALFABETO, ALFABETO.length);
    }

    static void mostrar(char[] c){
        for (char e:c){
            System.out.print(e);
        }

    }
}
