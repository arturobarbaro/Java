import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JLabel nombreLabel;
    private JLabel ocupadoLabel;
    private JTextField nombreField;
    private JTextField ocupadoField;
    private JButton botonok;
    private FormListener formListener;
    private JList edadLista;
    private JComboBox empCombo;
    private JCheckBox nacionalidad;
    private JTextField salario;
    private JLabel DNI;

    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private ButtonGroup genderGroup;


    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        nombreLabel = new JLabel("Nombre: ");
        ocupadoLabel = new JLabel("Puesto: ");
        nombreField = new JTextField(10);
        ocupadoField = new JTextField(10);
        edadLista = new JList();
        empCombo = new JComboBox();
        nacionalidad = new JCheckBox();
        salario = new JTextField(10);
        DNI = new JLabel("Dni  :");

        maleRadio = new JRadioButton("male");
        femaleRadio = new JRadioButton("female");

        maleRadio.setActionCommand("male");
        maleRadio.setActionCommand("female");
        genderGroup = new ButtonGroup();

        maleRadio.setSelected(true);


        //Set un gender radios


        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);


        //Impuestos

        DNI.setEnabled(false);
        salario.setEnabled(false);

        nacionalidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean Billete = nacionalidad.isSelected();
                DNI.setEnabled(Billete);
                salario.setEnabled(Billete);

            }
        });


        //Lista


        DefaultListModel edadModel = new DefaultListModel();
        edadModel.addElement(new CategoriaEdad(0, "Menor de 18"));
        edadModel.addElement(new CategoriaEdad(1, "18 hasta 65"));
        edadModel.addElement(new CategoriaEdad(2, "Mayor de 65"));
        edadLista.setModel(edadModel);

        edadLista.setPreferredSize(new Dimension(110, 70));
        edadLista.setBorder(BorderFactory.createEtchedBorder());
        edadLista.setSelectedIndex(1);

        DefaultComboBoxModel empModel = new DefaultComboBoxModel();
        empModel.addElement("Empleados");
        empModel.addElement("Nuevo Empleados");
        empModel.addElement("Desempleados");
        empCombo.setModel(empModel);
        empCombo.setSelectedIndex(0);
        empCombo.setEditable(true);


        botonok = new JButton("OK");

        botonok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String puesto = ocupadoField.getText();
                CategoriaEdad edad = (CategoriaEdad) edadLista.getSelectedValue();
                String empCat = (String) empModel.getSelectedItem();
                String dni = DNI.getText();
                String gender = genderGroup.getSelection().getActionCommand();



                FormEvent ev = new FormEvent(this, nombre, puesto, edad.getId(), empCat, nacionalidad, dni , gender);

                if (formListener != null) {
                    formListener.formEventOccurred(ev);
                }

                layoutComponets();
            }
        });


        Border innerBorder = BorderFactory.createTitledBorder("Agregar Personas");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        layoutComponets();
    }

    public void layoutComponets() {
        {
            setLayout(new GridBagLayout());

            GridBagConstraints gridBagConstraints = new GridBagConstraints();


//Primera Fila//

            gridBagConstraints.gridy = 0;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.1;

            gridBagConstraints.gridx = 0;


            gridBagConstraints.fill = GridBagConstraints.NONE;
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            add(nombreLabel, gridBagConstraints);

            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            gridBagConstraints.anchor = GridBagConstraints.LINE_START;
            add(nombreField, gridBagConstraints);

            //Segunda Fila//

            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.1;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = GridBagConstraints.LINE_END;
            add(ocupadoLabel, gridBagConstraints);

            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            gridBagConstraints.anchor = GridBagConstraints.LINE_START;
            add(ocupadoField, gridBagConstraints);


            //Tercera Fila//

            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.2;

            gridBagConstraints.gridx = 0;
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            add(new JLabel("Edad: "), gridBagConstraints);


            gridBagConstraints.gridx = 1;
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            add(edadLista, gridBagConstraints);


//// Empleados Linea
            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.2;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            add(new JLabel("Empleados"), gridBagConstraints);


            gridBagConstraints.gridx = 1;
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            add(empCombo, gridBagConstraints);


            //Segunda Fila//

            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.1;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = GridBagConstraints.LINE_END;
            add(ocupadoLabel, gridBagConstraints);

            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            gridBagConstraints.anchor = GridBagConstraints.LINE_START;
            add(ocupadoField, gridBagConstraints);


            //// Nacionalidad
            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.2;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            add(new JLabel("Español:"), gridBagConstraints);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.anchor = gridBagConstraints.FIRST_LINE_START;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            add(nacionalidad, gridBagConstraints);


            //// Nueva Linea
            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.2;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            add(salario, gridBagConstraints);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.anchor = gridBagConstraints.FIRST_LINE_START;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            add(DNI, gridBagConstraints);


            //Segunda Fila//

            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.05;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            add(new JLabel("Gender"), gridBagConstraints);

            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
            add(maleRadio, gridBagConstraints);


//Segunda Fila//

            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.2;


            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            add(new JLabel("Gender"), gridBagConstraints);

            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_END;
            add(femaleRadio, gridBagConstraints);


            //Boton Ok Fila//

            gridBagConstraints.gridy++;

            gridBagConstraints.weightx = 1;
            gridBagConstraints.weighty = 0.2;


            gridBagConstraints.gridx = 1;
            gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
            gridBagConstraints.insets = new Insets(0, 0, 0, 0);
            add(botonok, gridBagConstraints);


        }


    }


    public void setFormListener(FormListener listener) {
        this.formListener = listener;
    }
}


class CategoriaEdad {

    private int id;
    private String text;

    public CategoriaEdad(int id, String text) {
        this.id = id;
        this.text = text;

    }

    @Override
    public String toString() {
        return text;
    }

    public int getId() {
        return id;
    }
}