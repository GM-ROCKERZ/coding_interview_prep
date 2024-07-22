package DesignPatterns.solidprincipal;

public class OrderProcessorLSP
{
    public double processOrder(double price,Discount discount)
    {
        return discount.apply(price);
    }
}
