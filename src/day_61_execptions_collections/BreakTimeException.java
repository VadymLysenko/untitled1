package day_61_execptions_collections;

public class BreakTimeException extends RuntimeException {
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message); // calling parent constructor
    }
}
