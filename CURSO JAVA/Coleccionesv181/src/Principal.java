import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Cliente cl1=new Cliente("Arturo Barba","1ESP0000001",85005);
        Cliente cl2=new Cliente("Laura Castellano","1ESP0000001",95005);
        Cliente cl3=new Cliente("Cristiano Ronaldo","1ESP0000041",2985005.90);
        Cliente cl4=new Cliente("John Cena","1USA0000234",0.01);

        Set <Cliente> clientesBanco=new HashSet<Cliente>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);

        mostrar(clientesBanco);
        borrar(clientesBanco,"John Cena");
        iteratorMostrar(clientesBanco);

    }

    private static void mostrar(Set<Cliente> clientesBanco){
        for (Cliente cliente:clientesBanco) {
            System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo());
        }
    }

    private static void iteratorMostrar(Set<Cliente> clientesBanco){
        Iterator<Cliente> it=clientesBanco.iterator();
        while (it.hasNext()){
            String nombre_cliente=it.next().getNombre();
            System.out.println(nombre_cliente);
        }
    }
    private static void borrar(Set<Cliente> clientesBanco, String clienteEliminado){
        // No podemos eliminar un objeto mientras recorremos la iteraccion
        /*for (Cliente cliente:clientesBanco) {
            if (cliente.getNombre().equals(a)){
                clientesBanco.remove(cliente);
            }
        }*/
        Iterator<Cliente> it=clientesBanco.iterator();
        while (it.hasNext()){
            String nombre_cliente=it.next().getNombre();
            if (nombre_cliente.equals(clienteEliminado)){
                it.remove();
            }
        }
    }
}
