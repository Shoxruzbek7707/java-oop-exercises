package lesson03.ex3_2;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(3, 2, 1);
        MyPolynomial p2 = new MyPolynomial(1, 2, 3, 4);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Degree of p2: " + p2.getDegree());

        System.out.println("p1(2): " + p1.evaluate(2));
        System.out.println("p2(2): " + p2.evaluate(2));

        MyPolynomial sum = p1.add(p2);
        System.out.println("p1 + p2: " + sum);

        MyPolynomial product = p1.multiply(p2);
        System.out.println("p1 * p2: " + product);
    }
}

