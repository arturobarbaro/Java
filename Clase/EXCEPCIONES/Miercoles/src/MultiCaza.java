public class MultiCaza {
    public static void main(String[] args) {
        try {
            m1();
            m2();
            m3();
        } catch (Personalizada2 | Personalizada | PersonalizadaRun e) {
            System.out.println(e.getMessage());
        }
    }

    private static void m1() throws Personalizada {
        throw new Personalizada("Eduardo");
    }

    private static void m2() throws Personalizada2 {
        throw new Personalizada2("Eduardo2");
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
