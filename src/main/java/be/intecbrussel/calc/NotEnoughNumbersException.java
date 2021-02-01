package be.intecbrussel.calc;

public class NotEnoughNumbersException extends RuntimeException{
    public NotEnoughNumbersException() {
    }

    public NotEnoughNumbersException(String message) {
        super(message);
    }

    public NotEnoughNumbersException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughNumbersException(Throwable cause) {
        super(cause);
    }

    public NotEnoughNumbersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
