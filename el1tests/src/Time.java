import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
        if (second == 60) {
            second = 0;
            minute += 1;
        }
        if (minute == 60) {
            minute = 0;
            hour += 1;
        }
        if (hour == 24) {
            hour = 00;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int newhour) {
        this.hour = newhour;
    }
    public void setMinute(int newminute) {
        this.minute = newminute;
    }
    public void setSecond(int newsecond) {
        this.second = newsecond;
    }
    public void setTime(int newhour, int newminute, int newsecond) {
        this.hour = newhour;
        this.minute = newminute;
        this.second = newsecond;
    }
    public String toString() {
        return  String.format("%02d:%02d:%02d", hour, minute, second);    }
    public Time nextSecond(){
        adjustTime();
        second++;
        return this;
    }
    public Time previousSecond(){
        adjustTime();
        second--;
        return this;
    }
    private void adjustTime() {
        if (second >= 60) {
            second = 0;
            minute++;
        }
        if (minute >= 60) {
            minute = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }
        if (second < 0) {
            second = 59;
            minute--;
        }
        if (minute < 0) {
            minute = 59;
            hour--;
        }
        if (hour < 0) {
            hour = 23;
        }
    }
}