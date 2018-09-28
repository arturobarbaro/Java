import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Principal {


    public static void main(String[] args){

        try {
            A();
        } catch (MalformedURLException e) {
            System.out.println("la url no es valida!");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception a){
            a.getStackTrace();
        }

    }

    private static void A() throws Exception{
        String url = "http://services.hanselandpetal.com/feeds/flowers.xml"; //dirección url del recurso a descargar
        String name = "ejemplo"; //nombre del archivo destino

        //Directorio destino para las descargas
        String folder = "Desktop/";

        //Crea el directorio de destino en caso de que no exista
        //File dir = new File(folder);

        File file = new File(folder + name);
        URLConnection conn = new URL(url).openConnection();
        conn.connect();
        System.out.println("\nEmpezando descarga: \n");
        System.out.println(">> URL: " + url);
        System.out.println(">> Nombre: " + name);
        System.out.println(">> tamaño: " + conn.getContentLength() + " bytes");
    }
}
