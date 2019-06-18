package exceptions;

public class IllegalParametersException extends Exception {
    public IllegalParametersException() {
    }

    public IllegalParametersException(String msg) {
        super(msg);
    }

    public IllegalParametersException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
