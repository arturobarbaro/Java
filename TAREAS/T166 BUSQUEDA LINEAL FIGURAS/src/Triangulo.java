public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String color, int x, int y, double altura, double base) {
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
        return (base*altura)/2;
    }

    public void dibujar(){
        System.out.println(".        ");
        System.out.println(".  .     ");
        System.out.println(".    .   ");
        System.out.println(".      . ");
        System.out.println(". . . . .");

    }


    public void mover(int x,int y){
        setX(x);
        setY(y);
    }
}
