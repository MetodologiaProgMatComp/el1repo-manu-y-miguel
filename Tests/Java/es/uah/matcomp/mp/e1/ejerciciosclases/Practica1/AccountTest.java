package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Account.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getID() {
        Account Pepe = new Account("223", "Pepe");
        assertEquals("223",Pepe.getID());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account Pepa = new Account("2", "Pepa");
        assertEquals("Pepa", Pepa.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        int balance = 1000;
        Account Pepo = new Account("2232","Pepo",balance);
        assertEquals(balance,Pepo.getBalance());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account account = new Account("123456", "John Doe");

        assertEquals(0, account.getBalance());

        int amount = 500;
        int NuevoBalance = account.credit(amount);
        assertEquals(NuevoBalance, account.getBalance());

        account.credit(500);
        assertEquals(1000, account.getBalance());

        account.credit(500);
        assertEquals(1500, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void debit() {
        //Con suficientte balance
        int BalanceInicial = 400;
        Account Ash = new Account("22", "Ashlie",BalanceInicial);

        int amount = 300;
        int BalanceNuevo = Ash.debit(amount);

        assertEquals(BalanceInicial-amount, BalanceNuevo);
        assertEquals(BalanceInicial-amount, Ash.getBalance());
        //Sin suficiente balance
        Account Marta = new Account("234","Marta");
        int amount2 = 100;

        assertEquals(0, Marta.debit(amount2)); //Debería de quedarse en 0
        assertEquals(0, Marta.getBalance()); //Es igual; debe de mantenerse en 0
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        //Con fondos suficientes
        int BalanceInicial1 = 800;
        int BalanceInicial2 = 200;
        Account ac1 = new Account("243", "Sooph", BalanceInicial1);
        Account ac2 = new Account("212", "Marc", BalanceInicial2);

        int amount = 400;
        int BalanceNuevo1 = ac1.transferTo(ac2, amount);

        assertEquals(BalanceInicial1 - amount, BalanceNuevo1);
        assertEquals(BalanceInicial1 - amount, ac1.getBalance());

        assertEquals(BalanceInicial2 + amount, ac2.getBalance());
        //Sin fondos suficientes
        Account acc1 = new Account("123", "JOSELITO", 300);
        Account acc2 = new Account("1234", "Marcille");

        int amount1 = 400;
        int BalanceNuevo2 = acc1.transferTo(acc2, amount1);

        assertEquals(300, BalanceNuevo2);
        assertEquals(300, acc1.getBalance());
        assertEquals(0, acc2.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Account account = new Account("123456", "John Doe", 1000);

        String expected = "Account[id=123456, name=John Doe, balance=1000]";
        String actual = account.toString();

        assertEquals(expected, actual);
    }
}