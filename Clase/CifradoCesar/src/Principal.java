public class Principal {

    public static void main(String[] args) {
        //Collator esp = Collator.getInstance( new Locale( "es", "ES" ) );
        CifradoCesar c1 = new CifradoCesar(2);
        System.out.println("c1 = " + c1);
        System.out.println(c1.cifrar("HOLA"));
    }
}
