import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionPorCero {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean correcto = false;

        do {
            try {
                System.out.print("Numerador: ");
                int a = s.nextInt();
                System.out.print("Denominador: ");
                int b = s.nextInt();

                int x = cociente(a, b);
                System.out.printf("Resultado de %d/%d = %d\n", a, b, x);
                correcto = true;
            } catch (InputMismatchException e) {
                // System.out.println(e);
                s.nextLine();
                System.out.println("Debe introducir números enteros\n");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                return;
            } finally {
                System.out.println("Soy el bloque finally...");
            }
        } while (!correcto);
        System.out.println("Hasta la próxima!!!");
    }

    private static int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }
}
