package lesson03.ex3_5;

public class TestMain {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 1, 31);
        System.out.println("Initial Date: " + date); // 2024-01-31

        date.nextMonth();
        System.out.println("Next Month: " + date); // 2024-02-29 (kabisa yili)

        date.nextMonth();
        System.out.println("Next Month: " + date); // 2024-03-29

        date.previousMonth();
        System.out.println("Previous Month: " + date); // 2024-02-29

        date.nextYear();
        System.out.println("Next Year: " + date); // 2025-02-28 (kabisa yili emas)

        date.previousYear();
        System.out.println("Previous Year: " + date);
    }
}
