import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //System.out.println("Inicio de main en Principal");
        //ArrayList<Aceituna> aceitunas1 = Tarro.aceitunas;
        //ArrayList<Aceituna> aceitunas2 = Tarro.aceitunas;
        //for (Aceituna a: aceitunas1) {
        //    System.out.println(a);
        //}
        ArrayList<Aceituna> aceitunas1 = new Tarro(3,"CHUPADEDO").getAceitunas();
        for (Aceituna a: aceitunas1) {
            System.out.println("a = " + a);
        }
    }
}
