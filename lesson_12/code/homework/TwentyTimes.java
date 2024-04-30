package homework;

import java.util.Random;

public class TwentyTimes {
    public static void rollDieTwentyTimes() {
        int[] counts = new int[6]; // Array to count occurrences
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int roll = random.nextInt(6) + 1; // Generate a random roll (1-6)
            counts[roll - 1]++; // Increment the count for the corresponding roll
        }

        // Calculate and print probabilities
        for (int i = 0; i < 6; i++) {
            double probability = (double) counts[i] / 20;
            System.out.printf("Probability of %d: %.2f\n", i + 1, probability);
        }
    }
}
