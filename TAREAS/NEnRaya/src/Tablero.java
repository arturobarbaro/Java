import java.util.Scanner;
import org.fusesource.jansi.Ansi;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Tablero {
    private Casilla[][] casillas;

    // Dimensiones del tablero
    private int filas;
    private int columnas;

    // Limites de las coordenadas
    private int minFila;
    private int maxFila;
    private int minColumna;
    private int maxColumna;

    // Número de casillas ocupadas con una ficha en el tablero
    private int ocupadas;

    public Tablero(int n) {
        filas = n;
        columnas = n;

        minFila = 0;
        maxFila = filas-1;
        minColumna = 0;
        maxColumna = columnas-1;

        ocupadas = 0;

        casillas = new Casilla[filas][columnas];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    public Coordenada leerCoordenada() {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int fila;
        int columna;

        // Leer fila
        do {
            System.out.printf("Fila (%d-%d):", minFila, maxFila);
            fila = sc.nextInt();
            correcto=esFila(fila);
            if (!correcto)
                System.out.printf("Error: fila incorrecta (%d)\n",fila);
        } while (!correcto);

        // Leer columna
        do {
            System.out.printf("Columna (%d-%d):", minColumna, maxColumna);
            columna = sc.nextInt();
            correcto=esColumna(columna);
            if (!correcto)
                System.out.printf("Error: columna incorrecta (%d)\n",columna);
        } while (!correcto);


        return new Coordenada(fila,columna);
    }

    private boolean esFila(int fila) {
        return (fila>=minFila && fila<=maxFila);
    }

    private boolean esColumna(int columna) {
        return (columna>=minColumna && columna<=maxColumna);
    }

    private boolean esCoordenada(Coordenada c) {
        int fila = c.getFila();
        int columna = c.getColumna();

        return  (fila>=minFila && fila<=maxFila) &&
                (columna>=minColumna && columna<=maxColumna);

    }

    public boolean colocar(Ficha ficha, Coordenada c) {
        //// TODO: 14/02/2018 assert

        if (!esCoordenada(c))
            return false;

        int fila = c.getFila();
        int columna = c.getColumna();
        Casilla casilla = casillas[fila][columna];
        if (!casilla.estaVacia())
            return false;

        // Coloco la ficha en el tablero
        casillas[fila][columna].colocar(ficha);
        ocupadas++;

        return true;
    }

    public boolean hayTresEnRaya() {
        return (hayRayaHorizontal() || hayRayaVertical() || hayRayaDiagonal());
    }

    private boolean hayRayaHorizontal() {
        for (int i = 0; i < casillas.length; i++) {
            if (linea(casillas[i]))
                return true;
        }

        return false;
    }

    private boolean hayRayaVertical() {

        // Recorremos el tablero por columnas
        for (int j = 0; j < casillas[0].length; j++) {
            Casilla[] columna = new Casilla[casillas.length];
            for (int i = 0; i < casillas.length; i++) {
                columna[i] = casillas[i][j];
            }
            if (linea(columna))
                return true;
        }

        return false;
    }

    private boolean hayRayaDiagonal() {
        // Diagonal principal (i==j)
        Casilla[] diagonalPri = new Casilla[casillas.length];
        for (int i = 0; i < casillas.length; i++) {
             diagonalPri[i] = casillas[i][i];
        }
        if (linea(diagonalPri))
            return true;

        // Diagonal secundaria
        Casilla[] diagonalSec = new Casilla[casillas.length];
        for (int i = 0; i < casillas.length; i++) {
            diagonalSec[i] = casillas[i][casillas.length-1-i];
        }

        return linea(diagonalSec);
    }

    /**
     * Comprueba si todas las casillas recibidas tienen la misma ficha
     * @param casillas
     * @return true si todas las casillas tienen las misma ficha y no están vacias (e.o.c. false)
     */
    private boolean linea(Casilla[] casillas) {
        assert casillas != null : "Error: casillas no puede ser nulo";
        assert casillas.length >= 1 : String.format("Error: casillas debe tener longitud >= 1 (longitud %d)\n", casillas.length);

        Casilla aux = casillas[0];
        if (aux.estaVacia()) return false;      // No puede haber 3 fichas iguales si la primera casilla está vacia

        for (int i = 1; i < casillas.length; i++)
            if (!aux.equals(casillas[i]))
                return false;

        return true;
    }

    public boolean estaCompleto() {
        return ocupadas==filas*columnas;
    }

    @Deprecated
    @Override
    public String toString() {
        return "Usa toAnsi para que se muestre el texto en color";

        /* StringBuilder t = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                t.append(casillas[i][j]);
            }
            t.append("\n");
        }

        return t.toString(); */
    }

    /**
     * Dibuja el tablero del juego usando colores mediante la libreria Jansi
     *
     * @return  El tablero con formato Jansi
     */
    public Ansi toAnsi() {
        Ansi tableroAnsi = new Ansi();

        int alturaCasilla = casillas[0][0].toGranAnsi().longitud();
        GranAnsi g = new GranAnsi(alturaCasilla*filas);

        for (int i = 0; i < filas; i++) {
            for (int k = 0; k < alturaCasilla; k++) {
                Ansi filaAnsi = new Ansi();
                for (int j = 0; j < columnas; j++)
                     filaAnsi = filaAnsi.a(casillas[i][j].toGranAnsi().linea(k));
                g.a(filaAnsi);
            }
        }

        return g.toAnsi();
    }
}
