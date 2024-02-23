package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year= year;
    }

    public int getDay() {
        if (day >= 1 && day <= 31) {
            return day;
        } else {
            System.out.println("Dia inválido");
            return 0;
        }
    }

    public int getMonth() {
        if(month>= 1 && month<= 12) {
            return month;
        } else {
            System.out.println("Mes invalido");
            return 0;
        }
    }

    public int getYear() {
        if(year>0) {
            return year;
        }else{
            System.out.println("Año invalido");
            return 0;
        }
    }


    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Dia inválido");
        }
    }

    public void setYear(int year) {
        if(year>0) {
            this.year = year;
        }else{
            System.out.println("Año invalido");
        }
    }

    public void setMonth(int month) {
        if(month>= 1 && month<= 12) {
            this.month = month;
        } else {
            System.out.println("Mes invalido");}
    }

    public void setDate(int day, int month, int year) {
        if(day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Dia inválido");
        }
        if(month>= 1 && month<= 12) {
            this.month = month;
        } else {
            System.out.println("Mes invalido");}
        if(year>0) {
            this.year = year;
        }else{
            System.out.println("Año invalido");
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
