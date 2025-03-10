package lesson03.ex3_6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        float x = ball.getX();
        float y = ball.getY();
        float radius = ball.getRadius();


        if (x - radius <= x1 || x + radius >= x2) {
            ball.reflectHorizontal();
            return true;
        }


        if (y - radius <= y1 || y + radius >= y2) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
