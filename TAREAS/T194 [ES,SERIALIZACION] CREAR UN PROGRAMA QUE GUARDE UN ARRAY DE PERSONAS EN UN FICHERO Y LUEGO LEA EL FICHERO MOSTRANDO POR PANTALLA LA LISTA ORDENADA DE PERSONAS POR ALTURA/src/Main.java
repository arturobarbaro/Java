import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static Formatter output;

    public static void main(String[] args) {
	// write your code here
        Persona[] p = {new Persona("Homer",172),new Persona("Milhouse",153)};
        openFile("a");
        addRecords(p);
        closeFile();
    }

    // open file clients.txt
    public static void openFile(String nombre) {
        try {
            output = new Formatter(nombre);
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    // add records to file
    public static void addRecords(Persona[] p) {
        //Scanner input = new Scanner(System.in);
       // System.out.printf("%s%n%s%n? ",
             //   "Enter account number, first name, last name and balance.",
        //  "Enter end-of-file indicator to end input.");
        // loop until end-of-file indicator


        try {
            int i = 2;
            while (i > 0) {


                i--;
                // output new record to file; assumes valid input
                output.format(p.toString());
                System.out.print("? ");
            }
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");
            System.exit(1);
        } catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");// discard input so user can try again
        } catch (NullPointerException n){
            System.err.println("...");
        } finally {
            closeFile();
        }


    } // end while
    // end method addRecords


    // close file
    public static void closeFile() {
        if (output != null) ;
        output.close();
    }
}
