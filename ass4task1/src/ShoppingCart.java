public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void changePaymentMethod(PaymentStrategy newPaymentStrategy) {
        this.paymentStrategy = newPaymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
