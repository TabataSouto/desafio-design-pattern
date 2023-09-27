public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de $" + amount + " efetuado com cartão de crédito.");
    }
}
