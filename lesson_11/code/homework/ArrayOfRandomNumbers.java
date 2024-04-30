package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOfRandomNumbers {
    public static boolean searchInArray(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(41) - 20; // Generates random numbers in the range [-20, 20]
        }
        System.out.println("Generated array: " + Arrays.toString(randomNumbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int targetNumber = scanner.nextInt();

        if (searchInArray(randomNumbers, targetNumber)) {
            System.out.println(targetNumber + " was found in the array.");
        } else {
            System.out.println(targetNumber + " was not found in the array.");
        }
    }
}
