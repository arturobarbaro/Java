 class E7_2 {
    public static void main(String[] args){
        Rueda rueda1 = new Rueda(20);
        Rueda rueda2 = (Rueda) rueda1.clone();
        Rueda rueda3 = (Rueda) rueda1.clone();
        Rueda rueda4 = (Rueda) rueda1.clone();

        Coche c1 = new Coche(rueda1,rueda2,rueda3,rueda4);
    }

}

class Coche{
    private Rueda ruedas1;
    private Rueda ruedas2;
    private Rueda ruedas3;
    private Rueda ruedas4;

    public Coche(Rueda ruedas1, Rueda ruedas2, Rueda ruedas3, Rueda ruedas4){
        this.ruedas1=ruedas1;
        this.ruedas2=ruedas2;
        this.ruedas3=ruedas3;
        this.ruedas4=ruedas4;
    }
}

class Rueda {
    private int peso;

    public Rueda(int peso){
        setPeso(peso);
    }

    public void setPeso(int peso){
        assert peso>0 : "Error: el peso no puede ser nulo";
        this.peso=peso;
    }
    public Object clone()
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}