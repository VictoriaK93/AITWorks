package homework_29;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
        private List<Book> books = new ArrayList<>();

        static class Book {
            String title;
            String author;
            int year;

            Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            @Override
            public String toString() {
                return title + " by " + author + ", " + year;
            }
        }

        void addBook(String title, String author, int year) {
            this.books.add(new Book(title, author, year));
        }

        class Iterator {
            private int cursor = 0;

            public Book nextBook() {
                if (cursor < books.size()) {
                    Book book = books.get(cursor);
                    cursor++;
                    return book;
                } else {
                    return null;
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Book book : books) {
                sb.append(book).append("\n");
            }
            return sb.toString();
        }
    }

