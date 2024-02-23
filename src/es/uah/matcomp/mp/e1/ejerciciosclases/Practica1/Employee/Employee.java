package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int i, String fN, String lN, int sy){
        id=i;
        firstName= fN;
        lastName=lN;
        salary=sy;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public void setSalary( int newSalary){
        salary = newSalary;
    }
    public int raiseSalary( int percent){
        int plusSalary = (salary *percent)/100;
        return salary + plusSalary;
    }
    public String toString(){
        return "Employee[id= " + id + ", name = " + firstName +" " + lastName + ", salary = " + salary + "]";
    }


}
