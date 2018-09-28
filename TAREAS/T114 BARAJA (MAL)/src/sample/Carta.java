package sample;

public class Carta {
    int numero; //numero>=1
    String nombre;
    Palo palo;

    public Carta(int numero, Palo palo){
        assert numero >= 1 && numero <13: "Error: El numero debe estar comprendido entre 1 y 12.";
        assert palo!=null: "Error: El palo de la carta no puede ser nulo.";
        this.numero=numero;
        this.palo=palo;

    }
    public Carta(int numero, Palo palo, String nombre){
        assert numero >= 1 && numero <13: "Error: El numero debe estar comprendido entre 1 y 12.";
        assert palo!=null: "Error: El palo de la carta no puede ser nulo.";

    }

    public String toString() {
        return "Carta "+nombre+" numero "+numero+" del palo "+palo;
    }
}
