import java.util.Arrays;
import java.text.Collator;
import java.util.Locale;


public class CifradoCesar {
    private static final char[] ALFABETO;
    private static final char[] ALFABETOC;
    private static final int MINROTACIONES = 1;
    private static int rotaciones;

    Collator esp = Collator.getInstance( new Locale( "es", "ES" ) );


    static {
        ALFABETO = new char[27];
        char letra;
        for (int i = 0, j = 0; i < ALFABETO.length; i++, j++) {
            letra = (char) ('A' + i);
            if (letra == 'O') {
                ALFABETO[i] = 'Ñ';
                j--;
            } else {
                ALFABETO[i] = (char) ('A' + j);
            }
        }

            ALFABETOC = Arrays.copyOf(ALFABETO, ALFABETO.length);
        }

        /**
         * Inicializa el alfabeto cifrado rotándolo a la derecha un número aleatorio de veces
         */
    public CifradoCesar() {
            // TODO: 06/02/2018 Ver orden de ejecución
            //this(rotaciones);
            do {
                rotaciones = (int) (Math.random() * ALFABETO.length) + MINROTACIONES;
            } while (rotaciones == ALFABETO.length);
            Util.rotarDerecha(ALFABETOC, rotaciones);
        }

        /**
         * Contructor que permite crear un objeto con un alfabeto cifrado rotado n veces a la derecha
         * @param n     Nº de rotaciones a la derecha del alfabeto cifrado
         */
    public CifradoCesar( int n){
            Util.rotarDerecha(ALFABETOC, n);
        }

        /**
         * Cifra un texto usando el código de cifrado
         * Los caracteres del texto que no existan en el ALFABETO no serán cifrados quedando igual en el texto cifrado
         * @param texto     Texto a cifrar
         * @return Texto cifrado según el código
         */
        public String cifrar (String texto){
            String cifrado = "";
            int posicion = 0;
            for (int i = 0; i < texto.length(); i++) {
                posicion = Util.buscarDicotomica(ALFABETO, texto.charAt(i));
                if (posicion == -1)
                    cifrado += texto.charAt(i);     // El carácter queda sin cifrar
                else
                    cifrado += ALFABETOC[posicion];
            }
            return cifrado;
        }

        public String toString () {
            return String.format("\nALFABETO:\t\t\t%s", Arrays.toString(ALFABETO)) +
                    String.format("\nALFABETO CIFRADO:\t%s", Arrays.toString(ALFABETOC));
        }

    }
