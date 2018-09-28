import java.util.function.ToDoubleBiFunction;

public class Carton {
    private Casilla[][] casillas = new Casilla[5][3];
    private Jugador jugador;
    private int fila;
    private int columna;
    private Coordenada[] coordenadas;

    //TODO Ordenar carton


    public Carton() {
        setCasillas(generarCarton());
    }

    public Carton(Jugador jugador) {
        setCasillas(generarCarton());
        setJugador(jugador);
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Coordenada[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenada[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Casilla[][] generarCarton(){
        //Carton Carton=new Carton
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j].setNumero((int)(Math.random()*100));
            }
        }
        return casillas;
    }
}
