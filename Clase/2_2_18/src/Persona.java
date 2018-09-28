public class Persona implements Comparable<Persona> {
    String alias;

    public Persona(String alias) {
        this.alias = alias;
    }

    public int compareTo(Persona otra){
        return alias.compareTo(otra.alias);
    }

    @Override
    public String toString() {
        return alias;
    }
}
