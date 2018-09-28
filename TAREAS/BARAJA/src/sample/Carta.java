package sample;

public class Carta {

    int numero=1; //numero>=1
    String nombre=" ";
    Palo palo= Palo.BASTOS;

    public Carta(int numero, Palo palo){
        assert numero >= 1 && numero <13: "Error: El numero debe estar comprendido entre 1 y 12.";
        assert palo!=null: "Error: El palo de la carta no puede ser nulo.";


    }

    public Carta(int numero, Palo palo, String nombre){
        assert numero >= 1 && numero <13: "Error: El numero debe estar comprendido entre 1 y 12.";
        assert palo!=null: "Error: El palo de la carta no puede ser nulo.";
        this.numero=numero;
        this.palo=palo;
        this.nombre=nombre;
    }
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", palo=" + palo +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

}
