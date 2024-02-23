package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Date.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date dat1 = new Date(22,3,2003);

        assertEquals(22, dat1.getDay());
    }

    @Test
    void getMonth() {
        Date dat1 = new Date(22,3,2003);

        assertEquals(3,dat1.getMonth());
    }

    @Test
    void getYear() {
        Date dat1 = new Date(22,3,2003);

        assertEquals(2003, dat1.getYear());
    }

    @Test
    void setDay() {
        Date dat1 = new Date(22,3,2003);
        int newDay = 33;
        dat1.setDay(newDay);

        assertEquals(22, dat1.getDay()); //Como el dia es invalido mantiene el inicial

        int nuevoDay = 24;
        dat1.setDay(nuevoDay);

        assertEquals(24,dat1.getDay()); //El dia es valido y se cambia
    }

    @Test
    void setYear() {
        Date dat1 = new Date(22,3,2003);
        int newYear = -1234;
        dat1.setYear(newYear);

        assertEquals(2003, dat1.getYear()); //Como el año es invalido mantiene el inicial

        int nuevoAno = 2004;
        dat1.setYear(nuevoAno);

        assertEquals(2004,dat1.getYear()); //El año es valido y se cambia
    }

    @Test
    void setMonth() {
        Date dat1 = new Date(22,3,2003);
        int newMonth = 33;
        dat1.setMonth(newMonth);

        assertEquals(3, dat1.getMonth()); //Como el mes es invalido mantiene el inicial

        int nuevoMes = 12;
        dat1.setMonth(nuevoMes);

        assertEquals(12,dat1.getMonth()); //El mes es valido y se cambia
    }

    @Test
    void setDate() {
        Date dat3 = new Date(22,3,2003);
        int newDay = 30;
        int newMonth = 1;
        int newYear = 2005;
        dat3.setDate(newDay,newMonth,newYear);
        assertEquals(30,dat3.getDay());
        assertEquals(1,dat3.getMonth());
        assertEquals(2005,dat3.getYear());
    }

    @Test
    void testToString() {
        Date datf = new Date(30,1,2003);
        String esperado = "30/1/2003";
        String supuesto = datf.toString();

        assertEquals(esperado,supuesto);
    }
}