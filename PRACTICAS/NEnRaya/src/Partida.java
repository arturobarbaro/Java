/**
 * Partida de N en Raya
 *
 * Juegan 2 jugadores por turnos
 * El objetivo es colocar n fichas en raya en el tablero en horizontal, vertical o diagonal
 * Los jugadores colocan una ficha por turnos
 * El turno por defecto es 0
 */
public class Partida {
    private Jugador[] jugadores;        // NO NULO, NO VACIO, longitud=2
    private Tablero tablero;
    private int turno;                  // 0 o 1
    private TipoResultado resultado;    // NENRAYA, TABLAS
    private Jugador ganador;            // Ganador del juego (o null si tablas)
    public static final int MIN = 3;    // Tres en raya como mínimo
    private int n;                      // N en raya (>=MIN)

    public Partida(String[] nombres, int n) {
        setN(n);
        inicializarJugadores(nombres);
        setTurno(0);
        tablero=new Tablero(n);

    }

    private void setN(int n) {
        assert n>=MIN : String.format("Error: cómo mínimo tres en raya (%d)\n", n);
        this.n = n;
    }


    public void inicializarJugadores(String[] nombres) {
        assert nombres!=null : "Error: el array de nombres de jugadores no puede ser nulo";
        assert nombres.length==2 : "Error: deben haber 2 nombres de jugadores";

        jugadores = new Jugador[2];

        TipoFicha[] tipos = TipoFicha.values();
        for (int i = 0; i < nombres.length; i++)
            jugadores[i] = new Jugador(nombres[i], tipos[i], i);
    }

    public void setTurno(int turno) {
        assert turno==0 || turno==1: "Error: el turno debe ser 0 o 1";
        this.turno = turno;
    }

    public void jugar() {
        String titulo = String.format("JUEGO DEL %d EN RAYA (v%s)", n, Principal.VERSION);
        System.out.println(Util.linea(titulo.length()));
        System.out.printf("%s\n", titulo);
        System.out.println(Util.linea(titulo.length()));
        System.out.println();
        System.out.println("Jugadores:");
        for (Jugador j:jugadores) {
            System.out.println(j.toAnsi());
        }
        System.out.println();

        // Mostrar tablero inicial (vacio)
        System.out.println(tablero.toAnsi());

        boolean fin = false;
        do {
            System.out.println("Es el turno de: " + jugadores[turno].toAnsi());

            boolean colocada = false;
            do {
                Coordenada c = tablero.leerCoordenada();
                Ficha ficha = new Ficha(jugadores[turno].getTipoFicha());

                colocada = tablero.colocar(ficha, c);
                if (!colocada)
                    System.out.printf("Error: no se pudo colocar la ficha %s en la coordenada %s\n", ficha, c);
            } while (!colocada);

            System.out.println(tablero.toAnsi());

            // TODO: 20/2/18 ACTUALIZAR EN DIAGRAMA DE ACTIVIDADES
            // No hay que cambiar turno en el caso de fin de juego para que quede el turno en el jugador actual
            fin = esFinJuego();
            if (!fin)
                cambiarTurno();
        } while (!fin);

         mostrarResultado();
   }

    private void cambiarTurno() {
        setTurno(1-turno);
    }


    /**
     * Comprueba si hay 3 en raya o tablas o sigue el juego
     *
     * @return  true (fin de juego), false (el juego continua)
     *
     */
    public boolean esFinJuego() {
        // System.out.println("Comprobando fin del juego...");

        // Comprobar si hay tres en raya, tablas o sigue el juego
        if (tablero.hayTresEnRaya()) {
            resultado = TipoResultado.NENRAYA;
            ganador = jugadores[turno];
            return true;
        } else if (tablero.estaCompleto()) {      // Tablas
            resultado = TipoResultado.TABLAS;
            return true;
        } else
            return false;       // El juego continua...
    }

    private void mostrarResultado() {
        switch (resultado) {
            case NENRAYA:
                System.out.println("Ganador: " + ganador.toAnsi());
                break;
            case TABLAS:
                System.out.println("El juego termina en tablas");
                break;
            default:
                assert false : "Estado incorrecto al mostrar resultado";
        }
    }
}
