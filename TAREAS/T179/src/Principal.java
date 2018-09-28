public class Principal {
    public static void main(String[] args) {
        int division;
        try {
            division=0/0;
        } catch (RuntimeException a){
            a.getMessage();
        } catch (ArithmeticException b){
            b.getMessage();
        }

        // La superclase ya engloba a las excepciones de las subsclases, por lo que son cazadas en el primer bloque.
        // Deben ir las subclases y excepciones mas especificas al principio
    }
}
