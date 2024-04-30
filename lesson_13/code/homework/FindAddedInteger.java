package homework;

import java.util.Random;

public class FindAddedInteger {


        public static void main(String[] args) {
            int[] originalArray = new int[100];
            for (int i = 0; i < originalArray.length; i++) {
                originalArray[i] = i + 1;
            }

            // Generate a random integer between 1 and 100
            int addedInteger = new Random().nextInt(100) + 1;

            // Insert the random integer at a random location
            int randomIndex = new Random().nextInt(originalArray.length);
            originalArray[randomIndex] = addedInteger;

            // Find the added integer efficiently using XOR
            int xor = 0;
            for (int i = 1; i <= 100; i++) {
                xor ^= i;
            }
            for (int num : originalArray) {
                xor ^= num;
            }

            System.out.println("Added integer: " + xor);
        }
    }

