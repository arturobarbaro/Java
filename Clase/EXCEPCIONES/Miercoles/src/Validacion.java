import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean correcto = false;

        do {
            try {
                System.out.println("Introduzca los datos de la persona a crear: ");
                System.out.print("Alias (no vacio): ");
                String alias = s.nextLine();
                System.out.print(String.format("Peso (>=0 y <%d): ", Persona.MAXPESO));
                int peso = s.nextInt();
                Persona p1 = new Persona(alias, peso);
                correcto = true;
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println(String.format("El peso debe ser entero"));
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                s.nextLine();
                System.out.println("No ha sido posible crear la persona\n" + e.getMessage());
            }
        } while (!correcto);
    }

}
