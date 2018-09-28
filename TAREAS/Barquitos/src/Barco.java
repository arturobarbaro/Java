import java.util.ArrayList;

public class Barco {
    private ArrayList<Trozo> trozos = new ArrayList<>();

    public Barco(int longitud) {
        for (int i = 0; i < longitud; i++) {
            trozos.add(new Trozo(this));
        }
    }

    public boolean estaHundido(){
        return false;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "trozos=" + trozos +
                '}';
    }
}
