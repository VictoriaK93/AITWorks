package classwork_33.wrapper2.cat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat[] cats;

    @BeforeEach
    void setUp() {

        Cat[] cat = new Cat[4];
        cat[0] =  new Cat(101, "Tishka", "brit", 5, 3.5);
        cat[1] =  new Cat(102, "Genny", "sfinks", 1, 1.2);
        cat[2] =  new Cat(103, "Murzik", "pers", 9, 5.0);
        cat[3] =  new Cat(104, "Motya", "maikun", 2, 8.5); 



    }

    @Test
    void testCatSort() {
        System.out.println("=========Test Cat sorting=======");
        printArray(cats);
        Arrays.sort(cats);
        System.out.println("-------After sorting by age------");

        printArray(cats);
    }

    @Test
    void testCatComparartor2() {
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return (int) (o1.getWeight() -o2.getWeight());
            }
        };

        System.out.println("=========Test Cat sorting by Comparator=======");
        printArray(cats); //печатаем как есть
        System.out.println("--------------------------");
        Arrays.sort(cats,catComparator); //сортируем
        printArray(cats); // печатаем после сортировки

    }


    @Test
    void testCatComparartor() {
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("=========Test Cat sorting by Comparator=======");
        printArray(cats); //печатаем как есть
        System.out.println("--------------------------");
        Arrays.sort(cats,catComparator); //сортируем
        printArray(cats); // печатаем после сортировки

    }

    public void printArray(Object[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


    }

    }
