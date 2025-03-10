package lesson03.ex3_4;

import java.time.format.DateTimeFormatter;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public MyTime nextSecond(){
        second++;
        if (second == 60){
            second = 0;
            minute++;
            if (minute == 60){
                minute = 0;
                hour = (hour + 1) % 24;
            }

        }
        return this;
    }

    public MyTime nextMinute(){
        minute++;
        if (minute == 60){
            minute = 0;
            hour = (hour + 1) % 24;
        }
        return this;
    }

    public MyTime nextHour(){
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousSecond(){
        second--;
        if (second == -1){
            second = 59;
            minute--;
            if (minute == -1){
                minute = 59;
                hour = (hour - 1 + 24) % 24;
            }
        }
        return this;
    }

    public MyTime previousMinute(){
        minute--;
        if (minute == -1){
            minute = 59;
            hour = (hour - 1 + 24) % 24;
        }
        return this;
    }

    public MyTime previousHour(){
        hour = (hour - 1 + 24) % 24;
        return this;
    }
}
