// Padrão Singleton para garantir apenas uma instância do sistema de pagamento
public class PaymentSystem {
    private static PaymentSystem instance = new PaymentSystem();

    private PaymentSystem() {
        super();
    }

    public static PaymentSystem getInstance() {
        return instance;
    }

    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}