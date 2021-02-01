package be.intecbrussel.calc;

public class TooManyNumbersException extends RuntimeException {
    public TooManyNumbersException() {
    }

    public TooManyNumbersException(String message) {
        super(message);
    }

    public TooManyNumbersException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyNumbersException(Throwable cause) {
        super(cause);
    }

    public TooManyNumbersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
