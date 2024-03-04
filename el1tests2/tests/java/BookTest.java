import classes.Author;
import classes.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class BookTest {

    @Test
    void getIsbn() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        String isbn = book.getIsbn();
        assertEquals(isbn,"0-061-96436-0");
    }

    @Test
    void setQty() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        book.setQty(2);
        double qty = book.getQty();
        assertEquals(qty, 2);
    }

    @Test
    void setPrice() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        book.setPrice(30);
        double prz = book.getPrice();
        assertEquals(prz, 30);
    }

    @Test
    void getPrice() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        double prz = book.getPrice();
        assertEquals(prz,22);
    }

    @Test
    void getQty() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        double qty = book.getQty();
        assertEquals(qty,30);
    }

    @Test
    void getAuthor() {
        Author auth = new Author ("Gustavo","lospolloshermanos@gmail.com");
        Book book = new Book("0-061-96436-0","Liais",auth,22,30);
        assertEquals(book.getAuthor(),auth);
    }

    @Test
    void getName() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        String name = book.getName();
        assertEquals(name,"Liais");
    }

    @Test
    void getAuthorName() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        Author auth = book.getAuthor();
        String name = auth.getName();
        assertEquals(name,"Gustavo");
    }

    @Test
    void testToString() {
        Book book = new Book("0-061-96436-0","Liais",new Author("Gustavo","lospolloshermanos@gmail.com"),22,30);
        assertEquals(book.toString(),"Book[isbn= 0-061-96436-0,name= Liais, Author[name= Gustavo,email= lospolloshermanos@gmail.com],price= 22.0,qty= 30]");
    }
}