package com.company;

public class Clase {
    public static void main(String[] args) {
        System.out.println(factorial(10));

    }

    private static int factorial(int n){
        if (n==0||n==1)
                return 1;
        return n*factorial(n-1);
    }
}
