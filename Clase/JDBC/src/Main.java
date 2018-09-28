import  java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static String usuario;
    private static String clave;
    private static String BD = "amistad";
    private static String url = "jdbc:mysql://datos.iesdonana.org/amistad";

    public static void main(String[] args) throws SQLException{
	// write your code here
        //leerUsuarioYClave();
        Connection c = null;
        try {
            c = DriverManager.getConnection(url,usuario,clave);//Ctrl alt t
            System.out.println("Conectado al sgbd...");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           if (c==null)
            c.close();

        }
    }

    private static void leerUsuarioYClave() {
        Console consola = System.console();

        if (consola==null) {
            System.err.println("No existe consola asociada a este proceso.");
            System.exit(1);
        }

        //Leer usuario
        System.out.println("Usuario: ");
        usuario = consola.readLine();

        System.out.println("Clave: ");
        clave = consola.readLine();
    }
}
