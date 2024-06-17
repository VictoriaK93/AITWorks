package homework32;

import java.awt.*;

public interface LibraryMarafon {
    void addBook(Book book);

    Book getBookById(int id);

    List<Book> getBooksByAuthor(String author);

    void removeBook(int id);

    List<Book> getAllBooks();
}

