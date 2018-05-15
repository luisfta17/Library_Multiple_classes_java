import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Dry");
        book1 = new Book("Dry2");
    }

    @Test
    public void hasStock(){
        assertEquals(0, library.getStockSize());
    }
    @Test
    public void addBook(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getStockSize());
    }
    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }
    @Test
    public void canNotOverload(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getStockSize());
    }

    @Test
    public void findIndex(){
        library.addBook(book);
        library.addBook(book1);
        assertEquals(1, library.findIndex(book1));
    }

    @Test
    public void removeBook(){
        library.addBook(book);
        library.addBook(book1);
        library.removeBook(book);
        library.removeBook(book1);
        assertEquals(0, library.getStockSize());
    }
}
