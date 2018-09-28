import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Tablero extends JPanel {
   // private Casilla[][] casillas;
    private ArrayList<Casilla> casilla;
    private static final int MINCASILLAS = 5;

    /**
     *
     * @param n
     *        Valor de la longitud de Tablero cuadrado.
     * @exception IllegalArgumentException
     *         Si n es menor a MINCASILLAS.
     */
    public Tablero(int n) {

        if (n < MINCASILLAS)
            throw new IllegalArgumentException(String.format("Error: el tablero debe tener una longitud minima de %s",MINCASILLAS));
        casilla=new ArrayList<>();
        inicializarCasillas(n);


    }

    /**
     *
     * @param c Casilla sobre la que recae la accion
     *
     * @throws NullPointerException
     *         Si la casilla es nula
     */
    private void receptor(Casilla c) {
        if (c==null)
            throw new NullPointerException("Error: la casilla es nula");
        MiRaton miRaton= new MiRaton();
        c.addMouseListener(miRaton);
    }

    /**
     * Metodo al que realiza un a llamada interna el constructor
     *
     * @param n Longitud de filas y columnas de Tablero
     */
    private void inicializarCasillas(int n) {
        setLayout(new GridLayout(n,n));


        for (int i = 0; i < n*n; i++) {
                casilla.add(new Casilla());
        }
        for (int i = 0; i < casilla.size(); i++) {
            add(casilla.get(i));
            receptor(casilla.get(i));
        }

    }


    /**
     * Clase interna recpetora
     */
    private class MiRaton extends MouseAdapter{
        /**
         *
         * @param e Evento de bajo nivel
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            Casilla c = (Casilla)e.getSource();
            super.mouseClicked(e);
            c.setClick(true);
        }
        /**
         *
         * @param e Evento de bajo nivel
         */
        @Override
        public void mouseEntered(MouseEvent e) {
            Casilla c = (Casilla)e.getSource();
            super.mouseEntered(e);
            c.setColorFondo(Color.WHITE);

        }

        /**
         *
         * @param e Evento de bajo nivel
         */
        @Override
        public void mouseExited(MouseEvent e) {
            Casilla c = (Casilla)e.getSource();
            super.mouseExited(e);
            c.setColorFondo(Color.CYAN);
        }

    }
}
