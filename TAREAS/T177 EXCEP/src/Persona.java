import java.util.Scanner;

public class Persona {
    private String alias;
    private int peso;
    public static final int MAXPESO = 150;

    public static void main(String[] args) {

    }

    public Persona() {
        Scanner sc = new Scanner(System.in);
        alias = sc.nextLine();
        setAlias(alias);
        peso = sc.nextInt();
        setPeso(peso);
    }

    public void setAlias(String alias) {
        if (alias==null)
            throw new NullPointerException("El alias de una persona no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("El alias de una persona no puede estar vacío");
                this.alias = alias;
    }


    public void setPeso(int peso) throws IllegalArgumentException{
        if (peso<0 || peso>MAXPESO)
            throw new IllegalArgumentException(String.format("El peso no puede ser negativo ni mayor de %d (peso=%d)", MAXPESO, peso));

        this.peso = peso;
    }

    public String getAlias() {
        return alias;
    }

    public int getPeso() {
        return peso;
    }
}

