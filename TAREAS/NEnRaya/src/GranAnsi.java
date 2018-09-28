import org.fusesource.jansi.Ansi;

/**
 * Clase que almacena varias líneas Ansi para ser usadas de manera independiente
 *
 */
public class GranAnsi {
    private Ansi[] lineasAnsi;
    private int ocupadas;           // Número de líneas que contiene el objeto GranAnsi actualmente

    /**
     * Crea un objeto GranAnsi
     *
     * @param n Número de líneas Ansi
     */
    public GranAnsi(int n) {
        assert n>=1 : String.format("Error: el número de líneas de un objeto GranAnsi debe ser >= 1 (%d)\n", n);

        lineasAnsi = new Ansi[n];
        ocupadas = 0;
    }

    /**
     * Añade una nueva línea Ansi al objeto GranAnsi
     *
     * @param   lineaAnsi Línea Ansi a añadir
     * @return  El objeto GranAnsi con la línea añadida
     */
    public GranAnsi a(Ansi lineaAnsi) {
        assert lineaAnsi != null : "Error: la línea Ansi a añadir no puede ser nula";
        assert libres() >= 1 : "Error: el objeto GranAnsi está lleno. No es posible añadir más líneas";

        lineasAnsi[ocupadas++] = lineaAnsi;
        return this;
    }

    /**
     * Número de líneas que se han añadido al objeto GranAnsi
     *
     * @return  Número de líneas ocupadas
     */
    public int longitud() {
        return ocupadas;
    }

    /**
     * Número de líneas que aun se pueden añadir al objeto GranAnsi
     *
     * @return  Número de líneas libres
     */
    public int libres() {
        return capacidad()-longitud();
    }


    /**
     * Capacidad en líneas
     *
     * @return  Número máximo de líneas que puede contener un objeto GranAnsi
     */
    public int capacidad() {
        return lineasAnsi.length;
    }

    /**
     * Obtener una línea
     * @param i     Número de línea ({@literal >=0 y <longitud()})
     * @return      Línea Ansi i
     */
    public Ansi linea(int i) {
        assert i>=0 && i<=longitud(): String.format("Error: el número de línea recibido (%d) no está en el rango [%d,%d]\n",
                                        i, 0, longitud());
        return lineasAnsi[i];
    }

    public Ansi toAnsi() {
        Ansi a = new Ansi();
        for (int i = 0; i < longitud(); i++)
            a.a(linea(i)).a("\n");
        return a;
    }

}
