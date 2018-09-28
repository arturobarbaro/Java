import javax.swing.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class Tablero extends JFrame{
    private static final int FILAS = 5;
    private static final int COLUMNAS = 4;
    private Vector<String> numero;
    private LinkedList<Carta> cartas;
    private Random aleatorio;
    private int ramdon, fichas, cambio, tipo1, tipo2, identi1, identi2, contador;

    public Tablero(){
        int fichas = FILAS*COLUMNAS;

        numero = new Vector<String>();
        aleatorio = new Random();
        prepararRamdon();
    }
    // LLena el vector "numero" con parejas del 1 a 15
    public void prepararRamdon(){
        for(int i=0;i<(FILAS*COLUMNAS/2);i++){
            numero.addElement (String.valueOf(i+1));
            numero.addElement (String.valueOf(i+1));
        }
    }
}
