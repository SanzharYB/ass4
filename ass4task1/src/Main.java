public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("5444445445", "Yesbossynov Sanzhar");
        ShoppingCart cart = new ShoppingCart(creditCardPayment);
        cart.checkout(100.0);

        PaymentStrategy payPalPayment = new PayPalPayment("yesbossynovsanzhar@privet.com");
        cart.changePaymentMethod(payPalPayment);
        cart.checkout(150.0);

        PaymentStrategy cryptoPayment = new CryptoPayment("fdsfadfsfadasdaa");
        cart.changePaymentMethod(cryptoPayment);
        cart.checkout(200.0);
    }
}
