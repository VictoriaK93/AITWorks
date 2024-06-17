package homework_33;

import java.util.Objects;

public class Books implements Comparable<Books> {

    private int yearOfPublishing;
    private String author;
    private String title;
    private long isbn;

    public Books(int yearOfPublishing, String author, String title, long isbn) {
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Books{" +
                "yearOfPublishing=" + yearOfPublishing +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books books)) return false;
        return yearOfPublishing == books.yearOfPublishing && isbn == books.isbn && Objects.equals(author, books.author) && Objects.equals(title, books.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfPublishing, author, title, isbn);
    }



    @Override
    public int compareTo(Books o) {
        int res = this.getAuthor().compareTo(o.getAuthor());
        return res;
    }
    /// djshgjhgwbdkjhgk
    }

