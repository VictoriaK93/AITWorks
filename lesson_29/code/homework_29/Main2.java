package homework_29;

import books.model.Book;
import homework_29.BookShelf;

public class Main2 {

        public static void main(String[] args) {
            BookShelf bookShelf = new BookShelf();
            bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
            bookShelf.addBook("Мастер и Маргарита", "Михаил Булгаков", 2024);
            bookShelf.addBook("Преступление и наказание", "Фёдор Достоевский", 2024);
            bookShelf.addBook("Собачье сердце", "Михаил Булгаков", 2024);

            System.out.println("Книжная полка:");
            System.out.println(bookShelf);

            BookShelf.Iterator iterator = bookShelf.new Iterator();
            Book book;

            while ((book = iterator.nextBook()) != null) {
                System.out.println("Следующая книга: " + book);
            }
            System.out.println("Больше книг на полке нет.");
        }
    }

