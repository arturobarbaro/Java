package sample;

public class T117 {

    public static boolean buscarDicotomica(int[] numeros, int valorBuscado)
    {
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = (numeros.length - 1);
        int mitad = 0;
        while (izquierda<=derecha && !encontrado)
        {
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado)
                encontrado = true;
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        }
        return encontrado;
    }

    public static void mostrar(boolean a){
        System.out.print(a);
    }
}
