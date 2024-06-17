package homework31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    // Тесты для класса Book
    @Test
    public void testBookToString() {
        Book book = new Book(1, "Война и мир", "Лев Толстой", 1869);
        String expected = "Book{id=1, title='Война и мир', author='Лев Толстой', year=1869}";
        assertEquals(expected, book.toString());
    }
}
