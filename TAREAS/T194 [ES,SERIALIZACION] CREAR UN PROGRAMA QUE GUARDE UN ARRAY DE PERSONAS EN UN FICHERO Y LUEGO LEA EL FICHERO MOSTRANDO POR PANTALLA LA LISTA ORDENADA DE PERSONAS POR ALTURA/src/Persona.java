import java.util.Objects;

public class Persona {
    private String alias;
    private int altura;

    public Persona(String alias, int altura) {
        this.alias = alias;
        this.altura = altura;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        try {
            this.alias = alias;
        } catch (NullPointerException n){
            n.getCause();
        } catch (IllegalArgumentException ia){
            ia.getCause();
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
            this.altura=altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return altura == persona.altura &&
                Objects.equals(alias, persona.alias);
    }

}
