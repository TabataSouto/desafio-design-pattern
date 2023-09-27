public class PaymentApp {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = PaymentSystem.getInstance();
        PaymentMethodFactory methodFactory = new PaymentMethodFactory();

        // Escolha o método de pagamento desejado (CreditCard ou PayPal)
        PaymentMethod method = methodFactory.createPaymentMethod("creditcard");
        paymentSystem.processPayment(method, 100.0);

        // Altere o método de pagamento para PayPal
        method = methodFactory.createPaymentMethod("paypal");
        paymentSystem.processPayment(method, 50.0);
    }
}
