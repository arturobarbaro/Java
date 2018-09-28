package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] caracteres = {'a','b','c'};
        String ejemplo = cadenas(caracteres);
        System.out.println(ejemplo);
    }

    public static String cadenas(char[] chars){
        return new String(chars);


    }
}
