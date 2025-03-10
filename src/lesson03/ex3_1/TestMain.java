package lesson03.ex3_1;

public class TestMain {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3, 4);
        MyComplex c2 = new MyComplex(1, -2);

        MyComplex c3 = c1.addNew(c2);

        System.out.println("Test 1:");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 + c2 (new object): " + c3);
        System.out.println();


        MyComplex zero = new MyComplex(0, 0);
        MyComplex c4 = c1.addNew(zero);

        System.out.println("Test 2:");
        System.out.println("c1 + (0+0i): " + c4); // (3.0 + 4.0i)
        System.out.println();


        MyComplex c5 = new MyComplex(-5, 6);
        MyComplex c6 = c1.addNew(c5);

        System.out.println("Test 3:");
        System.out.println("c1 + (-5+6i): " + c6);
        System.out.println();


        MyComplex c7 = c1.addNew(c1);

        System.out.println("Test 4:");
        System.out.println("c1 + c1: " + c7);
    }
}
