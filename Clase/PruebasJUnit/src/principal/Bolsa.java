package principal;
/**
 * Bolsa
 *
 * Clase de pruebas para unitarias JUnit4
 *
 * Una bolsa contiene un numero de bolas
 * Una bolsa tiene una capacidad max de bolas
 */
public class Bolsa { //Alt + enter
    private static final int MINMAX = 1;  //valor minimo de max
    private int max;                      // Numero max de bolas
    private int n;                        // Numero de bolas que hay en una bolsa

    public Bolsa(int max) throws IllegalArgumentException{
        setMax(max);
        setN(0);
    }

    private void setMax(int max) throws IllegalArgumentException {
        if (max<MINMAX)
            throw new IllegalArgumentException(String.format("La bolsa no puede tener una capacidad menor de %d (%d).\n",MINMAX,max));
        this.max = max;
    }

    private void setN(int n) throws IllegalArgumentException {
        if (n<0)
            throw new IllegalArgumentException(String.format("El numero de bolas no puede ser negativo(%d).\n",n));
        this.max = max;
    }

    public void agregarBolas (int num) throws IllegalArgumentException{
        if (n<0)
            throw new IllegalArgumentException(String.format("El numero de bolas no puede ser negativo(%d).\n",n));
        if (n+num>max)
            throw new IllegalArgumentException(String.format("El numero de bolas (%d) supera la capacidad(%d).\n",num,max));

        this.n=num+n;
    }

    public int numeroBolas(){
        return n;
    }

    public int capacidad(){
        return MINMAX;
    }
}
