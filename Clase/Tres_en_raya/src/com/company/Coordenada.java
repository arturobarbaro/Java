package com.company;

public class Coordenada {
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        assert fila>=0||columna>=0: "Error: las filas y/o columnas no pueden ser negativas";
        assert fila>=0||columna>=0: "Error: las filas y/o columnas deben estar en el tablero";
        this.fila = fila;
        this.columna = columna;
    }
}
