public class Cuadrado extends Figura {
    private  double lado;

    public Cuadrado(String color, int x, int y, double lado) {
        super(color, x, y);
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        assert lado > 0 : "Error: el lado no puede ser nulo";
        this.lado = lado;
    }

    public double area(){
        return lado*lado;
    }

    public void dibujar(){
        System.out.println(". . . . .");
        System.out.println(".       .");
        System.out.println(".       .");
        System.out.println(". . . . .");

    }

    public void mover(int x,int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
