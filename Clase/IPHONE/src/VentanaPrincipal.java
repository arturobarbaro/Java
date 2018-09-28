import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_F;

public class VentanaPrincipal extends JFrame{
    private Inicio inicio;
    private Pantalla pantalla;

    public VentanaPrincipal(String title) {
        super(title);
        inicio= new Inicio();
        pantalla=new Pantalla();
        //botones.setLayout(new BorderLayout());
        //botones.add(new JButton("Llamadas"));
        //botones.add(new Boton("Comtactos"));
        JMenuBar jMenuBar = crearBarraMenus();
        add(jMenuBar, BorderLayout.NORTH);
        add(inicio, BorderLayout.PAGE_END);
        add(pantalla, BorderLayout.CENTER);

        setVisible(true);
        setSize(225,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        pack();

    }

    private JMenuBar crearBarraMenus(){
        JMenuBar barra = new JMenuBar();

        //Menus ventana
        JMenu menuFichero = new JMenu("Fichero");
        JMenu menuVentana = new JMenu("Ventana");
        JMenu menuMostrar = new JMenu("Mostrar");
        JCheckBoxMenuItem mostrarPersona2 = new JCheckBoxMenuItem("Mostrar persona (version 2)");
        mostrarPersona2.setSelected(true);

        // Receptor de evento mostrar persona2
        mostrarPersona2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem j = (JCheckBoxMenuItem) e.getSource();
                inicio.setVisible(j.isSelected());
            }
        });

        JMenuItem mostrarPersona = new JMenuItem("mostrar persona");
        JMenu menuAyuda = new JMenu("Ayuda");

        //Menu fichero
        JMenuItem exportar = new JMenuItem("Exportar");
        JMenuItem importar = new JMenuItem("Importar");
        JMenuItem salir = new JMenuItem("Salir...");
        menuFichero.add(exportar);
        menuFichero.add(importar);
        menuFichero.add(salir);

        //Asigna los tajos de teclado
        menuFichero.setMnemonic(VK_F);
        salir.setMnemonic(KeyEvent.VK_S);
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));


        menuFichero.add(menuMostrar);
        menuMostrar.add(mostrarPersona);
        menuMostrar.add(mostrarPersona2);

        //Acciones asociadas a opciones de menu

        //Fichero salir
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        barra.add(menuFichero);
        barra.add(menuVentana);
        barra.add(menuAyuda);
        return barra;

    }
}
