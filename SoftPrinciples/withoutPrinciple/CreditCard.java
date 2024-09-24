
class PaymentProcessor {
    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Processing credit card payment.");
        } else if (paymentMethod.equals("PayPal")) {
            System.out.println("Processing PayPal payment.");
        }
        // Any new payment method requires modification of this class.
    }
}

public class CreditCard {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CreditCard");
        processor.processPayment("PayPal");
    }
}
