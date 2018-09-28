/*
 * Partida de 3 en raya
 *
 * JUEGAN 2 JUGADORES POR TURNOS
 * El objetivo es colocar tres fichas alineadas
 *
 */

package com.company;

public class Partida {
    private Jugador[] jugadores;     //NOT NULL, NO VACIO, longitud=2
    private Tablero tablero;                        //NOT NULL
    private int turno;                            //0,1

    public Partida(String[] jugadores) {
        inicializarJugadores(jugadores);
        setTurno(0);
        tablero=new Tablero();
    }


    public void  inicializarJugadores(String[] nombres){
        assert jugadores!=null : "Error: jugadores no puede ser nulo";
        assert jugadores.length>2 : "Error: deben existir 2 jugadores";

        jugadores=new Jugador[2];

        TipoFicha[] tipos=TipoFicha.values();

        for (int i = 0; i < nombres.length; i++) {
            //jugadores[i] = new Jugador((nombres[i], )
        }
    }

    public void setJugadores(Jugador[] jugadores) {
        assert jugadores!=null : "Error: jugadores no puede ser nulo";
        assert jugadores.length>2 : "Error: deben existir 2 jugadores";

        this.jugadores = jugadores;
    }

    public void setTurno(int turno) {
        assert turno==1||0==turno : "Error: turno no valido, inesperado";
        this.turno = turno;
    }

    public void jugar(){
        System.out.println("Jugadores:");
        for (Jugador j: jugadores) {
            System.out.println(j);
        }

        System.out.println(tablero);
        System.out.println("Es el turno de "+jugadores[turno]);

        //Coordenada c=leerCoordenada();

    }

    private void cambiarTurno(){
        assert turno==0||turno==1 : "Error: turno no valido, inesperado";

        if (turno==0){
            turno=1;
        }
        if (turno==1){
            turno=0;
        }
    }
}
