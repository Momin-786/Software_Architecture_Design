package model.filters;

public class PaymentFilter implements Filter {
    @Override
    public String process(String notification) {
        return notification + " [Payment Processed]";
    }
}
