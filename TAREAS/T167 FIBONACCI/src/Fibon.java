import java.util.HashMap;

public class Fibon {
    private static HashMap<Integer, Integer> numeros = new HashMap<>();

    public static void main(String[] args) {
        Fibon f = new Fibon();
        //System.out.println(f.fibonacci(70));
        //System.out.println(f.fibonacci(70));

        int a=2, b=1;
        System.out.print(a++);
        System.out.println(0%2);

    }

    public int fibonacci(Integer n) {
        Integer aux;
        if (n == 1 || n == 2) {
            return 1;
        } else if ((aux = numeros.get(n)) != null) {
            System.out.println("Yupi");
            return aux;
        } else {
            Integer result = fibonacci(n - 1) + fibonacci(n - 2);
            numeros.put(n, result);
            return result;
        }
    }


}

