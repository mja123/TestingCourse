package Payment;

public interface PaymentGateway {

    PaymentResponse payment(PaymentRequest amount);
}
