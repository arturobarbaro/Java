package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
    private Casilla[][] casillas=new Casilla[3][3];
    private int minfila;
    private int maxfila;
    private int mincolumna;
    private int maxcolumna;
    private int filas;
    private int columnas;

    public Tablero() {
        filas=3;
        columnas=3;
        minfila=0;
        maxfila=filas-1;
        mincolumna=0;
        maxcolumna=columnas-1;
        casillas=new Casilla[3][3];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    public Coordenada leerCordenada(){
        Scanner sc = new Scanner((System.in));
        boolean correcto=false;
        int fila;
        int columna;

        // Leer fila
        do {
            System.out.printf("Fila: (%d-%d)", minfila, maxfila);
            fila=sc.nextInt();
            if (!esFila(fila))
                System.out.printf("Error: fila no valida (%d)\n",fila);

        } while ((!correcto));

        // Leer coordenada
        do {
            System.out.printf("Fila: (%d-%d)", mincolumna, maxcolumna);
            columna=sc.nextInt();
            if (!esColumana(columna))
                System.out.printf("Error: columna no valida (%d)\n",columna);

        } while ((!correcto));
    }

    private boolean esFila(int fila){
        return (fila>=minfila && fila<=maxfila);
    }

    private boolean esColumana(int columna){
        return (columna>=mincolumna && columna<=maxcolumna);
    }

    public static boolean colocar(Ficha ficha, Coordenada c){
        boolean estaVacia=false;
        if (c==null){

        }

        return estaVacia;
    }

    public boolean esCoordenada(Coordenada c){
        boolean pertenece=false;
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j].equals(c)){
                    pertenece=true;
                }
            }

        }
        return  pertenece;
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "casillas=" + Arrays.toString(casillas) +
                '}';
    }

    public boolean esFinJuego(){
        boolean fin=false;

        return fin;
    }
}
