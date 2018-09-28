import java.util.Arrays;

public class Flota {
    private Barco[] barcos;

    public Flota(int n, int maxLongitd) {
        barcos= new Barco[n];
    }

    @Override
    public String toString() {
        return "Flota{" +
                "barcos=" + Arrays.toString(barcos) +
                '}';
    }
}
