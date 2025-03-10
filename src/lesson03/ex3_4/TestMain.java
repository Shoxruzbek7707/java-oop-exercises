package lesson03.ex3_4;

public class TestMain {
    public static void main(String[] args) {

        MyTime time1 = new MyTime();
        System.out.println("Initial Time (Default Constructor): " + time1); // 00:00:00


        MyTime time2 = new MyTime(23, 59, 59);
        System.out.println("Initial Time (Custom Constructor): " + time2); // 23:59:59


        time2.nextSecond();
        System.out.println("After nextSecond(): " + time2); // 00:00:00


        time2.previousSecond();
        System.out.println("After previousSecond(): " + time2); // 23:59:59


        time1.nextMinute();
        System.out.println("After nextMinute(): " + time1);

        time1.previousMinute();
        System.out.println("After previousMinute(): " + time1); // 00:00:00


        time1.nextHour();
        System.out.println("After nextHour(): " + time1); // 01:00:00


        time1.previousHour();
        System.out.println("After previousHour(): " + time1); // 00:00:00


        time1.setHour(12);
        time1.setMinute(30);
        time1.setSecond(45);
        System.out.println("After setHour(12), setMinute(30), setSecond(45): " + time1); // 12:30:45
    }
}

