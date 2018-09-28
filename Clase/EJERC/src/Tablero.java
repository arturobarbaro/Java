public class Tablero {
    private  Casilla[][] casillas;

    public Tablero(int n){
        casillas= new Casilla[n][n];
    }

    private void crearCasillas(){
        for (int i=0; i<casillas.length; i++){
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j]=new Casilla();
            }
        }
    }
    public void colocar(Ficha ficha, int i, int j){

    }
}
