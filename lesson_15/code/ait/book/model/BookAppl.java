package ait.book.model;

public class BookAppl {


        public static void main(String[] args) {
            Book book1 = new Book(1474567890123L, "Anna Karenina", "Lev Tolstoi", 1878);
            Book book2 = new Book(5676543210987L, "Little Prince", "Antuan de sent Exupery", 1943);
            Book book3 = new Book(8668013579246L, "Jack Jone's Stories", 1960); // Author not provided

            book1.display();
            System.out.println();

            book2.display();
            System.out.println();

            book3.display();
        }
    }

