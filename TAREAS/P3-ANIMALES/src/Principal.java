import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Ornitorrinco o = new Ornitorrinco(1);
        o.anidar();

        ArrayList<Oviparo> oviparos = new ArrayList<>();
        oviparos.add(new Cigueña(12));
        oviparos.add(new Cigueña(11));
        oviparos.add(new Ornitorrinco(21));
        oviparos.add(new Rana(21));

        mostrarAnimales(oviparos);
    }

    static void mostrarAnimales(ArrayList<Oviparo> oviparos){
        for (Oviparo oviparo: oviparos) {
            System.out.println(oviparo);
        }
    }
}
