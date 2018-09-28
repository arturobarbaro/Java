public class Encadenadas {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Mensaje: "+e.getMessage());
            System.out.println("Causa: "+e.getCause());
            System.out.println();
        }
    }

    private static void m1() throws Exception {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Mensaje: "+e.getMessage());
            System.out.println("Causa: "+e.getCause());
            System.out.println();
            throw new Exception("Director", e);
        }
    }

    private static void m2() throws Exception {
        try {
            m3();
        } catch (Exception e) {
            throw new Exception("Jefe de sección desde m2", e);
        }
    }

    private static void m3() throws Exception {
        throw new Exception("Electricista desde m3");
    }
}
