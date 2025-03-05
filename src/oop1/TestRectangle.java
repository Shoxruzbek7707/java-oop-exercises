package oop1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.println("rectangle1 getArea() ---> " + rectangle1.getArea());
        System.out.println("rectangle1 getPerimeter() ---> " + rectangle1.getPerimeter());

        System.out.println("rectangle2getArea() ---> " + rectangle2.getArea());
        System.out.println("rectangle2 getPerimeter() ---> " + rectangle2.getPerimeter());
    }
}
