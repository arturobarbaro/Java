package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a="23488324";

        System.out.print(a);
        System.out.print(calculaLetra(a));
    }

    static char calculaLetra(String dni)
    {
        assert dni!=null: "Error: el nunero de DNI no puede ser nulo";
        assert dni.length() == 8 : "Error: el numero de dni debe contener 8 digitos";

        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE"; //De 0 a 22
        int numero=Integer.parseInt(dni);
        int modulo= numero % 23;
        char letra = juegoCaracteres.charAt(modulo);
        return letra;
    }
}
