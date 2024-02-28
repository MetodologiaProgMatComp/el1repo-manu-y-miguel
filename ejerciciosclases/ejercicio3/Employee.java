package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio3;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int newid, String first, String last, int newsalary) {
        this.id = newid;
        this.firstName = first;
        this.lastName = last;
        this.salary = newsalary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName +" "+ lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int newsalary) {
        this.salary = newsalary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        this.salary= (int) (salary + ((double)percent/100 * salary));
        return salary;
    }
    public String toString() {
        return "Employee[id= " + id + ",name= " + firstName + ",lastname= " + lastName + ",salary= " + salary + "]";
    }
}