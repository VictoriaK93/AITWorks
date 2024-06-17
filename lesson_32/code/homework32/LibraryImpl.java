package homework32;


import java.util.ArrayList;
import java.util.List;

    public class LibraryImpl implements LibraryMarafon {

        private List<Book> books;

        public LibraryImpl() {
            this.books = new ArrayList<>();
        }

        @Override
        public void addBook(Book book) {
            books.add(book);
        }

        @Override
        public Book getBookById(int id) {
            for (Book book : books) {
                if (book.getId() == id) {
                    return book;
                }
            }
            return null;
        }

        @Override
        public List<Book> getBooksByAuthor(String author) {
            List<Book> booksByAuthor = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equals(author)) {
                    booksByAuthor.add(book);
                }
            }
            return booksByAuthor;
        }

        @Override
        public void removeBook(int id) {
            Book bookToRemove = getBookById(id);
            if (bookToRemove != null) {
                books.remove(bookToRemove);
            }
        }

        @Override
        public List<Book> getAllBooks() {
            return books;
        }
    }


