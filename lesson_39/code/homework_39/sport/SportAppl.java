package homework_39.sport;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class SportAppl {

        public static void main(String[] args) {
            List<Sportsmen> results = new ArrayList<>();
            results.add(new Sportsmen("LN1", "N1", 100, "Club1", 10.2));
            results.add(new Sportsmen("LN2", "N2", 900, "Club2", 9.8));
            results.add(new Sportsmen("LN3", "N3", 505, "Club1", 10.0));
            results.add(new Sportsmen("LN4", "N4", 110, "Club2", 11.2));
            results.add(new Sportsmen("LN5", "N5", 97, "Club2", 9.9));
            results.add(new Sportsmen("LN6", "N6", 13, "Club1", 10.5));

            // print menu
            // input number of participants
            // input results one by one

            System.out.println("--------Unsorted List------------");

            // печать списка в столбик
            for (Sportsmen s : results) {
                System.out.println(s);
            }

            results.sort(Sportsmen::compareTo);
            System.out.println("--------Sorted List------------");
            // печать списка в столбик
            for (Sportsmen s : results) {
                System.out.println(s);
            }

        }
    }



