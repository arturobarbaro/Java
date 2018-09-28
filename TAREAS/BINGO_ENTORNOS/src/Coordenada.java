public class Coordenada {
    int fila;
    int columna;

    public Coordenada(int fila, int columna) {
        setColumna(columna);
        setFila(fila);
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
}
