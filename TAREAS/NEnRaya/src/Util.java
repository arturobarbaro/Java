public class Util {
    private Util() {};

    public static boolean esNumero(String s) {
        try {
            Double numero = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static String linea(int n) {
        String texto = new String();
        for (int i = 0; i < n; i++) {
            texto += "-";
        }
        return texto;
    }
}
