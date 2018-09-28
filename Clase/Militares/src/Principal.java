import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Militar> tropa = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
             TipoRango[] rangos = TipoRango.values();
             tropa.add(new Militar(rangos[(i-1)%rangos.length]));
        }

        // equals
        // Militar m1 = new Militar(TipoRango.SOLDADO);
        // Militar m2 = new Militar(TipoRango.SOLDADO);
        // Militar m3 = new Militar(TipoRango.ALFEREZ);
        // // System.out.println(m1.equals("HOLA"));       --> ERROR EN TIEMPO DE EJECUCION
        // System.out.println(m1==m2);
        // System.out.println(m1.equals(m2));
        // System.out.println(m1.equals(m3));

        // Ordenación de militares por rango (descendente)

        /*Collections.sort(tropa);
        Iterator<Militar> it = tropa.iterator();
        while (it.hasNext())
            System.out.println(it.next()); */

        // Ordenacion de militares por teléfono (ascendente)
        Collections.sort(tropa, new Comparator<Militar>() {
            @Override
            public int compare(Militar o1, Militar o2) {
                return o1.getTelefono().compareTo(o2.getTelefono());
            }
        });
        Iterator<Militar> it = tropa.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}
