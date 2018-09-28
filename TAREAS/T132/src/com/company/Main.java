package com.company;

public class Main {

    // CREAR Y USAR UN METODO QUE RECIBA UN NUMERO DE PARAMETROS VARIABLE
    public static void main(String[] args) {
	// write your code here
        print(1.0, 2.0, 3.0, 4.0, 5.0);
    }

    static void print (Double... doubles) {
        assert doubles!=null : "Error: los parametros no pueden ser nulos";
        assert doubles.length>0 : "Error: los parametros no pueden ser vacios";

        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }
}
