interface Payment {
    void makePayment();
}

class CreditCardPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing credit card payment.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing PayPal payment.");
    }
}

class PaymentProcessor {
    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        payment.makePayment();
    }
}


public class cardPayments{
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        PaymentProcessor processor = new PaymentProcessor(creditCardPayment);
        processor.processPayment();

        Payment payPalPayment = new PayPalPayment();
        processor = new PaymentProcessor(payPalPayment);
        processor.processPayment();
    }
}
