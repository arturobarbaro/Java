import org.fusesource.jansi.AnsiConsole;

/**
 * N en raya
 *
 * @version 0.6 (22/2/2018)
 * @author Eduardo Barra Balao
 */
public class Principal {

    public static final String VERSION = "0.6.1 - 7/MARZO/2018";

    public static void main(String[] args) {
        AnsiConsole.systemInstall();

        comprobarParametros(args);

        Integer n = 3;
        if (args.length==3)
            n = Integer.parseInt(args[2]);

        new Partida(new String[]{args[0],args[1]}, n).jugar();

        AnsiConsole.systemUninstall();
    }

    private static void comprobarParametros(String[] args) {
        if (    args==null
                || args.length<2
                || (args.length==3 && !Util.esNumero(args[2]))  ) {
            uso();
            System.exit(1);
        }
    }

    private static void uso() {
        System.out.println("Juego del N en Raya (v0.6)");
        System.out.println("Uso: NEnRaya jugador1 jugador2 [n]");
        System.out.println();
        System.out.printf("n debe ser cómo mínimo %d\n", Partida.MIN);
    }

}
