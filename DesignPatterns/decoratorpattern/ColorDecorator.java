package DesignPatterns.decoratorpattern;

public class ColorDecorator extends ShapeDecorator
{
    private String color;

    public ColorDecorator(Shape decoratorShape, String color) {
        super(decoratorShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling with "+ color + " color to "+getName()+".");
    }
}
