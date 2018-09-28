public class Coches {
    private int anio;
    private int pvp;

    public Coches(int anio, int pvp) {
        this.anio = anio;
        this.pvp = pvp;
    }

    public int compareTo(Coches otro){
        int p=anio-otro.anio;
        if (p==0) {
            return pvp-otro.pvp;
        }

        return p;
    }
}
