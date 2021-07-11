package day_61_execptions_collections;

public class InsufficientBalanceException
        extends RuntimeException  {
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
