public class Casilla {
    private Ficha ficha;

    public void colocar(Ficha ficha){
        ficha != null:"Error: ya hay una ficha";
        this.ficha=ficha;
    }
}
