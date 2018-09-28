import java.util.Arrays;

public abstract class Figura {
    private String color;
    private int X;
    private int Y;

    public Figura(String color, int x, int y) {
        setColor(color);
        setX(x);
        setY(y);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        assert color!=null : "Error: el color no puede ser nulo";
        assert color.length()>0 : "Error: el color no puede ser vacio";
        this.color = color;
    }

    public int getX() {
        return X;
    }


    public void setX(int x) {
        assert x>0;
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        assert y>0;
        Y = y;
    }

   abstract double area();

   abstract void dibujar();

    /*
    public int[][] getCentro() {
        return centro;
    } */

    /*
    public void setCentro(int[][] centro) {
        assert centro!= null || centro[0]!=null : "Error: el centro no puede ser nulo";
        assert centro.length>0 || centro[0].length>0 : "Error: las coordenadas del centro no pueden ser vacias";
        this.centro = centro;
    }*/

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                '}';
    }
}
