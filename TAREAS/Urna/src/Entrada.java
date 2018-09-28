import java.util.Scanner;

public class Entrada
{
    private Entrada() {}

    // Lee una opción por teclado de entre las opciones posibles recibidas
    // Devuelve: el caracter elegido como opcion por el usuario
    public static char leerOpcion(String opciones) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        char opcion = ' ';

        do {
            System.out.println("Elija una opción: ");
            opcion = sc.nextLine().charAt(0);
            correcto = opciones.indexOf(opcion) >= 0;
            if (!correcto)
                System.out.printf("Error: opción incorrecta. La opción %c no está en las opciones posibles: %s\n", opcion, opciones);
        } while (!correcto);

        return opcion;
    }
}
