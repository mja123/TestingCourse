package Payment;

public class PaymentResponse {
    enum PaymentStatus {
        OK, ERROR;
    }

    private PaymentStatus status;

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
