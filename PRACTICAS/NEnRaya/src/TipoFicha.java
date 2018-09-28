import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

public enum TipoFicha {
    O,X;

    TipoFicha() {
    }

    public Ansi toAnsi() {
        Ansi OAnsi,XAnsi;

        OAnsi = ansi().fg(GREEN).a(O).reset();
        XAnsi = ansi().fg(RED).a(X).reset();

        return this.equals(O) ? OAnsi : XAnsi;
    }
}
