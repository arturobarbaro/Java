import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Ficha {
    private TipoFicha tipo;

    public Ficha(TipoFicha tipo) {
        setTipo(tipo);
    }

    public void setTipo(TipoFicha tipo) {
        assert tipo!=null : "Error: el tipo de ficha no puede ser nulo";
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ficha ficha = (Ficha) o;

        return tipo.equals(ficha.tipo);
    }

    @Override
    public int hashCode() {
        return tipo.hashCode();
    }

    @Deprecated
    @Override
    public String toString() {
        return "Usa toAnsi para que se muestre el texto en color";
        // return tipo.toString();
    }

    public Ansi toAnsi() {
      return tipo.toAnsi();
    }
}

