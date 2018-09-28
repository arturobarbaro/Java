public class T119 {

    public static void main(String[] args) {
        mostrar(primos(1,3));

    }

    private static int[] primos(int min, int max) {
       // assert max > min;

        int contador = 0;
        for (int i = min; i < max; i++) {
            if (min % i == 0) {
                min++;
                contador += 1;
            }
        }
        int[] primos = new int[contador];

        for (int i = 1, j = 0; min <= max; i++) {
            if (min % i == 0) {
                if(j==2){
                    primos[j] = min;
                }
                min++;
                j++;
            }
        }
            return primos;
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    static void mostrar(int[] a){
        System.out.print(a[0]);
        for (int i=1; i<a.length; i++){
            System.out.print(","+a[i]);
        }
    }
}

