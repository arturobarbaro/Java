package sample;

public class Palabra {
    private String castellano;
    private String ingles;

    @Override
    public String toString() {
        return castellano +"-" + ingles;
    }

    public Palabra(String castellano, String ingles) {
        this.castellano = castellano;
        this.ingles = ingles;
    }

    public String getCastellano() {
        return castellano;
    }

    public String getIngles() {
        return ingles;
    }

}
