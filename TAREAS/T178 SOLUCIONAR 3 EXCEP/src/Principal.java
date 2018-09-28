public class Principal {
    public static void main(String[] args) {
        Matematicas m = new Matematicas();
        try {
            double a = m.dividir(288583248282999077979888989890809890789.0,0.00001);
        } catch (ArithmeticException a) {
            // Aquí capturamos cualquier excepción IOException que se lance (incluidas sus subclases)
            a.getMessage();
        } catch (IllegalArgumentException b){
            b.getMessage();
        } catch (IndexOutOfBoundsException c){
            c.getCause();
        }

    }
}
