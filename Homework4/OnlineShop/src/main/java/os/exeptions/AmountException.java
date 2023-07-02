package os.exeptions;

public class AmountException extends RuntimeException {
    public AmountException() {

        super("Invalid quantity");
    }
}
