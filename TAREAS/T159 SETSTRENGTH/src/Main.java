import java.text.Collator;

public class Main {

    public static void main(String[] args) {
        // Se obtiene un Collator adecuado para nuestro idioma.
        Collator comparador = Collator.getInstance();


        System.out.println("PRIMER NIVEL DE FUERZA");
        comparador.setStrength(Collator.PRIMARY);

        // NO DISTINGUE ENTRE TILDES , TIPOS DE VOCALES Y/O MAYUSCULAS Y MINUSCULAS
        System.out.println(comparador.compare("cana", "caña")); //
        System.out.println(comparador.compare("facil", "fácil"));
        System.out.println(comparador.compare("facil", "facil"));
        System.out.println(comparador.compare("Cana", "Caña"));
        System.out.println(comparador.compare("pingüino", "pinguino"));
        System.out.println(comparador.compare("FACIL", "fÁCIL"));
        System.out.println(comparador.compare("facil", "fácil"));


        // DISTINGUE ENTRRE TILDES Y TIPOS DE VOCALES
        // NO DISTINGUE ENTRE MAYUCULAS Y MINUSCULAS
        System.out.println("SEGUNDO NIVEL DE FUERZA");
        comparador.setStrength(Collator.SECONDARY);
        System.out.println(comparador.compare("cana", "caña")); //
        System.out.println(comparador.compare("facil", "fácil"));
        System.out.println(comparador.compare("Facil", "facil"));
        System.out.println(comparador.compare("Cana", "Caña"));
        System.out.println(comparador.compare("pingüino", "pinguino"));
        System.out.println(comparador.compare("FACIL", "fÁCIL"));
        System.out.println(comparador.compare("facil", "fácil"));

        // DISTINGUE ENTRE TILDES , TIPOS DE VOCALES Y/O MAYUSCULAS Y MINUSCULAS
        System.out.println("TERCER NIVEL DE FUERZA");
        comparador.setStrength(Collator.TERTIARY);
        System.out.println(comparador.compare("cana", "caña")); //
        System.out.println(comparador.compare("facil", "fácil"));
        System.out.println(comparador.compare("facil", "Facil"));
        System.out.println(comparador.compare("Cana", "Caña"));
        System.out.println(comparador.compare("pingüino", "pinguino"));
        System.out.println(comparador.compare("FACIL", "fÁCIL"));
        System.out.println(comparador.compare("facil", "fácil"));
    }
}
