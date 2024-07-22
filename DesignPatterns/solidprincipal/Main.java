package DesignPatterns.solidprincipal;

public class Main
{
    public static void main(String args[])
    {
        PaymentMethod paymentMethod = new CreditCardPayment();
        Checkout checkout = new Checkout(paymentMethod);
        checkout.processPayment(100.0);

        Discount discount = new PercentageDiscount(10);
        OrderProcessorLSP orderProcessorLSP = new OrderProcessorLSP();
        System.out.println(orderProcessorLSP.processOrder(100,discount));
    }
}
