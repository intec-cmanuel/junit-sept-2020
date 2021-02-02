package be.intecbrussel.dynamic;

public class NegativeNumberInputException extends RuntimeException{
    public NegativeNumberInputException() {
    }

    public NegativeNumberInputException(String message) {
        super(message);
    }

    public NegativeNumberInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumberInputException(Throwable cause) {
        super(cause);
    }

    public NegativeNumberInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
