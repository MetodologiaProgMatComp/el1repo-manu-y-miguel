package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hora, int minuto, int segundo){     //Constructor que crea un objeto de la clase time
        hour = hora;
        minute = minuto;
        second = segundo;
    }

    public int getHour() {
        if(hour>=0 && hour<=23) {
            return hour;
        } else {
            System.out.println("Hora invalida");
            return 0;}
    }

    public int getMinute() {
        if(minute >=0 && minute<= 59) {
            return minute;
        } else {
            System.out.println("Minuto invalido");
            return 0;
        }
    }

    public int getSecond() {
        if(second>=0 && second<=59) {
            return second;
        } else {
            System.out.println("Segundo invalido");
            return 0;
        }
    }

    public void setHour(int hour) {
        if(hour>=0 && hour<=23) {
            this.hour = hour;
        } else {
            System.out.println("Hora invalida");}
    }

    public void setMinute(int minute) {
        if(minute >=0 && minute<= 59) {
            this.minute = minute;
        } else {
            System.out.println("Minuto invalido");}
    }

    public void setSecond(int second) {
        if(second>=0 && second<=59) {
            this.second= second;
        } else {
            System.out.println("Segundo invalido");}
    }
    public void setTime(int hora, int minuto, int segundo) {
        this.hour= hora;
        this.minute= minuto;
        this.second= segundo;
    }
    public String toString() {
        return hour +":" + minute + ":" + second;
    }
    public Time nextSecond() {
        int newSecond = this.second + 1;
        if (newSecond >= 60) {
            newSecond = 0;
            this.minute++;
            if (this.minute >= 60) {
                this.minute = 0;
                this.hour = (this.hour + 1) % 24;
            }
        }
        return new Time(this.hour, this.minute, newSecond);
    }
    public Time previousSecond() {
        int newSecond = this.second - 1;
        if (newSecond < 0) {
            newSecond = 59;
            this.minute--;
            if (this.minute < 0) {
                this.minute = 59;
                this.hour = (this.hour - 1 + 24) % 24;
            }
        }
        return new Time(this.hour, this.minute, newSecond);
    }
}
