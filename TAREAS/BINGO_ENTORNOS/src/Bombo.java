public class Bombo {
    Bola[] bolas;

    public Bombo(Bola[] bolas) {
        setBolas(bolas);
    }

    public Bombo() {

    }

    public Bola[] getBolas() {
        return bolas;
    }

    public void setBolas(Bola[] bolas) {
        this.bolas = bolas;
    }

    public String agregarBolas(Bola[] b) {
        assert b.length > bolas.length : "Error: no podemos añadir mas bolas, el bombo solo puede contener 100";

        for (int i = 0, j = 0; i < bolas.length; i++) {
            if (bolas[i] == null) {
                bolas[i] = b[j];
                j++;
            } else {
                return "No se han añadido correctamente, no disponemos del espacio suficiente";
            }

        }
        return "Correcto";
    }

    public String agregarBola(Bola b) {
        assert b != null : "Error: no podemos añadir uns bola nula";

        for (int i = 0; i < bolas.length; i++) {
            if (bolas[i] == null) {
                bolas[i] = b;
            } else {
                return "No se ha añadido correctamente, no disponemos del espacio suficiente";
            }

        }
        return "Correcto";
    }

    public Bola[] extraerBolas(int n) {
        assert n > 0 : "Error: no podemos extraer un numero de bolas negativo";
        assert n <= 100 : "Error: no podemos extraer un numero de bolas mayor de 100";

        Bola[] extraidas = new Bola[n];
        for (int i = 0, j = 0; i < n; i++) {
            if (bolas[i] != null) {
                bolas[i] = extraidas[j];
                bolas[i] = null;
                j++;
            }
        }
        return extraidas;
    }
}