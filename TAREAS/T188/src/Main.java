import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
    }

    // open file clients.txt
    public static void openFile() {
        try {
            input = new Scanner(Paths.get("Contabilidad"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        } finally {
            System.out.println("Hola, soy un bloque finally. Nadie sabe que hago aqui");
        }
    }

    // read record from file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");
        try {
            while (input.hasNext()) // while there is more to read
            {
                // display record contents
                System.out.printf("%-10s%-12s%-12s%10s%n", input.next(),
                        input.next(), input.next(), input.next());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        } catch (IllegalArgumentException ea){
            System.err.println("Error the arguments are not valid. Terminating");
        } catch (NullPointerException e ){
            System.err.println("Error Scanner has not been initialized. Terminating");
        }
        finally{
            closeFile();
        }
    }

// end method readRecords

    // close file and terminate application


    public static void closeFile() {
        if (input != null)
            input.close();
    }

} // end class ReadTextFile
