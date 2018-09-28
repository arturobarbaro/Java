public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, int x, int y, double altura,double base) {
        super(color, x, y);
        setAltura(altura);
        setBase(base);
    }

    public void setAltura(double altura) {
        assert altura > 0 : "Error: el lado no puede ser nulo";
        this.altura = altura;
    }

    public void setBase(double base) {
        assert base > 0 : "Error: el lado no puede ser nulo";
        this.base = base;
    }

    public double area(){
        return base*altura;
    }

    public void dibujar(){
        if(base>altura){
            System.out.println(". . . . . .");
            System.out.println(".         .");
            System.out.println(". . . . . .");
        } else {
            System.out.println(". . . . .");
            System.out.println(".       .");
            System.out.println(".       .");
            System.out.println(".       .");
            System.out.println(". . . . .");
        }

    }

    public void mover(int x,int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}

