import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReaderTest {
    Reader reader;
    Library library;
    Book book;
    Book book1;

    @Before
    public void before(){
        reader = new Reader("Katy");
        library = new Library(5);
        book = new Book("Dry");
        book1 = new Book("Dry2");
    }

    @Test
    public void hasName(){
        assertEquals("Katy", reader.getName());
    }
    @Test
    public void hasBooks(){
        assertEquals(0, reader.getCollectionSize());
    }
    @Test
    public void AddBook(){
        reader.collectBook(book);
       assertEquals(1, reader.getCollectionSize());
    }

    @Test
    public void getABookFromLibrary(){
        library.addBook(book);
        library.addBook(book1);
        reader.collectBookFromLibrary(library, book1);
        assertEquals(1, reader.getCollectionSize());
        assertEquals(1, library.getStockSize());

    }
}
