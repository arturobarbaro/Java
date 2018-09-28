import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Prueba {

    /**
     * Descarga un fichero jpeg y lo guarda en e:/foto.jpg
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            // Url con la foto
            URL url = new URL(
                    "https://cdn.pixabay.com/photo/2014/06/01/21/05/photo-effect-359981_960_720.jpg");

            // establecemos conexion
            URLConnection urlCon = url.openConnection();

            // Sacamos por pantalla el tipo de fichero
            System.out.println(urlCon.getContentType());

            // Se obtiene el inputStream de la foto web y se abre el fichero
            // local.
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream("e:/foto.jpg");

            // Lectura de la foto de la web y escritura en fichero local
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }

            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
