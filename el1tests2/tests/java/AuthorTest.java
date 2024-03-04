import classes.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    @Test
    void getName() {
        Author auth = new Author("Gustavo","lospolloshermanos@gmail.com");
        String name = auth.getName();
        assertEquals(name,"Gustavo");
    }

    @Test
    void getEmail() {
        Author auth = new Author("Gustavo","lospolloshermanos@gmail.com");
        String email = auth.getEmail();
        assertEquals(email,"lospolloshermanos@gmail.com");
    }

    @Test
    void setEmail() {
        Author auth = new Author("Gustavo","lospolloshermanos@gmail.com");
        auth.setEmail("scolty@gmail.com");
        String email = auth.getEmail();
        assertEquals(email, "scolty@gmail.com");
    }

    @Test
    void testToString() {
        Author auth = new Author("Gustavo","lospolloshermanos@gmail.com");
        assertEquals("classes.Author[name= Gustavo,email= lospolloshermanos@gmail.com]",auth.toString());
    }
}