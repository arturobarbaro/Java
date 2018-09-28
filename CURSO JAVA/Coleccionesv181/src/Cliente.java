import java.util.Objects;

public class Cliente {
    private String nombre;
    private String n_cuenta;
    private double saldo;

    public Cliente(String nombre, String n_cuenta, double saldo) {
        setNombre(nombre);
        setN_cuenta(n_cuenta);
        setSaldo(saldo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(n_cuenta, cliente.n_cuenta);
    }

    @Override
    public int hashCode() {

        return Objects.hash(n_cuenta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert nombre!=null;
        assert nombre.length()>0;
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        assert n_cuenta!=null;
        assert n_cuenta.length()>0;
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        assert saldo>=0;
        this.saldo = saldo;
    }
}
