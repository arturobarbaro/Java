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

        String nombres[]=new String[n];

        if(args.length == n)
            for (int i = 0; i <args.length; i++) {
                nombres[i] = args[i];
            }

        // Los mostramos por pantalla
        Persona.mostrar(hijos);

    }
}
