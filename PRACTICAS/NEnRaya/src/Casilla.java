import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.BLUE;
import static org.fusesource.jansi.Ansi.ansi;

public class Casilla {
    private Ficha ficha;

    public boolean estaVacia() {
        return ficha==null;
    }

    public void colocar(Ficha ficha) {
        //// TODO: 14/02/2018 assert
        this.ficha = ficha;
    }


    /**
     * Comprueba si 2 casillas son iguales
     * @param o Casilla con la cual comparar
     * @return true Si 2 casillas contienen la misma ficha o si las dos están vacias
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Casilla casilla = (Casilla) o;

        if (this.estaVacia() && casilla.estaVacia()) return true;
        return ficha.equals(casilla.ficha);
    }

    @Override
    public int hashCode() {
        return ficha.hashCode();
    }

    @Deprecated
    @Override
    public String toString() {
        return "Usa toAnsi para que se muestre el texto en color";
        // return "|"+ ((ficha==null)?" ":ficha) +"|";
    }


    /**
     * Representación de una casilla con bordes y color
     *
     * @see     <a href="http://www.unicode.org/charts/PDF/U2500.pdf">Caracteres UNICODE para dibujar tablas</a>
     * @return  Objeto GranAnsi con las líneas que representan una casilla
     */
    public GranAnsi toGranAnsi() {
        Ansi espacioAnsi;
        Ansi.Color color = Ansi.Color.DEFAULT;

        // Caracteres UNICODE para dibujar tablas
        final Ansi esi =    ansi().fgBright(color).a('\u250c').reset();    // Esquina superior izquierda
        final Ansi h =      ansi().fgBright(color).a('\u2500').reset();    // Horizontal
        final Ansi ccs =    ansi().fgBright(color).a('\u2533').reset();    // Cruce central superior
        final Ansi esd =    ansi().fgBright(color).a('\u2510').reset();    // Esquina superior derecha
        final Ansi v =      ansi().fgBright(color).a('\u2502').reset();    // Vertical
        final Ansi eii =    ansi().fgBright(color).a('\u2514').reset();    // Esquina inferior izquierda
        final Ansi eid =    ansi().fgBright(color).a('\u2518').reset();    // Esquina inferior derecha


        Ansi lineaSuperior = ansi().a(esi).a(h).a(h).a(h).a(esd);
        Ansi lineaInferior = ansi().a(eii).a(h).a(h).a(h).a(eid);

        espacioAnsi = ansi().a(" ");

        GranAnsi g = new GranAnsi(3);
        g.a(lineaSuperior);
        g.a(ansi().a(v).a(" ").a((ficha==null) ? espacioAnsi:ficha.toAnsi()).a(" ").a(v));
        g.a(lineaInferior);

        return g;
    }
}
