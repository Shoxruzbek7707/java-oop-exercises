package lesson03.ex2_8;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 5);
        MyCircle c2 = new MyCircle(new MyPoint(7, 8), 10);


        System.out.println(c1);
        System.out.println(c2);


        c1.setRadius(7);
        c1.setCenterXY(4, 4);
        System.out.println("Updated c1: " + c1);


        System.out.println("c1 Area: " + c1.getArea());
        System.out.println("c1 Circumference: " + c1.getCircumference());

        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}
