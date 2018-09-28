import java.util.Arrays;
import java.util.Scanner;

public class Partida {
    private static final int NUMBARCOSFLOTA = 10;
    private static final int MAXLONGITUDBARCO = 4;
    private static final int NUMFILAS = 8;
    private Jugador[] jugadores = new Jugador[2];
    private int turno = 0;

    public Partida() {
        crearJugadores();
        jugar();
    }
    private Flota crearFlota(){
        return new Flota(NUMBARCOSFLOTA,MAXLONGITUDBARCO);
    }
    private TableroPropio crearTableroPropio(){
        return new TableroPropio(NUMFILAS);
    }
    private TableroAjeno crearTableroAjeno(){
        return new TableroAjeno(NUMFILAS);
    }
    private void crearJugadores(){
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Introdizca el nombre del Jugador "+(i+1));
            Scanner sc = new Scanner(System.in);
            String alias = sc.nextLine();
            jugadores[i]=new Jugador(alias,crearTableroPropio(), crearTableroAjeno(), crearFlota());
        }
    }
    public void jugar(){

    }

    @Override
    public String toString() {
        return "Partida{" +
                "jugadores=" + Arrays.toString(jugadores) +
                ", turno=" + turno +
                '}';
    }
}
