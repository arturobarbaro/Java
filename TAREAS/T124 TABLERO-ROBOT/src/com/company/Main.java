package com.company;

import javafx.scene.control.Tab;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tablero t=new Tablero(2);

        Robot robocop = new Robot(t);
        System.out.println(t.colocar(robocop));
        Robot terminator = new Robot(t);
        System.out.println(t.colocar(terminator));
        Robot termomix = new Robot(t);
        System.out.println(t.colocar(termomix));
    }
}
