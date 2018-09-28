public class Partida {

    private Jugador[] jugadores; //>=1
    private Bombo bombo;

    public Partida(Jugador[] jugadores, Bombo bombo) {
        setJugadores(jugadores);
        setBombo(bombo);
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        assert jugadores!=null : "Error: no pueden existir jugadores nulos";
        assert jugadores.length>0 : "Error: debe existir almenos un jugador";
        this.jugadores = jugadores;
    }

    public Bombo getBombo() {
        return bombo;
    }

    public void setBombo(Bombo bombo) {
        assert bombo!=null : "Error: el bombo no puede ser nulo";
        this.bombo = bombo;
    }
}
