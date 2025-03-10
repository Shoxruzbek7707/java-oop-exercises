package lesson03.ex2_9;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("Triangle 1: " + t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());
        System.out.println();


        MyTriangle t2 = new MyTriangle(1, 1, 5, 1, 3, 4);
        System.out.println("Triangle 2: " + t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());
        System.out.println();


        MyTriangle t3 = new MyTriangle(new MyPoint(0, 0), new MyPoint(4, 0), new MyPoint(2, 3));
        System.out.println("Triangle 3: " + t3);
        System.out.println("Perimeter: " + t3.getPerimeter());
        System.out.println("Type: " + t3.getType());
        System.out.println();
    }
}
