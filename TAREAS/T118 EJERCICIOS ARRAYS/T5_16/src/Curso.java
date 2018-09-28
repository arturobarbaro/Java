public class Curso
{
    private static final int MAXESTUDIANTES = 5;
    private static final int MAXASIGNATURAS = 3;
    private Alumnos[] estudiantes;
    private int[][] notas;
// Sentencias

    private void inicializarEstudiantes(){

    }

    private static void inicializarNotas(int[][] notas){
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++)
                notas[fila][columna] = (int) (Math.random() * 10 + 1);
        }
    }

    public float[] mediasA(){
        float contador [] = new float[notas.length];
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++)
                notas[fila][columna] += contador[fila]/notas[fila].length;
        }
        return contador;
    }

    public float mediasP(float[] pesos){
        assert notas!=null||pesos!=null: "Error: El array no puede ser nulo";
        assert notas.length>0||pesos.length>0: "Error: El array no puede estar vacio";
       // assert notas.length=pesos.length: "Error: Los arrays deben tener la misma longitud";
       // for (int i=0; i<pesos.length; i++)
        //    assert notas[i]<10: "Error: las notas no pueden ser mayor de 10";
        //for (int i=0; i<notas.length && i<pesos.length; i++)
           // assert notas[i]>0 ||pesos [i]>0: "Error: los valores contenidos en la raiz no pueden ser negativos";
        for (int i=0; i<notas.length; i++){
            double aux=0.0;
            //assert notas[i]>0 || pesos[i]>aux:"Error: los valores contenidos en la raiz no pueden ser negativos";
        }
        for (int i=0; i<notas.length && i<pesos.length; i++){
            double aux =0;
            aux+=pesos[i];
            assert aux==1: "El total de la array debe ser 1";
        }

        float media=0;

        //for (int i=0; i<notas.length; i++)
            //media+=notas[i]*(int[]) pesos[i]);

        //double media=aux;
        //media=(aux/a.length);
        return media;
    }

    /* public Alumnos[] suspensos(int x){
    return x;
    } */

}
