package pl.bartek_ficek.two_sum;

public class NoSolutionException extends Exception {

    private static final String EXCEPTION_MESSAGE =
            "Correct solution doesn't exist at this example. Modify 'numbers' array or 'target' int";

    public NoSolutionException(String message) {
        super(message);
    }

    public NoSolutionException() {
        super(EXCEPTION_MESSAGE);
    }
}
