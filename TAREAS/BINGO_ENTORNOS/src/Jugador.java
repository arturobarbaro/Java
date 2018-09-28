public class Jugador {

    private String alias;       // NOT NULL, NO VACIO
    private  int turno;         // NOT NULL, UNICO
    private Carton[] cartones;  //1-3

    public Jugador(String alias, int turno, int n) {
        setAlias(alias);
        setCartones(n);
        setTurno(turno);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        assert alias!=null : "Error: el alias no puede ser nulo";
        assert alias.length()>0 : "Error: el alias nopuede ser vacio";
        this.alias = alias;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        assert turno>=0 : "Error: el turno no puede ser negativo, debe tener un orden valido";
        this.turno = turno;
    }

    public Carton[] getCartones() {
        return cartones;
    }

    public void setCartones(int n) {
        this.cartones = cartones;
    }
}
