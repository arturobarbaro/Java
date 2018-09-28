public class Fabrica {
    public static void main(String[] args) {

        Ojo o1 = new Ojo(Color.VERDE);
        Ojo o2 = new Ojo(Color.AMARILLO);
        Ojo[] Ojorobocot={o1,o2};
        Cabeza c1 = new Cabeza(Ojorobocot);
        Robot robocot = new Robot("Robocot",c1);
        System.out.println(robocot.toString());
        robocot.saludarAvidal();
    }
}
