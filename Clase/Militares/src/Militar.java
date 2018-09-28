import java.util.Objects;

public class Militar
        implements Comparable<Militar> {

    private static final int MINNUMERO=1;
    private int numero;                     // >=MINNUMERO, AUTO, NO MODIFICABLE
    private static int contador = 0;        // >=0
    private TipoRango rango;                // NOT NULL
    private Telefono telefono;


    public Militar(TipoRango rango) {
        setNumero(incContador());
        setRango(rango);
    }

    public int incContador() {
        return ++contador;
    }

    /**
     * Mutador de numero
     *
     * @param numero    Número autoincrementado de un militar. No puede cambiar una vez creado
     * @throws IllegalArgumentException
     *                  Si el número de un militar es menor que MINNUMERO
     */
    private void setNumero(int numero) {
        if (numero<MINNUMERO)
            throw new IllegalArgumentException(String.format(   "Error: el número de un militar no puede ser menor"+
                                                                "que %d %d)", MINNUMERO, numero));

        this.numero = numero;
    }

    /**
     * Mutador del rango de un militar
     *
     * @param rango     rango del militar
     * @throws NullPointerException
     *          Si el rango es nulo
     */
    public void setRango(TipoRango rango) {
        if (rango==null)
            throw new NullPointerException("Error: el rango de un militar no puede ser nulo");
        this.rango = rango;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // if (!(o instanceof Militar)) return false;
        Militar otro = (Militar) o;
        return rango.equals(otro.rango);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rango);
    }

    @Override
    public int compareTo(Militar otro) {
        return -rango.compareTo(otro.rango);
    }

    @Override
    public String toString() {
        return "Militar{" +
                "numero=" + numero +
                ", rango=" + rango +
                ", telefono=" + telefono +
                '}';
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
