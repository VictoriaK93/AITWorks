package homework_35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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




    }
