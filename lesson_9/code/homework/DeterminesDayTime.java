package homework;

import java.util.Scanner;

public class DeterminesDayTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current hour (0-23): ");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour < 12) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon!");
        } else if (hour >= 18 && hour < 21) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
    }
}

