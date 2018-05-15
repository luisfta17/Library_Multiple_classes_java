import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Name of the Wind");
    }

    @Test
    public void hasName(){
        assertEquals("Name of the Wind", book.getName());
    }
}
