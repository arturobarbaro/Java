public class Trozo {
    private boolean tocado;
    private Barco barco;

    public Trozo(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Trozo{" +
                "tocado=" + tocado +
                ", barco=" + barco +
                '}';
    }
}
