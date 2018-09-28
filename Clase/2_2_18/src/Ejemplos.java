import java.util.Arrays;

public class Ejemplos {

    public static void main(String[] args) {
        int[] a={1,2,4,3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Persona[] personas= new Persona[]{new Persona("Bb"),new Persona("Aaa")};
        System.out.println(Arrays.toString(personas));
        Arrays.sort(personas);
        System.out.println(Arrays.toString(personas));
    }
}
