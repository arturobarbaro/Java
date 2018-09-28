import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int num = s.nextInt();
        } catch (IllegalArgumentException a){
            a.getCause();
        } catch (RuntimeException b){
            b.getMessage();
        }
    }
}
