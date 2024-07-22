package DesignPatterns.solidprincipal;

public interface PaymentMethod
{
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod
{

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+"using credit card");
    }
}
class PayPalPayment implements PaymentMethod
{

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount +"using Paypal");
    }
}

class Checkout
{
    private PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void processPayment(double amount)
    {
        paymentMethod.pay(amount);
    }
}
