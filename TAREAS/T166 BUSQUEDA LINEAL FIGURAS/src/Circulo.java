public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, int x, int y, double radio) {
        super(color, x, y);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        assert radio>0 : "Error: el radio debe ser mayor de 0";
        this.radio = radio;
    }

    public void mover(int x,int y){
        setX(x);
        setY(y);
    }

    public double area(){
        return 2*Math.PI*Math.pow(radio,2);
    }

    public void dibujar(){
        System.out.println("    ..     ");
        System.out.println("  .     .  ");
        System.out.println(" .       . ");
        System.out.println("  .     .  ");
        System.out.println("    ..     ");
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
