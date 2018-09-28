import java.util.Arrays;

public abstract class Tablero {
    protected Casilla[][] casillas;

    public Tablero(int n) {
        casillas=new Casilla[n][n];
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "casillas=" + Arrays.toString(casillas) +
                '}';
    }
}
