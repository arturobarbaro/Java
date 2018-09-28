import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //  https://docs.oracle.com/javase/9/docs/api/java/util/ArrayList.html
        ArrayList<Integer> arrayList=new ArrayList<>();
        // arrayList.add(2&6&5&7); INTERESANTE
        arrayList.add(10);
        System.out.println(arrayList.get(0));

        //  https://docs.oracle.com/javase/9/docs/api/java/util/LinkedList.html#get-int-
        LinkedList<Integer> linkedList=new LinkedList<>();
        // linkedList.add(2|6);  INTERESANTE
        linkedList.add(2);
        System.out.println(linkedList.get(0));

    }
}
