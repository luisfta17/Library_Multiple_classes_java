import java.util.ArrayList;

public class Reader {
    private ArrayList<Book> collection;
    private String name;

    public Reader(String name) {
        this.collection = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCollectionSize() {
        return this.collection.size();
    }

    public void collectBook(Book book) {
        this.collection.add(book);
    }

    public void collectBookFromLibrary(Library library, Book book) {
        Book collectedBook = library.removeBook(book);
        this.collectBook(collectedBook);

    }
}
