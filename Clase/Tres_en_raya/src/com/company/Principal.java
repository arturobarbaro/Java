package com.company;

public class Principal {

    public static void main(String[] args) {
	    comprobarParametros(args);
	    Jugador[] jugadores=new Jugador[](args[0]), new Jugador(args[1]);
        new Partida(jugadores.jugar());
    }

    private static void comprobarParametros(String[] args){
        if (args==null || args.length !=2){
            uso();
            System.exit(1);
        }
    }

    private static void uso(){
        System.out.println("Uso: Principal jugador1 jugador2");
    }
}
