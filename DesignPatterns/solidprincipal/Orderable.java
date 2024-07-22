package DesignPatterns.solidprincipal;

interface Orderable
{
    void placeOrder();
}
interface Cancellable
{
    void cancelOrder();
}
class OnlineOrder implements Orderable,Cancellable
{

    @Override
    public void placeOrder()
    {
        System.out.println("Order placed online");

    }

    @Override
    public void cancelOrder()
    {
        System.out.println("Order cancelled");

    }
}
class StoreOrder implements Orderable
{
    @Override
    public void placeOrder() {
        System.out.println("Order placed in store.");
    }
}