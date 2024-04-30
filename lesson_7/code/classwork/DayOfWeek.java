package classwork;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    System.out.println ("Input first letter of day week");
    //int number = scanner.nextInt();

        String firstletter = scanner.next();

    switch (firstletter) {
        case "mo" -> System.out.println("Monday");
        case "tu" -> System.out.println("Tuesday");
        case "we" -> System.out.println("Wendsday");
        case "th"-> System.out.println("Thursday");
        case "fr" -> System.out.println("Friday");
        case "sa" -> System.out.println("Saturday");
        case "su" -> System.out.println("Sunday");
    }

    }
}
