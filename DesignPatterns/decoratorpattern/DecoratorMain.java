package DesignPatterns.decoratorpattern;



public class DecoratorMain {
    public static void main(String args[]) {
        Shape circle1 = new Circle("circle");
        Shape circlewithborder = new BorderDecorator(circle1, "red", 2);

        Shape circleWIthColorAndBorder = new ColorDecorator(circlewithborder, "blue");

        circleWIthColorAndBorder.draw();
    }
}
