package DesignPatterns.solidprincipal;

public class OrderPrinter
{
    public void printOrder(Order order)
    {
        System.out.println("Product"+order.getProduct()+", Quantity: "+order.getQuantity());
    }
}
