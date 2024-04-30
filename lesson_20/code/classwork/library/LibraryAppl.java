package classwork.library;

import classwork.library.controller.Library;
import model.Book;

public class LibraryAppl {
    public static void main(String[]args) {
        Library library = new Library(1000);

        library.addBook(new Book("Война и мир", "L.Tolstoi", 2020, 1000000000000L));
        library.addBook(new Book("Titel1","Author1", 2021, 2000000000000L));
        library.addBook(new Book("Titel2","Author2", 2023,3000000000000L));

        System.out.println(library.getSize());

        library.addBook(new Book("Title3", "Author3", 2020, 4000000000000L));
        System.out.println(library.getSize());

        library.printBooks();
    }
}
