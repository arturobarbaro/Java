import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    private static final String FLOWERS_FEED =
            "http://services.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) {
	// write your code here
        try {
            FileReader f = new FileReader("C:/Users/artur/Documents/a");
        } catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero");
        }
    }

}
