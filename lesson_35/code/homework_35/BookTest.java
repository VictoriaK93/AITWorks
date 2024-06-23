package homework_35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book [] books;

    @BeforeEach
    void setUp() {
        books = new Book[5];
        books[0] = new Book("One", "Author1", 2000, 5678943567890L);
        books[1] = new Book("Monday", "Author2", 2021, 6789504567834L);
        books[2] = new Book("Life story", "Author5", 2015, 7895467893456L);
        books[3] = new Book("Million", "Author3", 2005, 5678932149683L);
        books[4] = new Book("Dream", "Author3", 2007, 9952368903451L);

    }

    private void printArray(Object[]arr, String reportTitle) {
        System.out.println("=======" + reportTitle + "=========");
        for (Object o : arr) {
            System.out.println(o);
        }
    }
    @Test
    void testPrint(){
        printArray(books, "List of our books that we placed in our setUp method");
    }

    @Test
    void testNativeSorting(){
        printArray(books, "List of our books that we placed in our setUp method");
        Arrays.sort(books); // native sorting
        printArray(books, "List of books sorted by author");
    }

    @Test
    void testComparator() {
        // Comparator<Book> comparator = (b1, b2) -> b1.getYearOfPublishing() - b2.getYearOfPublishing();
        Comparator<Book> comparator1 = (b1, b2) -> Integer.compare(b1.getYearOfPublishing(), b2.getYearOfPublishing());
        // lambda expression
        printArray(books, "Before sorting");
        Arrays.sort(books); // native sorting
        printArray(books, "After sorting by Author AND THEN by YearOfPublishing");
        Arrays.sort(books, comparator1);
        printArray(books, "After sorting by year of publishing");
    }
}





