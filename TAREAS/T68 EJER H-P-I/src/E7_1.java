public class E7_1 {

    public static void main(String[] args) {
        Casa c1 =new Casa(1.1);
        Casa c2 =new Casa(1.1);
        System.out.println(c1.compareTo(c2));
    }

}

class Casa implements Comparable<Casa>{
    private double superficie;

    public Casa(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public double compareTo(Casa o) {
        return this.superficie-o.superficie;
    }
}

interface Comparable<Casa>{
    double compareTo(Casa o);
}