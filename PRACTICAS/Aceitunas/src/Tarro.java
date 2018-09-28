import java.util.ArrayList;

public class Tarro {
   //public static ArrayList<Aceituna> aceitunas;

   //static {
   //    aceitunas = new ArrayList<Aceituna>();
   //    System.out.println("Añadiendo aceitunas al tarro (BLOQUE ESTATICO)");
   //    aceitunas.add(new Aceituna("CHUPADEDO"));
   //    aceitunas.add(new Aceituna("VERDIALES"));
   //    aceitunas.add(new Aceituna("GORDALES"));
   //}

    private ArrayList<Aceituna> aceitunas;

    {
        aceitunas = new ArrayList<>();
        System.out.println("Añadiendo aceituna de ORO (BLOQUE DE INSTANCIA)");
        aceitunas.add(new Aceituna("ORO"));
    }

    public Tarro(int n, String nombre) {
        for (int i = 1; i <= n ; i++) {
            aceitunas.add(new Aceituna(nombre));
        }
    }

    public ArrayList<Aceituna> getAceitunas() {
        return aceitunas;
    }
}
