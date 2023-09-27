public class PaymentMethodFactory {
    public PaymentMethod createPaymentMethod(String methodType) {
        if ("creditcard".equalsIgnoreCase(methodType)) {
            return new CreditCardPayment();
        } else if ("paypal".equalsIgnoreCase(methodType)) {
            return new PayPalPayment();
        }
        return null;
    }
}
