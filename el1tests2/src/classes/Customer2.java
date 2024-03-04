package classes;

public class Customer2 {
    private int id;
    private String name;
    private char gender;
    public Customer2(int id,String name,char gender){
        this.id=id;
        this.name=name;
        this.gender=gender;}
    public int getId() {return id;}
    public String getName() {return name;}
    public char getGender() {return gender;}
    public String toString(){
        return name+"("+id+")("+gender+")";}}
