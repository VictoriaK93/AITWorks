package homework32;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class BookTest {

        @Test
        void testConstructor() {
            Book book = new Book(1234, "Java для начинающих", "Иван Иванов", "Программирование");
            assertEquals(1234, book.getId());
            assertEquals("Java для начинающих", book.getTitle());
            assertEquals("Иван Иванов", book.getAuthor());
            assertEquals("Программирование", book.getGenre());
        }

        @Test
        void testGettersAndSetters() {
            Book book = new Book(1234, "Java для начинающих", "Иван Иванов", "Программирование");

            book.getTitle("Python для начинающих");
            assertEquals("Python для начинающих", book.getTitle());

            book.getAuthor("Петр Петров");
            assertEquals("Петр Петров", book.getAuthor());

            book.getGenre("Web-разработка");
            assertEquals("Web-разработка", book.getGenre());
        }

        @Test
        void testToString() {
            Book book = new Book(1234, "Java для начинающих", "Иван Иванов", "Программирование");
            String expectedString = "Book{" +
                    "id=1234" +
                    ", title='Java для начинающих'" +
                    ", author='Иван Иванов'" +
                    ", genre='Программирование'" +
                    '}';
            assertEquals(expectedString, book.toString());
        }
    }

