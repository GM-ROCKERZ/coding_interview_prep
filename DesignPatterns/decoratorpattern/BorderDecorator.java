package DesignPatterns.decoratorpattern;

public class BorderDecorator extends ShapeDecorator
{
    private String color;
    private int widthInPxs;

    public BorderDecorator(Shape decoratorShape, String color, int widthInPxs) {
        super(decoratorShape);
        this.color = color;
        this.widthInPxs = widthInPxs;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding "+widthInPxs + "px "+color+ "color border to "+getName()+" ");
    }

}
