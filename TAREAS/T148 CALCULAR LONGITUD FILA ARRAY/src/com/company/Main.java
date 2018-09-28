package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] a = {{1,2,3,4}
                   ,{1}
                   ,{2,0}
                   ,{1,2,2,2,2,2}
                   };
        System.out.println(longitudMaxFila(a));

        char[][] b={{'a','a'},{'q','q','e'}};
        System.out.println(longitudMaxFila(b));
    }

    public static int longitudMaxFila(int[][] a){
        assert a!=null : "Error: el array no puede ser nulo";
        assert a.length>0: "Error: el array no puede ser vacio";

        int longitudMax=a[0].length;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length>longitudMax){
                longitudMax=a[i].length;
            }
        }
        return longitudMax;
    }

    public static int longitudMaxFila(char[][] a){
        assert a!=null : "Error: el array no puede ser nulo";
        assert a.length>0: "Error: el array no puede ser vacio";

        int longitudMax=a[0].length;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length>longitudMax){
                longitudMax=a[i].length;
            }
        }
        return longitudMax;
    }
}
