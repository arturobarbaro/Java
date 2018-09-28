import javax.naming.NameNotFoundException;
import java.io.Serializable;
import java.lang.Double;

public class Main implements Serializable{

    public static void main(String[] args) {
	// write your code here
        System.out.println(div(1.0,0));
        System.out.println(isNaN(div(1.0f,0f)));
    }


    public static int div(int dividendo, int divisor){
        try{
            double div = dividendo/divisor ;

        }catch (ArithmeticException exception){
            return Integer.MIN_VALUE;
        }
        return dividendo/divisor;
    }

    public static float div(float dividendo, float divisor){
        try{
            double div = dividendo/divisor ;

        }catch (ArithmeticException exception){
            return Float.NEGATIVE_INFINITY;
        }
        return dividendo/divisor;
    }

    public static double div(double dividendo, double divisor) throws ArithmeticException{
        try{
            double div = dividendo/divisor ;

        }catch (ArithmeticException exception){
            return Double.NEGATIVE_INFINITY;
        }
        return dividendo/divisor;
    }

    /*
     * Devuelve false si el valor no puede ser representado con float
     */
    static public boolean isNaN(float v) {
        return (v != v);
    }

}
