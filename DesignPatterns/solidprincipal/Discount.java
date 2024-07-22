package DesignPatterns.solidprincipal;

public abstract class Discount
{
    public abstract double apply(double price);
}

class Nodiscount extends Discount
{
    public double apply(double price)
    {
        return price;
    }
}

class PercentageDiscount extends Discount
{
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    public double apply(double price)
    {
        return price-(price * percentage/100);
    }
}

class OrderProcessor
{
    public double processOrder(double price,Discount discount)
    {
        return discount.apply(price);
    }
}