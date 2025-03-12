package lesson04.ex4_5;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0, "purple", true);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());


        Rectangle rectangle = new Rectangle(4.0, 6.0, "orange", false);
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.getArea());


        Square square = new Square(5.0, "pink", true);
        System.out.println(square);
        System.out.println("Square Area: " + square.getArea());


        Shape shape1 = new Circle(3.5, "cyan", false);
        Shape shape2 = new Rectangle(2.5, 4.5, "magenta", true);
        Shape shape3 = new Square(6.0, "black", false);

    }
}
