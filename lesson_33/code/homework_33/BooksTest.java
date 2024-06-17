package homework_33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {


    @BeforeEach
    void setUp() {

        Books[] books = new Books[4];
        books[0] = new Books(2020, "James Samel", "One", 12345678910123L);
        books[1] = new Books(2021, "Samanta Sevian", "Two", 1234567589123L);
        books[2] = new Books(2023, "Jenny Black", "Three", 56342741576723L);
        books[3] = new Books(2000, "Elias Babel", "Voyage", 87654352671348L);


      //  @Test
      //  void testBookSort () {
            System.out.println("======Test Book sorting ========");
         //   printArray(books);
            Arrays.sort(books);
            System.out.println("==========After sorting by Author========");
          //  printArray(books);
        }
        @Test
        void TestBookComparator () {
            Comparator<Books> booksComparator = new Comparator<Books>() {
                @Override
                public int compare(Books o1, Books o2) {
                    return o1.getYearOfPublishing() - o2.getYearOfPublishing();
                }
            };

            System.out.println("=======Test Book Sorting===========");
            //printArray(books);
           // System.out.println("===========After sorting by Year of Publishing==========");
           // Arrays.sort(books, booksComparator);
           // printArray(books);

            //public void printArray (Object[]array){
               // for (int i = 0; i < array.lenght; i++) {
                 //   System.out.println(array[i]);
                }
            }


