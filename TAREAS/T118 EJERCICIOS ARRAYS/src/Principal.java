import sample.Diccionario;
import sample.Palabra;

public class Principal {
    public static void main(String[] args) {
        //Palabra p1=new Palabra("hola", "hello");
        //p1.toString();
        //System.out.println(p1.getCastellano()+"-"+p1.getIngles());
        //System.out.println(p1.getCastellano());
        Diccionario diccionario=new Diccionario(10);
        Palabra p1=new Palabra("Hola","Hello");
        p1.toString();
        //Diccionario.agregar(diccionario,p1);
    }
}
