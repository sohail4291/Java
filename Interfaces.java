interface PaymentGateway{
    void initiatePayment(double amount);
}

class StripePayment implements PaymentGateway{
    public void initiatePayment(double amount){
        System.out.println("processing stripe payment" + amount);
    }
}

class RazorpayPayment implements PaymentGateway{
    public void initiatePayment(double amount){
        System.out.println("Processing Razorpay Payment"+amount);
    }

}




class CheckoutService{
    PaymentGateway paymentGateway;
    public CheckoutService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public void setPaymentGateway(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public void checkout(double amount) {
        paymentGateway.initiatePayment(amount);
    }
}

public class Interfaces {
    public static void main(String[] args){
        PaymentGateway stripeGateway = new StripePayment();
        CheckoutService service = new CheckoutService(stripeGateway);
        service.checkout(120.50);
    }
}
