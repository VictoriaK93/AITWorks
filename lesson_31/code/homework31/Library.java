package homework31;

public interface Library {
    void addBook(Book book);
    void removeBook(Book book);
    Book findBookById(int id);
    List<Book> findBooksByAuthor(String author);

    List<Book> getAllBooks();
    // ... (другие методы)
}

