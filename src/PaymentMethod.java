// Padrão Strategy para diferentes métodos de pagamento
public interface PaymentMethod {
    void pay(double amount);
}
