public interface Oviparo {
    void ponerHuevos();

    static void incubar(){
        System.out.println("...");
    }

    default void anidar(){
        System.out.println("...");
    }
}