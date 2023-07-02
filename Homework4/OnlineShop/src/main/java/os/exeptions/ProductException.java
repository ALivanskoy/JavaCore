package os.exeptions;

public class ProductException extends RuntimeException {
    public ProductException() {
        super("Product not found");
    }
}
