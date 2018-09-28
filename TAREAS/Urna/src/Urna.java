public class Urna
{
    private Bola bola1;     // <<R>>
    private Bola bola2;     // <<R>>
    private Bola bola3;     // <<R>>

    public static final int CAPACIDAD = 3;

    public Urna() {}

    public void agregar(Bola b) {
        assert b!=null : "Error: la bola a agregar a la urna no puede ser nula";
        assert !estaLlena() : "Error: la urna está llena. No es posible agregar más bolas";
        assert !b.estaColocada() : "Error: no es posible agregar la bola"+b+" a la urna porque ya está colocada en alguna urna";
        // assert !estaColocada(b) : "Error: la bola "+b+" no se puede agregar a la urna porque ya está colocada en está urna";

        if (bola1==null)
            bola1=b;
        else if (bola2==null)
            bola2=b;
        else if (bola3==null)
            bola3=b;
        else {
            System.err.println("Error: la urna está llena. No es posible agregar más bolas. Inesperado");
            System.exit(1);
        }

        b.setColocada(true);
    }

    /* private boolean estaColocada(Bola b) {
        return b==bola1 || b==bola2 || b==bola3;
    } */

    public Bola extraer() {
        assert !estaVacia() : "Error: la urna está vacía. No es posible extraer bolas";

        Bola aux = null;
        int n = 0;

        do {
            n = (int)(Math.random()*getCapacidad())+1;      // [1-3]

            if (n==1 && bola1!=null) {
                aux = bola1;
                bola1=null;
                break;
            } else if (n==2 && bola2!=null) {
                aux = bola2;
                bola2=null;
                break;
            } else if (n==3 && bola3!=null) {
                aux = bola3;
                bola3=null;
                break;
            }
        } while (true);

        aux.setColocada(false);
        return aux;
    }

    public int getCapacidad() {
        return CAPACIDAD;
    }

    public boolean estaVacia() {
        return bola1==null && bola2==null && bola3==null;
    }

    public boolean estaLlena() {
        return bola1!=null && bola2!=null && bola3!=null;
    }

    public int numBolas() {
        // return (bola1!=null ? 1:0) + ( bola2!=null ? 1:0) + (bola3!=null ? 1:0);
        int suma = 0;

        if (bola1!=null)    suma++;
        if (bola2!=null)    suma++;
        if (bola3!=null)    suma++;

        return suma;
    }

    public String toString() {
        return String.format("Urna (capacidad=%d). Contenido: %s %s %s", getCapacidad(), bola1, bola2, bola3);
    }
}







