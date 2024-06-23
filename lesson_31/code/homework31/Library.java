package homework31;

public interface Library {
    void addBook(Book book);

    void removeBook(Book book);

    Book findBookById(int id);
}

