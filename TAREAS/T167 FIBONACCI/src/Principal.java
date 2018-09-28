public class Principal {
    public static void main(String[] args) {

    }



    private static int fibonaci(int n){
        if(n==1 || n==2) {
            return 1;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }


}
