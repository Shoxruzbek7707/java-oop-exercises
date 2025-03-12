package lesson04.ex4_4;

public class TestMain {
    public static void main(String[] args) {

        Point p1 = new Point(1.5f, 2.5f);
        System.out.println("Point testi: " + p1);


        Point p2 = new Point();
        System.out.println("Default Point testi: " + p2);


        MovablePoint mp1 = new MovablePoint(3.0f, 4.0f, 1.0f, 1.0f);
        System.out.println("MovablePoint testi: " + mp1);


        mp1.move();
        System.out.println("move() ishlatilgandan keyin: " + mp1);


        mp1.setSpeed(2.0f, 3.0f);
        System.out.println("setSpeed testi: " + mp1.getXSpeed() + ", " + mp1.getYSpeed());


        mp1.move();
        System.out.println("Yana move() ishlatilgandan keyin: " + mp1);
    }
}
