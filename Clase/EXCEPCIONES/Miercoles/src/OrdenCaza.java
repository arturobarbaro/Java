public class OrdenCaza {
    public static void main(String[] args) {
        try {
            m1();
            m2();
            m3();
        } catch (RuntimeException e) {
            System.out.println("Hay alguna excepción de tipo Runtime que no he cazado en el programa");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción no cazada en el programa");
            e.printStackTrace();
        }

    }

    private static void m1() throws Personalizada {
        throw new Personalizada("Eduardo");
    }

    private static void m2() throws Exception {
        throw new Exception("Eduardo2");
    }

    /**
     * Método m3
     *
     * @throws PersonalizadaRun Bla bla bla
     */
    private static void m3() {
        throw new PersonalizadaRun("Eduardo Run");
    }
}
