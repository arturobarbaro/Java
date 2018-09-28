public class Persona {
    private String alias;                   // NO NULO, NO VACIO, NO MODIFICABLE
    private int peso;                       // >=0 y <=MAXPESO
    public static final int MAXPESO = 100;  // Peso máximo de una persona
    private Mascota mascota;                // Sólo puede ser distinto de null para personas naturistas
    private boolean naturista;              // Si una persona no es naturista no puede tener mascotas (por defecto: false)

    /**
     * Constructor de Persona
     * @param alias     Alias de la persona (no nulo, no vacio)
     * @param peso      Peso de la persona en kg (>=0) y menor o igual que MAXPESO
     * @throws NullPointerException
     *                  Si el alias de una persona es nulo
     * @throws IllegalArgumentException
     *                  Si el alias de una persona está vacío
     * @throws IllegalArgumentException
     *              Si el peso es negativo o mayor que MAXPESO
     */
    public Persona(String alias, int peso) {
        setAlias(alias);
        setPeso(peso);
        naturista=false;
    }

    /**
     * setAlias
     * @param alias     Alias de la persona (no nulo, no vacio)
     * @throws NullPointerException
     *                  Si el alias de una persona es nulo
     * @throws IllegalArgumentException
     *                  Si el alias de una persona está vacío
     */
    private void setAlias(String alias) {
        // Validación de parámetros
        if (alias==null)
            throw new NullPointerException("El alias de una persona no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("El alias de una persona no puede estar vacío");

        this.alias = alias;
    }

    /**
     * setPeso
     * @param peso  Peso de la persona en kg (>=0)
     * @throws IllegalArgumentException
     *              Si el peso es negativo o mayor que MAXPESO
     */
    public void setPeso(int peso) {
        if (peso<0 || peso>MAXPESO)
            throw new IllegalArgumentException(String.format("El peso no puede ser negativo ni mayor de %d (peso=%d)", MAXPESO, peso));

        this.peso = peso;
    }

    /**
     * Una persona solo puede tener mascota si es naturista
     *
     * @param mascota
     * @throws IllegalStateException
     *          Si la persona no es naturista
     */
    public void setMascota(Mascota mascota) {
        if (!naturista)
            throw new IllegalStateException("No es posible asignar una mascota a una persona que no es naturista");
        this.mascota = mascota;
    }

    public void setNaturista(boolean naturista) {
        this.naturista = naturista;
    }
}
