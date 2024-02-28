import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.getId(), 3);
    }

    @Test
    void getFirstName() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.getFirstName(), "Saul");
    }

    @Test
    void getLastName() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.getLastName(), "Goodman");
    }

    @Test
    void getName() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.getName(), "Saul Goodman");
    }

    @Test
    void getSalary() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
    }

    @Test
    void setSalary() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        empl.setSalary(1700);
        assertEquals(empl.getSalary(), 1700);
    }

    @Test
    void getAnnualSalary() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.getAnnualSalary(), 14400);
    }

    @Test
    void raiseSalary() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.raiseSalary(30), 1560);
    }

    @Test
    void testToString() {
        Employee empl = new Employee(3, "Saul", "Goodman", 1200);
        assertEquals(empl.toString(), "Employee[id= 3,name= Saul,last name= Goodman,salary= 1200]");
    }
}