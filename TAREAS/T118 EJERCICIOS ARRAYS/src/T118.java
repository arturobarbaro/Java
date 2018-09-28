public class T118 {
    private static int[] a;

    public static void main(String[] args) {
        int[] a = {11, 2, 3, 4, 5, 6};
        buscarLineal2(a,1);

    }

    public static boolean buscarLineal(int[] numeros, int valorBuscado)
    {
        boolean encontrado = false;
        int i = 0;
        while (i < numeros.length && !encontrado)
            if (numeros[i] == valorBuscado)
                encontrado = true;
            else
                i++;
        return encontrado;
    }


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


