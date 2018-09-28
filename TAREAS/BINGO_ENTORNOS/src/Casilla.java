public class Casilla {

    private int numero; //NOT NULL, 1-100
    boolean tachada=false;

    public Casilla(int numero) {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        assert numero>0 && numero<=100 : "Error: el numero debe estar comprendido entre 1 y 100";
        this.numero = numero;
    }

    public boolean isTachada() {
        return tachada;
    }

    public void setTachada(boolean tachada) {
        this.tachada = tachada;
    }
}
