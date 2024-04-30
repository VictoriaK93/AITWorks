package ait.book.model;

public class Book {

        private long isbn;
        private String title;
        private String author;
        private int yearOfPublishing;

        public Book(long isbn, String title, String author, int yearOfPublishing) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.yearOfPublishing = yearOfPublishing;
        }

        public Book(long isbn, String title, int yearOfPublishing) {
            this(isbn, title, null, yearOfPublishing);  // Call constructor with author set to null
        }

        // Getters and setters (implement based on logic and necessity)

        public void display() {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year of Publishing: " + yearOfPublishing);
        }
    }

