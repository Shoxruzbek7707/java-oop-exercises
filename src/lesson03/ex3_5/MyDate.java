package lesson03.ex3_5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public int[] DaysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int getDaysInMonth(int year, int month) {
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public MyDate nextDay(){
        day++;
       if (day > getDaysInMonth(year,month)){
           day = 1;
           nextMonth();
       }
       return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }

            int maxDays = getDaysInMonth(year,month);

            if (day > maxDays){
                day = maxDays;
            }
        }
        return this;
    }

    public MyDate nextMonth(){
        month++;
        if (month > 12){
            month = 1;
            year++;
        }
        int maxDays = getDaysInMonth(year,month);

        if (day > maxDays){
            day = maxDays;
        }
        return this;
    }

    public MyDate previousMonth(){
        month--;
        if (month < 1){
            month = 12;
            year--;
        }
        int maxDays = getDaysInMonth(year,month);
        if (day > maxDays){
            day = maxDays;
        }
        return this;
    }

    public MyDate nextYear(){
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)){
            day = 28;
        }
        return this;
    }

    public MyDate previousYear(){
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)){
            day = 28;
        }
        return this;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
