import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraBotones extends JPanel {
    private JButton hola;
    private JButton adios;
    //PanelTexto panelTexto;              // Panel de texto donde se escribira al pulsar los botones
    private ReceptorTexto receptorTexto;  // Al pulsar el boton se enviara el texto a
                                          // un objeto de una clase subtipo de Recepor

    public BarraBotones() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        hola = new JButton("Hola");
        adios = new JButton("Adios");

        //Añadir receptores de eventos a los botones
        /* No usar clases anonimas, no se puede hacer con un solo receptor
         * no pueden ser reusadas para varios botones
         */
        MiReceptor miReceptor = new MiReceptor();
        hola.addActionListener(new MiReceptor());
        adios.addActionListener(new MiReceptor());

        //Defino comandos de accion para botones
        hola.setActionCommand("Comer");
        adios.setActionCommand("Dormir");

        //Añadir Botones
        add(hola);
        add(adios);


    }

   // public void setPanelTexto(PanelTexto panelTexto) {
     //   this.panelTexto = panelTexto;
    //}


    public void setReceptorTexto(ReceptorTexto receptorTexto) {
        this.receptorTexto = receptorTexto;
    }

    //Clase interna, para crear objetor receptores
    private class MiReceptor implements ActionListener{

        /*
         * @param e Evento
         * @throws IllegalStateException
         *           En el caso de no haber asignado un panel de texto
         *           donde se escribira un mensaje al pulsar el boton.
         * @throws RunTimeException
         *           Si no se cumplen los casos de  cvase
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (receptorTexto==null){
                throw new IllegalStateException("No esta asignado el panel de texto donde se escribira el texto al opulsar el boton");

            }
            JButton b = (JButton) e.getSource();
            //receptorTexto.emitirTexto(b.getText()+"\n");
            //receptorTexto.emitirTexto(b.getActionCommand()+"\n");
            String texto;
            String comando = b.getActionCommand();
            switch (b.getActionCommand()){
                case "Dormir":
                    texto = "Hay que dormir despues de beber";
                    break;
                case "Comer":
                    texto = "Hay que comer menos, gordo";
                    break;
                default:
                    throw new RuntimeException("Comando de accion desconocido"+comando);
            }
            receptorTexto.emitirTexto(texto+"\n");
        }
    }
}
