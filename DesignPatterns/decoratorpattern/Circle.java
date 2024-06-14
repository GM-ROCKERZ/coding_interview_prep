package DesignPatterns.decoratorpattern;

public class Circle implements Shape
{
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Circle, "+getName()+" ");

    }

    @Override
    public String getName() {
        return name;
    }
}
