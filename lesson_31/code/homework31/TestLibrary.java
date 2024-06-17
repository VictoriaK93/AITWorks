package homework31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLibrary {
    // Тесты для интерфейса Library
    @Test
    public void testLibraryAddBook() {
        Library library = new LibraryImpl();
        Book book = new Book(1, "Война и мир", "Лев Толстой", 1869);
        library.addBook(book);

        List<Book> books = library.getAllBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

}
