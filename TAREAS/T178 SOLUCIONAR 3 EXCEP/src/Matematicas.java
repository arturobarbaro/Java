public class Matematicas {
    public double dividir(double a, double b) throws ArithmeticException {
         if (b == 0) {
             throw new ArithmeticException("El argumento b no puede ser 0");

         }
         return a / b;
    }
 }