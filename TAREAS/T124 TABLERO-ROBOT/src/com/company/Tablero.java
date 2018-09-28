package com.company;

public class Tablero {
    private Robot[] robots;
    int aforo;

    public Tablero(int aforo) {
        setAforo(aforo);
        robots=new Robot[aforo];
    }

    public boolean colocar (Robot robot){
        assert robots.length>=1: "Error: el aforo debe ser mator o igual de 1";
        assert robot==null: "Error: el robot no puede ser nulo";

        for (int i = 0; i < robots.length ; i++) {
            if (robots[i]==null){
                robots[i]=robot;
                return true;
            }
        }
        return false;
    }

    public void setAforo(int aforo) {
        assert aforo >=0 : "Error: no puede existir un aforo negativo";
        this.aforo = aforo;
    }
}
