package composicion_agregación.ejercicio1;

public class Book {
    private String name;
    private Author author;
    private int qty=0;
    private double price;
    private String isbn;
    public Book(String isbn,String name,Author author,double price){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;}
    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getIsbn() {return isbn;}
    public void setQty(int qty) {this.qty = qty;}
    public void setPrice(double price) {this.price = price;}
    public double getPrice() {return price;}
    public int getQty() {return qty;}
    public Author getAuthor() {return author;}
    public String getName() {return name;}
    public String getAuthorName(){return author.getName();}
    public String toString(){
        return "Book[isbn= "+isbn+",name= "+name+",Author[name= "+author.getName()+",email= "+author.getEmail()+"],price= "+price+",qty= "+qty+"]";
}}