import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("Amarillo", 0,0,2));
        figuras.add(new Circulo("Amarillo", 0,0,1));
        figuras.add(new Cuadrado("Amarillo", 0,0,2));

        System.out.println(busquedaLineal(figuras, "Amarillo"));
        Cuadrado c=new Cuadrado("Verde",0,0,1);
        Rectangulo r1=new Rectangulo("Amarillo",0,0,1,2);
        Rectangulo r2=new Rectangulo("Amarillo",0,0,2,1);
        c.dibujar();
        System.out.println("Rectangulo 1");
        r1.dibujar();
        System.out.println("Rectangulo 2");
        r2.dibujar();
    }

    public static int busquedaLineal(ArrayList<Figura> f, String color){
        assert f!=null : "Error: el array no puede ser nulo";
        assert f.size()>0 : "Error: el array no puede ser vacio";
        assert color!=null : "Error: el color no puede ser nulo";
        assert color.length()>0 : "Error: el color no puede ser vacio";

        int pos=-1;
        for (int i = 0; i < f.size(); i++) {
            if (f.get(i).getColor()==color){
                pos=i;
            }
        }
        return pos;
    }
}
