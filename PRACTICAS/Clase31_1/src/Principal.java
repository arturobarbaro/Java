public class Principal {
    public static void main(String[] args) {
        String rojo=TipoColor.ROJO.toString();

        TipoColor[] colores=TipoColor.values();
        for (int i = 0; i < TipoColor.values().length; i++) {
            System.out.println(colores[i]);
            System.out.printf("colores[%d]: Nombre (name): %-10s\ttoString() %s\n", i, colores);
        }
    }
}
