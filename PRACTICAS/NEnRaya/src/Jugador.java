import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.ansi;

public class Jugador {
    private String alias;           // NO NULO, NO VACIO
    private TipoFicha tipoFicha;
    private int turno;              // 0 o 1

    public Jugador(String alias, TipoFicha tipoFicha, int turno) {
        setAlias(alias);
        setTipoFicha(tipoFicha);
        setTurno(turno);
    }

    public void setAlias(String alias) {
        assert alias!=null : "Error: el alias no puede ser nulo";
        assert !alias.isEmpty(): "Error: el alias no puede estar vacio";
        this.alias = alias;
    }

    public void setTipoFicha(TipoFicha tipoFicha) {
        assert tipoFicha!=null : "Error: el tipo de ficha no puede ser nula";
        this.tipoFicha = tipoFicha;
    }

    public void setTurno(int turno) {
        assert turno==0 || turno==1: "Error: el turno debe ser 0 o 1";
        this.turno = turno;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    @Deprecated
    @Override
    public String toString() {
        return "Usa toAnsi para que se muestre el texto en color";
        // return alias+" ("+tipoFicha+")";
    }

    public Ansi toAnsi() {
        return ansi().a(alias+" (").a(tipoFicha.toAnsi()).a(")");
    }
}
