package exceptions;

public class WrongParametresNumberException extends Exception {
    public WrongParametresNumberException() {
    }

    public WrongParametresNumberException(String msg) {
        super(msg);
    }

    public WrongParametresNumberException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
