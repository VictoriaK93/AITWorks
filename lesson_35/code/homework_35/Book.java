package homework_35;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int yearOfPublishing;
    private long isbn;

    public Book(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, isbn);
    }

   @Override
   public int compareTo(Book o) {
       int res = this.author.compareTo(o.author); // author sorting
       if (res != 0) {
           return res;

       } else {
           res = Integer.compare(this.yearOfPublishing, o.yearOfPublishing);
       }
       return res;
   }

   }


