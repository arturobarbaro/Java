public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1=new Libro("Java","Arturo",01);
        Libro libro2=new Libro("Java","Arturo",01);

        System.out.println(libro1.equals(libro2));
        System.out.println(libro1.hashCode());
        System.out.println(libro2.hashCode());
    }
}
