package com.company;

public class Robot {
    private Tablero tablero;

    public Robot(Tablero tablero) {
        setTablero(tablero);
    }

    public void setTablero(Tablero tablero) {
        assert tablero!=null : "Error: no se puede asignar al robot un tablero nulo";
        this.tablero = tablero;
    }
}
