public abstract class Extremidad {
    private int longitud;

    public Extremidad(int longitud) {
        setLongitud(longitud);
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Extremidad{" +
                "longitud=" + longitud +
                '}';
    }
}
