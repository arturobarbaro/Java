public class Ornitorrinco extends Mamifero
implements Oviparo, Venenoso{
    public void ponerHuevos(){
        System.out.println("Hay q echarle huevos");
    }

    @Override
    public void envenenar() {
        System.out.println("No te piques");
    }
}
