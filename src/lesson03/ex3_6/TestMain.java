package lesson03.ex3_6;

public class TestMain {
    public static void main(String[] args) {
        Container container = new Container(0, 0, 100, 100);
        Ball ball = new Ball(50, 50, 5, 5, 5);

        System.out.println("=== INITIAL STATE ===");
        System.out.println(container);
        System.out.println(ball);


        for (int i = 0; i < 10; i++) {
            ball.move();
            boolean collided = container.collides(ball);
            System.out.println("Step " + (i + 1) + ": " + ball + (collided ? " (Collision!)" : ""));
        }
    }
}
