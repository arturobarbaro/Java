public class Personalizada
        extends Exception {
    public Personalizada() {
    }

    public Personalizada(String message) {
        super(message);
    }

    public Personalizada(String message, Throwable cause) {
        super(message, cause);
    }

    public Personalizada(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
