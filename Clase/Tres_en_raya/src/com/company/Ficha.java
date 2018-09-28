package com.company;

public class Ficha {
    private TipoFicha tipo; //NOT NULL

    public Ficha(TipoFicha tipo) { // X o O
        setTipo(tipo);
    }

    public void setTipo(TipoFicha tipo) {
        assert tipo!=null : "Error: el tipo no puede ser nulo";
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "tipo=" + tipo +
                '}';
    }
}
