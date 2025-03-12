package lesson04.ex4_6;

public class TestMain {
    public static void main(String[] args) {
        Animal cat = new Cat("Baroqvoy");
        Animal dog = new Dog("Kopak");
        Dog anotherDog = new Dog("Rexs");

        System.out.println(cat);
        ((Cat) cat).greets();

        System.out.println(dog);
        ((Dog) dog).greets();
        ((Dog) dog).greets(anotherDog);
    }
}
