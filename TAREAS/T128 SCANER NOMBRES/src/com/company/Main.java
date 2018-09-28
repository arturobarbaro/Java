package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su numero de hijos: ");
        int n = sc.nextInt();

        //Comprobación n
        assert n>=0: "Introduzca un numero real("+n+")";

        Persona hijos[]=new Persona[n];
        System.out.print("Introduzca sus nombres: ");
        String nombres[]=new String[n];

        // Recopilamos los nombres
        for (int i = 0; i < nombres.length ; i++) {
            nombres[0]=sc.nextLine();
        }

        // Asignamos los nombres
        for (int i = 0; i < hijos.length; i++) {
            hijos[i]=new Persona(nombres[i]);
        }

        // Los mostramos por pantalla
        Persona.mostrar(hijos);

    }
}
