/*
 * @author Arturo Barba
 * @version v0.1
 */

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        juego();

    }

    private static void juego() {
        int aleatorio=(int)(Math.random()*100+1);
        //contador
        int intentos =  jugar(aleatorio);
        mostrarResultado(intentos);
    }

    // @return Numero de intentos para adivinar el numero
    // @param Recibe como paramatro el numero comprendido entre 1 y 100
    private static int jugar(int aleatorio) throws NullPointerException{
        assert aleatorio>0 || aleatorio<=100: "Error: el numero a deducir debe estar comprendido entre 1 y 100";

        Scanner entrada = new Scanner(System.in);

        int numero=0;
        int intentos=0;

        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introdce un numero, por favor");
            numero = entrada.nextInt();

            if (aleatorio<numero){
                System.out.println("Introduce un numero mas bajo");
            } else if(aleatorio>numero){
                System.out.println("Introduce un numero mas alto");
            }
        }
        return intentos;
    }

    //  @param Recibe como parametro el contador intentos,
    // que almacena el numero de intentos para adivinar el numero
    private static void mostrarResultado(int intentos){
        System.out.println("Bingo. Lo has conseguido en "+intentos+" intentos");
    }
}
