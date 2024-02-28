package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio6;
public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int newday) {
        this.day = newday;
    }
    public void setMonth(int newmonth) {
        this.month = newmonth;
    }
    public void setYear(int newyear) {
        this.year = newyear;
    }
    public void setDate(int newday, int newmonth, int newyear) {
        this.day = newday;
        this.month = newmonth;
        this.year = newyear;
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}