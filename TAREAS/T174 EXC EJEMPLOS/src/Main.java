import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(division(1,null));
        //System.out.println(division());
        int[] notas = new int[0];

        //media(notas);
        int[] notas1 = {2,7};
        media(notas1,1);
    }

    // ArithmeticException
    public static int division(Integer num, Integer dem){
        int div;
        try {
            div = num/dem;
        } catch (ArithmeticException ex){
            div=0;
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException ex){ // NullPointerException
            div=-1;
            System.out.println(ex.getMessage());
        }
        return div;
    }

    // InputMismatchException
    public static int division(){
        int div;
        Scanner scanner = new Scanner(System.in);
        int num;
        int dem;
        try {
            System.out.println("Numerador: ");
            num = scanner.nextInt();
            System.out.println("Denominador: ");
            dem = scanner.nextInt();
            div = num/dem;
        } catch (InputMismatchException ex){ // InputMismatchException
            div=-1;
            System.out.println(ex.getMessage());
        }
        return div;
    }

    // IllegalArgumentException
    public static double media(int[] notas) throws IllegalArgumentException {
        int lon = notas.length;
        if (lon == 0) {
            throw new IllegalArgumentException();
        } else {
            int total = 0;
            for (int i = 0; i < lon; i++) {
                total += notas[i];
            }
            return total / lon;
        }
    }

    // IllegalStateException
    public static double media(int[] notas,int a) throws IllegalArgumentException{
            int lon = notas.length;
            if (lon!=a){
                throw new IllegalStateException();
            }
            else {
                int total = 0;
                for (int i = 0; i < lon; i++){
                    total+=notas[i];
                }
                return total/a;
            }
    }




}
