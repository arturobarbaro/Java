import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main fichero = new Main();
        fichero.lee();
    }

    private void lee(){
        try {
            FileReader f = new FileReader("C:/Users/artur/Documents/a");
            int c = f.read();
            while (c!=-1){
                c=f.read();
                char letra=(char)c;
                System.out.print(letra);
            }
        } catch (FileNotFoundException e){
            e.getCause();
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException a){
            a.getCause();
        }
    }
}
