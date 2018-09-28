public class Jugador {
    private String alias;
    private TableroPropio propio;
    private TableroAjeno ajeno;
    private Flota flota;

    /**
     *
     * @param alias
     *              Alias del jugador, no nulo
     * @param propio
     *              Tablero propio del jugador
     * @param ajeno
     *
     * @param flota
     */
    public Jugador(String alias, TableroPropio propio, TableroAjeno ajeno, Flota flota) {
        setAlias(alias);
        setPropio(propio);
        setAjeno(ajeno);
        setFlota(flota);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias==null)
            throw new NullPointerException("El alias no puede ser nulo");
        this.alias = alias;
    }

    public TableroPropio getPropio() {
        return propio;
    }

    public void setPropio(TableroPropio propio) {
        this.propio = propio;
    }

    public TableroAjeno getAjeno() {
        return ajeno;
    }

    public void setAjeno(TableroAjeno ajeno) {
        this.ajeno = ajeno;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "alias='" + alias + '\'' +
                ", propio=" + propio +
                ", ajeno=" + ajeno +
                ", flota=" + flota +
                '}';
    }
}
