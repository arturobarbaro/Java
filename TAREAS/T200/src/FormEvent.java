import javafx.beans.binding.ObjectExpression;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class FormEvent extends EventObject {
    private String nombre;
    private String puesto;
    private int edadCategoria;
    private String empCat;
    private String Dni;
    private Boolean nacionalidad;
    private String gender;


    public FormEvent(ActionListener actionListener, String nombre, String puesto, int id, String empCat, JCheckBox nacionalidad, String  gender, Object source) {
        super(source);


    }

    public FormEvent(Object source, String nombre, String puesto, int edad, String empleado, String dni, boolean nacionalidad) {
        super(source);

        this.nombre = nombre;
        this.puesto = puesto;
        this.edadCategoria = edad;
        this.empCat = empleado;
        this.Dni = dni;
        this.nacionalidad = nacionalidad;
        this.gender= gender;
    }


    public String getDni() {
        return getDni();
    }

    public boolean isNacionalidad() {
        return nacionalidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdadCategoria() {
        return edadCategoria;
    }

    public String getEmpCat() {
        return empCat;
    }

    public String getGender() {
        return gender;
    }
}
