package Payment;

public class PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean payment(double amount) {
        PaymentResponse response = gateway.payment(new PaymentRequest(amount));
        return response.getStatus() == PaymentResponse.PaymentStatus.OK;
    }
}
