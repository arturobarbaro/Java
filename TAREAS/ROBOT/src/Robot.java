import java.util.ArrayList;

public class Robot {
    private String alias;
    private static int numero=1;
    private Cabeza cabeza;
    private ArrayList<Extremidad> extremidades;

    public Robot(String alias, Cabeza cabeza) {
        this.alias = alias;
        numero=numero;
        setCabeza(cabeza);
        numero++;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Robot.numero = numero;
    }

    public Cabeza getCabeza() {
        return cabeza;
    }

    public void setCabeza(Cabeza cabeza) {
        this.cabeza = cabeza;
    }

    public ArrayList<Extremidad> getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(ArrayList<Extremidad> extremidades) {
        this.extremidades = extremidades;
    }

    public void mostrar(){
        System.out.println("   \uD83D\uDC7E   ");
    }

    public void alimentar(){
        System.out.println("Me voy a poner gordo...");
    }


    public void matar(){
        setCabeza(null);
        if (cabeza==null){
            System.out.println("Por que me matas cabron, soy inmortal");
            System.out.println("Por tu culpa he perdido los ojos");
        }
        Cabeza c=new Cabeza();
        setCabeza(c);

    }

    public void saludarAvidal(){
        System.out.println("Hola vidal");
        System.out.println("\uD83D\uDEF8");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "alias='" + alias + '\'' +
                ", cabeza=" + cabeza +
                ", extremidades=" + extremidades +
                '}';
    }
}
