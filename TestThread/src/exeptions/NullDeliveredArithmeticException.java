package exeptions;

public class NullDeliveredArithmeticException extends ArithmeticException{
    String message;

    public NullDeliveredArithmeticException(String message) {
        super(message);
        this.message = message;
    }
}
