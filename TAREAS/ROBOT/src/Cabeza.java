import java.util.Arrays;

public class Cabeza {
    private Ojo[] ojos;

    public Cabeza() {
    }

    public Cabeza(Ojo[] ojos) {
        setOjos(ojos);
    }

    public Ojo[] getOjos() {
        return ojos;
    }

    public void setOjos(Ojo[] ojos) {
        assert ojos.length==2;
        this.ojos = ojos;
    }

    @Override
    public String toString() {
        return "Cabeza{" +
                "ojos=" + Arrays.toString(ojos) +
                '}';
    }
}
