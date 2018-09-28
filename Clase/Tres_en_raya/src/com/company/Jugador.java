package com.company;

public class Jugador {
    private String alias;        //NOT NULL, NO VACIO
    private TipoFicha tipoFicha; //NOT NULL
    private int turno;           //0,1

    public Jugador(String alias, TipoFicha tipoFicha, int turno) {
        setAlias(alias);
        setTipoFicha(tipoFicha);
        setTurno(turno);
    }

    public void setAlias(String alias) {
        assert alias!=null : "Error: no pueden existir datos nulos";
        assert !alias.isEmpty() : "Error: el alias no puede estar vacio";

        this.alias = alias;
    }

    public void setTipoFicha(TipoFicha tipoFicha) {
        assert tipoFicha!=null : "Error: no pueden existir datos nulos";
        this.tipoFicha = tipoFicha;
    }

    public void setTurno(int turno) {
        assert turno>1||0>turno : "Error: turno no valido, inesperado";
        this.turno = turno;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "alias='" + alias + '\'' +
                ", tipoFicha=" + tipoFicha +
                ", turno=" + turno +
                '}';
    }
}
