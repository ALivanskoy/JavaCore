package os.exeptions;

public class CustomerException extends RuntimeException {
    public CustomerException() {
        super("Customer not found");
    }
}
