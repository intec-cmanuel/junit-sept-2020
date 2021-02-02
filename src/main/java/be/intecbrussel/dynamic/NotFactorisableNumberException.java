package be.intecbrussel.dynamic;
public class NotFactorisableNumberException extends ArithmeticException {
    public NotFactorisableNumberException() {
    }

    public NotFactorisableNumberException(String s) {
        super(s);
    }
}