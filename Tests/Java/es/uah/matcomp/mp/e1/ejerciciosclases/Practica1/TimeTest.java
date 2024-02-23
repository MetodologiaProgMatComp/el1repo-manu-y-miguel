package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Time.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time t1 = new Time(1,2,3);
        assertEquals(1, t1.getHour());

        Time t2 = new Time(24,60,60);
        assertEquals(0,t2.getHour());
    }

    @Test
    void getMinute() {
        Time t1 = new Time(1,2,3);
        assertEquals(2, t1.getMinute());

        Time t2 = new Time(24,60,60);
        assertEquals(0,t2.getMinute());
    }

    @Test
    void getSecond() {
        Time t1 = new Time(1,2,3);
        assertEquals(3, t1.getSecond());

        Time t2 = new Time(24,60,60);
        assertEquals(0,t2.getSecond());
    }

    @Test
    void setHour() {
        //Error
        int nuevaHora = 24;
        Time t1 = new Time(1,2,3);
        t1.setHour(nuevaHora);
        assertEquals(1,t1.getHour());
        //Valido
        int nuevaHora2 = 13;
        t1.setHour(nuevaHora2);
        assertEquals(13,t1.getHour());
    }

    @Test
    void setMinute() {
        //Error
        int nuevoMinuto = 60;
        Time t1 = new Time(1,2,3);
        t1.setMinute(nuevoMinuto);
        assertEquals(2,t1.getMinute());
        //Valido
        int nuevoMinuto2 = 34;
        t1.setMinute(nuevoMinuto2);
        assertEquals(34,t1.getMinute());
    }

    @Test
    void setSecond() {
        int nuevoSegundo = 60;
        Time t1 = new Time(1,2,3);
        t1.setSecond(nuevoSegundo);
        assertEquals(3,t1.getSecond());
        //Valido
        int nuevoSegundo2 = 34;
        t1.setSecond(nuevoSegundo2);
        assertEquals(34,t1.getSecond());
    }

    @Test
    void setTime() {
        Time t4 = new Time(1,2,3);
        int hora = 2;
        int minuto = 3;
        int segundo = 4;
        t4.setTime(hora,minuto,segundo);

        assertEquals(2,t4.getHour());
        assertEquals(3,t4.getMinute());
        assertEquals(4,t4.getSecond());
    }

    @Test
    void testToString() {
        Time t5 = new Time(3,4,5);
        String esperado = "3:4:5";
        String supuesto = t5.toString();
        assertEquals(esperado, supuesto);
    }

    @Test
    void nextSecond() {
        Time t1 = new Time(1,2,3);
        Time t2 = new Time(23,59,59);
        int secesp = 4;
        int secesp2 = 0;
        assertEquals(secesp,t1.nextSecond().getSecond());
        assertEquals(secesp2,t2.nextSecond().getSecond());
    }

    @Test
    void previousSecond() {
        Time t1 = new Time(1,2,3);
        Time t2 = new Time(0,0,0);
        int secesp = 2;
        int secesp2 = 59;
        assertEquals(secesp,t1.previousSecond().getSecond());
        assertEquals(secesp2,t2.previousSecond().getSecond());

    }
}