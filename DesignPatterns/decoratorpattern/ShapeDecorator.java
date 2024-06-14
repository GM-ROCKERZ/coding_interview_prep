package DesignPatterns.decoratorpattern;

public class ShapeDecorator implements Shape
{
    private Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw()
    {
       decoratorShape.draw();
    }

    @Override
    public String getName() {
        return decoratorShape.getName();
    }
}
