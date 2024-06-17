package homework_36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Dublin", 800_000, "USA", 7.0);
        cities[1] = new City("Texas", 670_000, "USA", 7.5);
        cities[2] = new City("Chicago", 2_700_000, "USA", 6.0);
        cities[3] = new City("Atlanta", 470_000, "USA", 8.0);
        cities[4] = new City("New York", 8_500_000, "USA", 6.5);
        cities[5] = new City("Dallas", 1_300_000, "USA", 3.0);
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("==================" + title + "=====================");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testCityComparator() {
        Comparator<city_array.City> comparatorByName = (c1, c2) -> c1.getName().compareTo(c2.getName());
        printArray(cities, "Before sorting");
        Arrays.sort(cities); // native
        printArray(cities,"After sorting by name");



}
}





