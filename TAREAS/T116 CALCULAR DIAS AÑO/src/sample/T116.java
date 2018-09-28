package sample;

public class T116 {


    public static void main(String[] args) {

        mostrar(totalDias(1, 1, 2014));
    }

    public static int totalDias(int dia, int mes, int anio) {
        comprobar_dias(dia, mes, anio);
        assert mes < 13 : "Error: Introduzca un mes valido";
        assert mes > 0 : "Error: Introduzca un mes valido";
        assert anio < 2018 : "Error: el año no puede ser futuro";

        return calcular_dias(dia, mes, anio);
    }

    private static void comprobar_dias(int dia, int mes, int anio){
        assert dia > 0 : "Error: Introduzca un dia valido";
        assert dia < 32 : "Error: Introduzca un dia valido";
        if (mes == 2) {
            assert dia < 29 : "Error: Introduzca un dia valido";
            if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0))
                assert dia < 30 : "Error: Introduzca un dia valido";
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            assert dia < 31 : "Error: Introduzca un dia valido";

    }

    private static int calcular_dias(int dia, int mes, int anio){
        comprobar_dias(dia, mes, anio);
        assert mes < 13 : "Error: Introduzca un mes valido";
        assert mes > 0 : "Error: Introduzca un mes valido";
        assert anio < 2018 : "Error: el año no puede ser futuro";
        // Comprobamos de nuevo los parametros (no es necesario) por si llamamos al metodo con otro metodo

        int totalDias = 0;
        int anioActual = 2018;
        int a=anioActual-anio;

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            diasMes[1] = 29;

        for (int i = 0; anio < anioActual; i++) {
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                diasMes[1] = 29;
            totalDias += diasMes[0] + diasMes[1] + diasMes[2] + diasMes[3] + diasMes[4] + diasMes[5] + diasMes[6] + diasMes[7] + diasMes[8] + diasMes[9] + diasMes[10] + diasMes[11];
            anio++;
        }

        for (int i = mes-1; i > 0; i--) {
             totalDias += diasMes[i];
            }
        totalDias+=dia;
        return totalDias;
    }

    public static void mostrar(int a) {
        System.out.print(a);
    }
}