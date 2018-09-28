public class Anexos {

    public static void main(String[] args) {
        int s=9;
        System.out.printf("Hola %s me llamo %d \n", "Array", s);
        // Este es el metodo que hemos visto que recibes parametros

        System.out.println(media(1,2,3,4));
    }

    private static double media(int ... numeros){
        int suma=0;
        for (int e:numeros){
            suma +=e;
        }
        return suma/numeros.length;
    }
}
